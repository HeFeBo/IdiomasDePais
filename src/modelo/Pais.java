
package modelo;

import java.util.List;

public class Pais {
    private String nombre;
    private List<String>listaIdiomas;
    
    public Pais(String nombre, List<String>listaIdiomas){
        this.nombre = nombre;
        this.listaIdiomas = listaIdiomas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getListaIdiomas() {
        return listaIdiomas;
    }

}
