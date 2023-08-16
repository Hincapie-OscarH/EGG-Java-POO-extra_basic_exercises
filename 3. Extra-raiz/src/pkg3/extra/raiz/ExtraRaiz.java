/*
 3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
    ecuación de 2do grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
    Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
    Luego, las operaciones que se podrán realizar son las siguientes:

    Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0.
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones.
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.

    Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
    delante de -b
 */
package pkg3.extra.raiz;

import Entidad.Raices;
import Servicio.ServicioRaices;
import java.util.Scanner;


public class ExtraRaiz {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Comienzo...");
        
        ServicioRaices sv = new ServicioRaices();
        Raices raices = sv.asignar();
        
        int opcion;
        boolean salir = false;
        
        while(!salir){
            
           System.out.println("1. Discriminante");
           System.out.println("2. Tiene raices");
           System.out.println("3. Tiene raiz");
           System.out.println("4. Obtener raices");
           System.out.println("5. Calcular raices posibles");
           System.out.println("6. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = leer.nextInt();
            
           switch(opcion){
               case 1:
                   sv.getDiscriminante(raices);
                   break;
               case 2:
                   System.out.println(sv.tieneRaices(raices));
                   break;
                case 3:
                   System.out.println(sv.tieneRaiz(raices));
                   break;
                case 4:
                   sv.obtenerRaices(raices);
                   break;   
                case 5:
                   sv.calcular(raices);
                   break;     
                case 6:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 5");
           }
        }
    }
}