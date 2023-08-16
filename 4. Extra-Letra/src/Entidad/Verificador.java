
package Entidad;


public class Verificador {
    
    private long dni;
    private char letra;

    public Verificador() {
    }

    public Verificador(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
       
}