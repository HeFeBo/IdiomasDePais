
package modelo;

import java.util.List;

public interface RecursosDAO {
    boolean comprobarConexionB();
    List<String> consultaIdiomaPais(String pais);
}
