package ejercicio2;

import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = convertirAEntero(entrada);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un número entero válido");
        } finally {
            scanner.close();
        }
    }
    
    public static int convertirAEntero(String texto) {
        return Integer.parseInt(texto);
    }
}
