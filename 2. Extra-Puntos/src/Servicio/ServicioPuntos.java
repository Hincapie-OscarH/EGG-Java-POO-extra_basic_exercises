
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;


public class ServicioPuntos {
    
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el punto X1");
        int x1 = leer.nextInt();
        
        System.out.println("Digite el punto Y1");
        int y1 = leer.nextInt();
        
        System.out.println("Digite el punto X2");
        int x2 = leer.nextInt();
        
        System.out.println("Digite el punto Y2");
        int y2 = leer.nextInt();
        
        return new Puntos(x1, y1, x2, y2);
    }
    
    public void calcular(Puntos puntos){
        double distancia = Math.sqrt((Math.pow((puntos.getX2()-puntos.getX1()), 2))+Math.pow((puntos.getY2()-puntos.getY1()), 2));
        System.out.println("La distancia entre los puntos es: "+distancia);
    }
    
}