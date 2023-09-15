package guia5grupo81.accesoadatos;

import guia5grupo81.entidades.Alumnos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    /*constructor*/
    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumnos alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }

    public void modificarAlumno(Alumnos alumno) {
        String sql = "UPDATE alumno SET  dni=?, apellido=?, nombre=?, fechaNacimiento=?"
                + "WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));

            ps.setInt(5, alumno.getIdAlumno());

            /*El valor de retorno filasAfectadas es útil para verificar si 
            la operación se realizó con éxito y para saber cuántas filas 
            se vieron afectadas por la consulta. Si filasAfectadas es 
            igual a 0, podría indicar que la operación no tuvo ningún 
            impacto (por ejemplo, en una consulta DELETE, si no se 
            encontraron registros que cumplan con la condición). 
            En el caso de una consulta INSERT, un valor de 1 generalmente 
            significa que se insertó un nuevo registro correctamente.*/
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la base de datos correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }

    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado=0 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la base de datos correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al alumno");

        }

    }
}
