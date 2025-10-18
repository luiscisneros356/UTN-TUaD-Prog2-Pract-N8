package ejercicio2;

// Clase que usa la excepción personalizada
import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        } finally {
            scanner.close();
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años");
        }
    }
}

