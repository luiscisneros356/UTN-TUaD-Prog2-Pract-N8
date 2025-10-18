package ejercicio2;


import java.util.Scanner;

import core.Ejecutable;

public class EjecutarEjercicio2 extends Ejecutable {
   
    // Métodos de cada ejercicio (implementados arriba)
    private static void ejercicioDivision() { DivisionSegura.main(null);; }
    private static void ejercicioConversion() { ConversionCadenaNumero.main(null); }
    private static void ejercicioLecturaArchivo() { LecturaArchivo.main(null); }
    private static void ejercicioValidacionEdad() { ValidacionEdad.main(null); }
    private static void ejercicioTryWithResources() { LecturaConTryWithResources.main(null); }

    @Override
    public void execute() {
         Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== MENU DE EJERCICIOS DE EXCEPCIONES ===");
            System.out.println("1. División segura");
            System.out.println("2. Conversión de cadena a número");
            System.out.println("3. Lectura de archivo");
            System.out.println("4. Validación de edad con excepción personalizada");
            System.out.println("5. Lectura con try-with-resources");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        ejercicioDivision();
                        break;
                    case 2:
                        ejercicioConversion();
                        break;
                    case 3:
                        ejercicioLecturaArchivo();
                        break;
                    case 4:
                        ejercicioValidacionEdad();
                        break;
                    case 5:
                        ejercicioTryWithResources();
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido");
                opcion = -1;
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    }
