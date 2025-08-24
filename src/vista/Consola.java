
package vista;

import java.util.List;
import java.util.Scanner;

public class Consola implements Teclado, Pantalla{
    Scanner teclado = new Scanner(System.in);

    @Override
    public String ingresarPais() {
        System.out.println("Ingresar el pais: ");
        return teclado.nextLine();
    }

    @Override
    public void mostrarIdiomasPais(List<String>idiomas, String nombrePais) {
        System.out.println("Los idiomas hablados en " + nombrePais +" son:");
        for(String p: idiomas){
            System.out.println(p);
        }
    }

    @Override
    public void mostrarErrorConexionBD() {
        
    }

    @Override
    public void mostrarAvisoListaIdiomasVacia() {
        System.out.println("No se tiene una lista de idiomas para el pais. Revisar nombre de pais ingresado.");
    }
    
}
