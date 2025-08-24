
package main;

import controlador.Servicio;
import modelo.DAO;
import modelo.RecursosDAO;
import vista.Consola;
import vista.Pantalla;
import vista.Teclado;

public class Lanzador {

    public static void main(String[] args) {
        Teclado teclado = new Consola();
        Pantalla pantalla = new Consola();
        RecursosDAO recursos = new DAO();
        
        Servicio servicio = new Servicio(teclado, pantalla, recursos);
        
        servicio.idiomasPais();
    }
    
}
