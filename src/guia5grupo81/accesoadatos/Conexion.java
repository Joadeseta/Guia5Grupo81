
package guia5grupo81.accesoadatos;

// Importación de las clases necesarias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;


/*Este código proporciona una forma de establecer una conexión a una base de datos MariaDB 
(o MySQL) utilizando el controlador JDBC. La clase utiliza el patrón Singleton para asegurarse 
de que solo haya una instancia de la conexión a la base de datos en toda la aplicación. 
Cuando se llama al método getConexion(), se devuelve una instancia de Connection que se puede 
utilizar para interactuar con la base de datos. Asegúrate de configurar correctamente la URL, 
el nombre de la base de datos, el usuario y la contraseña según tu configuración de base de datos.*/


//Clase para establecer una conexión a la base de datos.
public class Conexion {

    // URL de conexión a la base de datos (debe especificar el host y la base de datos)
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "g5eq81";   //Nombre de la base de datos
    private static final String USUARIO = "root";// Nombre de usuario de la base de datos
    private static final String PASSWORD = ""; // Contraseña de la base de datos

    // Objeto de conexión a la base de datos
    private static Connection connection;

    
    // Constructor privado (se utiliza un patrón Singleton)    
    
    private Conexion() {
        
// El constructor está vacío ya que no se desea crear instancias de esta clase.

    }

    
    /**
     * Método estático para obtener una conexión a la base de datos.
     *
     * @return Objeto Connection que representa la conexión a la base de datos.
     */
    
    
    public static Connection getConexion() {
        if (connection == null) {
            try {
                
                // Carga el controlador JDBC de MariaDB
                
                
                Class.forName("org.mariadb.jdbc.Driver");
                
              // Configura y establece la conexión a la base de datos
              
                connection = DriverManager.getConnection(URL + DB
                        + "?useLegacyDatetimeCode = false&serverTimezone = UTC"
                        + "&user=" + USUARIO + "&password" + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la DB: " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers: " + ex.getMessage());
            }
        }
        return connection;  // Devuelve la conexión a la base de datos
    }

}
