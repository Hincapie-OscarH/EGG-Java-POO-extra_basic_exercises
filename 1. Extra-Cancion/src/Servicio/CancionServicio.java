
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;


public class CancionServicio {
    
    
    public Cancion crearCancion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el título de la canción");
        String titulo = leer.next();
        leer.nextLine();
        
        System.out.println("Ingrese el autor de la canción");
        String autor = leer.next();
        leer.nextLine();
                
        return new Cancion(titulo, autor);
    }

    public void mostrar(Cancion cancion){
        System.out.println("Datos de la canción");
        System.out.println("Título: "+ cancion.getTitulo());
        System.out.println("Autor: "+ cancion.getAutor());
    }
    
}