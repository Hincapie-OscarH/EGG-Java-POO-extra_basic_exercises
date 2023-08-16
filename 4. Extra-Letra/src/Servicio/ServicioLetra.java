
package Servicio;

import Entidad.Verificador;
import java.util.Scanner;


public class ServicioLetra {
    
    private static Scanner leer = new Scanner(System.in);
    public void crearNif(Verificador verificador){
        
        boolean DniValido = false;
        while (!DniValido) { 
            System.out.println("Ingrese DNI de 8 digitos");
            String dniString = leer.nextLine();
            if (dniString.length()==8) {
                try{
                    verificador.setDni(Long.parseLong(dniString)); 
                    DniValido = true;
                } catch(NumberFormatException e){
                    System.out.println("Entraste a la excepcion ingresaste un caracter incorrecto");
                }
                       
            }else{ 
                System.out.println("DNI incorrecto");                   
            }
        }      
        
        int resto = (int)(verificador.getDni()% 23);
        char[] letras = {'T', 'R','W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};  
        verificador.setLetra(letras[resto]);
          
    }
    
    public void mostrar(Verificador verificador){
        System.out.println("Dni: " + verificador.getDni()+ "-" + verificador.getLetra());
    }
}