package guia5grupo81.accesoadatos;

//El código incluye importaciones de clases y paquetes necesarios para trabajar con bases de datos y otros componentes.
import com.sun.istack.internal.logging.Logger;
import guia5grupo81.entidades.Alumnos;
import guia5grupo81.entidades.Inscripcion;
import guia5grupo81.entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/*Esta clase parece estar diseñada para interactuar con una base de datos 
y realizar operaciones relacionadas con inscripciones de alumnos en materias. 
Puedes ver que se utilizan consultas SQL para acceder y modificar los datos en la base de datos.*/


public class InscripcionData {

    /* La clase tiene algunas variables miembro privadas que almacenan
    conexiones a otras clases de datos, como MateriaData y AlumnoData.*/
    private Connection con = null;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();

    /*El constructor de la clase InscripcionData establece la conexión a la base de datos 
utilizando la clase Conexion. Esto significa que cada instancia de InscripcionData estará 
asociada con una conexión a la base de datos.*/
    public InscripcionData() {
        this.con = Conexion.getConexion();
    }

    /*Este método se utiliza para guardar una inscripción en la base de datos.
Toma un objeto Inscripcion como parámetro y realiza una inserción en la tabla de inscripciones.*/
    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO Inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setInt(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "inscripcion registrada");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
        }
    }

    /* Este método se utiliza para actualizar la nota de una inscripción existente. 
Toma el ID del alumno, el ID de la materia y la nueva nota como parámetros
y ejecuta una actualización en la base de datos.*/
    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscrpicion Set nota = ? WHERE idAlumno = ? and idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* Este método se utiliza para eliminar una inscripción específica de un alumno en una materia. 
Toma el ID del alumno y el ID de la materia como parámetros y realiza una eliminación en la base de datos.*/
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
        }
    }

    /* Este método devuelve una lista de todas las inscripciones en la base de datos.
Recupera los datos de inscripción de la tabla y crea objetos Inscripcion para cada entrada.*/
    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {

                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumnos alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota((int) rs.getDouble("nota"));
                cursadas.add(insc);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla de inscripcion");
        }

        return cursadas;

    }

    /* Este método devuelve una lista de inscripciones específicas para un alumno dado. 
Toma el ID del alumno como parámetro y realiza una consulta 
para recuperar las inscripciones relacionadas.*/
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM WHERE idAlumno= ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {

                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumnos alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota((int) rs.getDouble("nota"));
                cursadas.add(insc);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla de inscripcion");
        }

        return cursadas;

    }

    /* Estos métodos obtienen una lista de materias cursadas y no cursadas por un alumno específico. 
Utilizan consultas SQL para recuperar los datos de la base de datos.*/
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "Select inscripcion.idMateria, nombre, año FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria = materia.idMateria"
                + " AND inscripcion.idAlumno = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("Nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
            ex.printStackTrace();
        }
        return materias;
    }

    public List<Materia> obtenermateriasNOCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHere estado = 1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno =?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("Nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
        }
        return materias;
    }

    /*Este método obtiene una lista de alumnos que están inscritos en una materia específica. 
Utiliza una consulta SQL para recuperar los datos correspondientes.*/
    public List<Alumnos> obtenerAlumnosXMateria(int idMateria) {
        ArrayList<Alumnos> alumnosMateria = new ArrayList<>();
        String sql = "SELECTa.idAlumno, dni, nombre,apellido,fechaNacimiento, estado"
                + "FROM inscipcion i, alumno a WHERE i.idAlumno= a.idAlumno = a.idAlumno AND idMateria = ? AND a.Estado = 1";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumnos alumno = new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla de inscripcion");
        }
        return alumnosMateria;
    }
}

