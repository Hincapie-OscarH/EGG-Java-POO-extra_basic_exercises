
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioAhorcado {
    private final Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        String[] palabraSecreta;
        String[] palabraOculta;
        System.out.println("Ingrese la palabra secreta: ");
        String palabra = leer.next();
        palabraSecreta = new String[palabra.length()];
        palabraOculta = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraSecreta[i] = palabra.substring(i, i + 1);
            palabraOculta[i] = "_";
        }

        ahorcado.setPalabraSecreta(palabraSecreta);
        ahorcado.setPalabraOculta(palabraOculta);
        ahorcado.setLetrasEncontradas(0);
        ahorcado.setJugadaMaxima(7);

        return ahorcado;
    }
    
    
    public boolean verificarLetra(String letra, Ahorcado ahorcado) {
        boolean letraEncontrada = false;
        for (int i = 0; i < ahorcado.getPalabraSecreta().length; i++) {
            if (ahorcado.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                letraEncontrada = true;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                System.out.println(ahorcado.getLetrasEncontradas());
            }
        }
        return letraEncontrada;
    }
    
    public boolean palabraCompleta(Ahorcado ahorcado) {
        return ahorcado.getLetrasEncontradas() == ahorcado.getPalabraSecreta().length;
    }

    public void reducirJugada(Ahorcado ahorcado) {
        ahorcado.setJugadaMaxima(ahorcado.getJugadaMaxima() - 1);
        ahorcado.setIntentosFallidos(ahorcado.getIntentosFallidos() + 1); // Incrementa el contador de intentos fallidos
        System.out.println("Restan " + ahorcado.getJugadaMaxima() + " intentos.");
    }
    
    public void actualizarPalabraSecreta(String letra, Ahorcado ahorcado) {
        String[] palabraOculta = ahorcado.getPalabraOculta();
        for (int i = 0; i < ahorcado.getPalabraSecreta().length; i++) {
            if (ahorcado.getPalabraOculta()[i].equals("_") && ahorcado.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                palabraOculta[i] = letra;
            }
        }
        System.out.print("Palabra oculta actualizada: ");
        System.out.println(Arrays.toString(ahorcado.getPalabraOculta()));
    }
    
    public void empezarJuego() {
        String letra;
        Ahorcado juego = crearJuego();
        System.out.println(Arrays.toString(juego.getPalabraOculta()));
        do {
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            if (verificarLetra(letra, juego)) {
                System.out.println("La letra se encuentra en la palabra");
                actualizarPalabraSecreta(letra, juego);
            } else {
                System.out.println("La letra no se encuentra en la palabra");
                reducirJugada(juego);
                mostrarDibujo(juego); // Mostrar el dibujo
            }
        } while (!palabraCompleta(juego) && juego.getJugadaMaxima() != 0);

        if (juego.getJugadaMaxima() == 0) {
            System.out.println("Has perdido. El hombre ha sido ahorcado.");

        }
    }
    
    public void mostrarDibujo(Ahorcado ahorcado) {
        int intentosFallidos = ahorcado.getIntentosFallidos();

        String[] dibujo = {
                "  +---+",
                "  |   |",
                "      |",
                "      |",
                "      |",
                "      |",
                "========="
        };

        switch (intentosFallidos) {
            case 1 -> dibujo[2] = "  O   |";
            case 2 -> {
                dibujo[2] = "  O   |";
                dibujo[3] = "  |   |";
            }
            case 3 -> {
                dibujo[2] = "  O   |";
                dibujo[3] = " \\|   |";
            }
            case 4 -> {
                dibujo[2] = "  O   |";
                dibujo[3] = " \\|/  |";
            }
            case 5 -> {
                dibujo[2] = "  O   |";
                dibujo[3] = " \\|/  |";
                dibujo[4] = "  |   |";
            }
            case 6 -> {
                dibujo[2] = "  O   |";
                dibujo[3] = " \\|/  |";
                dibujo[4] = "  |   |";
                dibujo[5] = " /    |";
            }
            case 7 -> {
                dibujo[2] = "  O   |";
                dibujo[3] = " \\|/  |";
                dibujo[4] = "  |   |";
                dibujo[5] = " / \\  |";
            }
            default -> {
            }
        }

        for (String linea : dibujo) {
            System.out.println(linea);
        }
    }
}