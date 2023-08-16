
package Servicio;

import Entidad.Raices;
import java.util.Scanner;


public class ServicioRaices {
    
    public Raices asignar(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el valor para a");
        int a = leer.nextInt();
        
        System.out.println("Digite el valor para b");
        int b = leer.nextInt();
        
        System.out.println("Digite el valor para c");
        int c = leer.nextInt();
        
        return new Raices(a, b, c);
    }
    
    public double getDiscriminante(Raices raices){
        double discriminante = (Math.pow(raices.getB(), 2)-(4*raices.getA()*raices.getC()) );
        System.out.println("El discriminante es: "+discriminante);
        return discriminante;
    }
    
    public boolean tieneRaices(Raices raices){
        return getDiscriminante(raices) >0;
        
    }
    
    public boolean tieneRaiz(Raices raices){
        
        return getDiscriminante(raices) == 0;
        
    }
    
    public void obtenerRaices(Raices raices){
        if (tieneRaices(raices)) {
            double A = raices.getA();
            double B = raices.getB();
            double C = raices.getC();
            
            double x1 = (-B + Math.sqrt(getDiscriminante(raices)))/ (2 * A);
            double x2 = (-B - Math.sqrt(getDiscriminante(raices)))/ (2 * A);
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        }        
        
    }
    
    
    public void obtenerRaiz(Raices raices){
        if (tieneRaices(raices)) {
            double A = raices.getA();
            double B = raices.getB();
            
            double x = (-B + Math.sqrt(getDiscriminante(raices)))/ (2 * A);
            System.out.println(" Raiz de x: " + x);
        }        
        
    }
    
    public void calcular(Raices raices){
        if (tieneRaices(raices)){
           obtenerRaices(raices);
        } else{
            if(tieneRaiz(raices)){
                obtenerRaiz(raices);
            } else {
                System.out.println("la función no tiene raíces reales");
            }
        }
    }
}