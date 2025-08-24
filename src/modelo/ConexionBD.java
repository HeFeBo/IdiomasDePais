
package modelo;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConexionBD {
    public static Connection establecerConexion() throws SQLException{
        try (InputStream input = ConexionBD.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new SQLException("No se pudo cargar el archivo de configuración");
            }

            Properties prop = new Properties();
            prop.load(input);

            String url = prop.getProperty("db.url");
            String usuario = prop.getProperty("db.user");
            String clave = prop.getProperty("db.password");

            //System.out.println("Archivo cargado correctamente");
            return DriverManager.getConnection(url, usuario, clave);

        } catch (Exception e) {
            throw new SQLException("Error al establecer conexión con la base de datos", e);
        }
    }
}
