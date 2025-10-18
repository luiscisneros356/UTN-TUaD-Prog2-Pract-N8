import java.util.Scanner;

import core.Ejecutable;
import ejercicio1.EjecutarEjercicio1;
import ejercicio2.EjecutarEjercicio2;


   public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
            int opcion;
            do {
                mostrarMenu();
                opcion = leerOpcion();
                Ejecutable ejercicio = obtenerEjercicio(opcion);
                if (ejercicio != null) {
                    ejercicio.execute();
                } else if (opcion != 0) {
                    System.out.println("Opción no válida");
                }
                if (opcion != 0) {
                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
                }
                
            }
            while (opcion != 0);
            System.out.println("Chau!");
        }
    

    private static void mostrarMenu() {
        System.out.println("\n===============================================");
        System.out.println("   Trabajo Práctico 8 - Interfaces y Excepciones   ");
        System.out.println("===============================================");
        System.out.println("1. Ejercicios de Ejercicio 1");
        System.out.println("2. Ejercicios de Ejercicio 2");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion () {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static Ejecutable obtenerEjercicio(int opcion) {
        if(opcion==1){
return new EjecutarEjercicio1();
        }else if(opcion==2){
return new EjecutarEjercicio2();
        }else {
return null;
        }
        
    }
}

