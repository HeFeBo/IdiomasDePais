
package controlador;

import java.util.List;
import modelo.RecursosDAO;
import vista.Pantalla;
import vista.Teclado;

public class Servicio {
    Teclado teclado;
    Pantalla pantalla;
    RecursosDAO recursos;
    
    public Servicio(Teclado teclado, Pantalla pantalla, RecursosDAO recursos){
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.recursos = recursos;
    }
    
    public void idiomasPais(){
        String pais = teclado.ingresarPais();
        if(recursos.comprobarConexionB()){
            List<String>listaIdiomas = recursos.consultaIdiomaPais(pais);
            while(listaIdiomas.isEmpty()){
                pantalla.mostrarAvisoListaIdiomasVacia();
                pais = teclado.ingresarPais();
                listaIdiomas = recursos.consultaIdiomaPais(pais);
            }
            pantalla.mostrarIdiomasPais(listaIdiomas, pais);
        }else{
            pantalla.mostrarErrorConexionBD();
        }
    }
}
