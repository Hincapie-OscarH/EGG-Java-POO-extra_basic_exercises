/*
 5. Crea una clase en Java donde declares una variable de tipo array de Strings que
    contenga los doce meses del año, en minúsculas. A continuación, declara una variable
    mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
    mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
    usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
    el mes secreto. Un ejemplo de ejecución del programa podría ser este:
    Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
    No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
    ¡Ha acertado!
 */
package pkg5.extra.mes.secreto;

import java.util.Scanner;


public class ExtraMesSecreto {


    public static void main(String[] args) {
        String[] meses = new String[] {
				"enero", "febrero", "marzo", "abril", "mayo", "junio",
				"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
		};
                
                int n = (int) (Math.random() * (12 - 0)) + 0; // La posición del mes se genera al azar
		String mesSecreto = meses[n]; // mes a adivinar
		
		Boolean acertado = false; // condicion del while
		
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("> Adivine el mes secreto. Introduzca el nombre del mes en minusculas: ");
		String mesIngresado;
		
		do {
			mesIngresado = leer.nextLine();
			
			if (mesIngresado.equals(mesSecreto)) {	
                            acertado = true;
                            System.out.println("\n¡¡HA ACERTADO!!");
				
			} else {
                            System.out.println("\nNo ha acertado. Intente adivinarlo introduciendo otro mes: ");
			}
			
		} while (acertado != true);
	}
}