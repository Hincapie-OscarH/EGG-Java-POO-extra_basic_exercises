/*
1.  Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
    definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
    vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
    además definir los métodos getters y setters correspondientes.
 */
package pkg1.extra.cancion;

import Entidad.Cancion;
import Servicio.CancionServicio;


public class main {

    public static void main(String[] args) {
        System.out.println("Comienzo...");
        
        CancionServicio sv = new CancionServicio();
        Cancion cancion = sv.crearCancion();
        sv.mostrar(cancion);
    }
    
}