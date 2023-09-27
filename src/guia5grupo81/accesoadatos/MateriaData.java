package guia5grupo81.accesoadatos;


/*El código incluye importaciones de clases y paquetes 
necesarios para trabajar con bases de datos y otros componentes.*/
import guia5grupo81.entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/*La clase MateriaData proporciona métodos para realizar 
operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla de materias de la 
base de datos. Utiliza consultas SQL para interactuar con la base de datos y 
gestionar las materias de acuerdo a su estado (activo o inactivo).*/



public class MateriaData {

    private Connection con = null;

    /*El constructor de la clase MateriaData establece la conexión a la base de datos 
    utilizando la clase Conexion. Esto significa que cada instancia de MateriaData estará 
    asociada con una conexión a la base de datos.*/
    public MateriaData() {
        con = Conexion.getConexion();
    }

    /*Este método se utiliza para guardar una materia en la base de datos. 
    Toma un objeto Materia como parámetro y realiza una inserción en la tabla de materias.*/
    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año, estado)" + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Agregada Exitosamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }

    }

    /*Este método se utiliza para modificar una materia existente en la base de datos. 
    Toma un objeto Materia como parámetro y realiza una actualización en la tabla de materias.*/
    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Modificada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }

    }

    /*Estos métodos se utilizan para cambiar el estado de una materia. 
    eliminarMateria establece el estado de una materia como inactivo 
    (0), mientras que activarMateria lo establece como activo (1).*/
    public void eliminarMateria(int idMateria) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Eliminada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }

    }

    public void activarMateria(int idMateria) {
        String sql = "UPDATE materia SET estado = 1 WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Activada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }

    }

    /*Estos métodos permiten buscar materias en la base de datos por su ID o por año.
    Realizan consultas SQL para recuperar los datos correspondientes.*/
    public Materia buscarMateria(int idMateria) {
        String sql = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe materia con el ID ingresado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
        return materia;
    }

    public Materia buscarMateriaPorAño(int año) {
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE año = ? AND estado = 1";
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, año);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe materia con el año ingresado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
        return materia;
    }

    /*Estos métodos devuelven listas de todas las materias activas e 
    inactivas en la base de datos, respectivamente.*/
    public List<Materia> listarMaterias() {
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE estado = 1";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);

                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
        return materias;
    }

    public List<Materia> listarMateriasAnuladas() {
        String sql = "SELECT nombre, año FROM materia WHERE estado = 0";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(false);

                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
        return materias;
    }

    public void actualizarMateria(Materia materia) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {

            // Consulta SQL para actualizar la materia
            String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());

            ps.executeUpdate(); // Ejecutar la consulta de actualización

        } catch (SQLException e) {
            e.printStackTrace(); // Manejar excepciones de SQL aquí
        }
    }
}
