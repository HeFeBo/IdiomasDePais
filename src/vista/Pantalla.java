
package vista;

import java.util.List;

public interface Pantalla {
    void mostrarErrorConexionBD();
    void mostrarIdiomasPais(List<String>idiomas, String nombrePais);
    void mostrarAvisoListaIdiomasVacia();
}
