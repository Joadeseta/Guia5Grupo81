package guia5grupo81.accesoadatos;

import guia5grupo81.entidades.Alumnos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*Este código define la clase AlumnoData que se utiliza para interactuar 
con la base de datos relacionada con la entidad Alumnos. 
Proporciona métodos para guardar, modificar, eliminar, buscar y listar alumnos en la base de datos. 
Cada método realiza operaciones SQL correspondientes y muestra mensajes de confirmación
o error según sea necesario.*/


public class AlumnoData {

    private Connection con = null;

    // Constructor que inicializa la conexión a la base de datos al crear una instancia de AlumnoData.
    public AlumnoData() {
        con = Conexion.getConexion();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }
    }

    /*GUARDAR ALUMNO*/
    // Método para guardar un objeto Alumnos en la base de datos.
    // Código SQL para insertar un nuevo alumno en la tabla 'alumno'.
    // Se utiliza PreparedStatement para evitar problemas de seguridad y SQL Injection.
    // También se obtiene el ID generado para el nuevo alumno.
    // Se muestra un mensaje de confirmación si se realiza la inserción correctamente.
    public void guardarAlumno(Alumnos alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
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

    /*MODIFICAR ALUMNO*/
    // Método para modificar un objeto Alumnos en la base de datos.
    // Código SQL para actualizar los datos de un alumno en la tabla 'alumno'.
    // Se utiliza PreparedStatement y se verifica si la actualización fue exitosa.
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

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la base de datos correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }

    }

    // Método para eliminar un alumno de la base de datos (cambia su estado a inactivo).
    // Código SQL para cambiar el estado de un alumno a inactivo en la tabla 'alumno'.
    // Se verifica si la operación fue exitosa.
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

    // Método para buscar un alumno por su ID en la base de datos.
    // Código SQL para buscar un alumno por su ID en la tabla 'alumno'.
    // Se crea un objeto Alumnos con los datos obtenidos de la consulta.
    public Alumnos buscarAlumno(int id) {

        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno=?";
        Alumnos alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumnos();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese ID");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
        return alumno;
    }

    // Método para buscar un alumno por su DNI en la base de datos.
    // Código SQL para buscar un alumno por su DNI en la tabla 'alumno'.
    // Se crea un objeto Alumnos con los datos obtenidos de la consulta.
    public Alumnos buscarAlumnoPorDni(int dni) {

        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado =1";
        Alumnos alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese numero de documento");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
        return alumno;
    }

    //Método para obtener una lista de todos los alumnos activos en la base de datos.
    // Código SQL para obtener una lista de todos los alumnos activos en la tabla 'alumno'.
    // Se crea una lista de objetos Alumnos y se agregan los datos obtenidos de la consulta.
    public List<Alumnos> listarAlumnos() {

        String sql = "SELECT idAlumno,dni,  nombre, apellido, fechaNacimiento FROM alumno WHERE estado =1";
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumnos alumno = new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                alumno.setActivo(true);

                alumnos.add(alumno);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
        return alumnos;
    }

}
