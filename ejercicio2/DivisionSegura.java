package ejercicio2;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();
            
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        } finally {
            scanner.close();
        }
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor cero");
        }
        return a / b;
    }
}
