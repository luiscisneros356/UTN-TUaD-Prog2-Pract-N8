package ejercicio2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConTryWithResources {
    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";
        
        try {
            leerArchivoConTryWithResources(nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
    
    public static void leerArchivoConTryWithResources(String nombreArchivo) 
            throws IOException {
        
        // Try-with-resources: BufferedReader se cierra automáticamente
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("----------------------------------------");
            
            String linea;
            int contador = 0;
            
            while ((linea = reader.readLine()) != null) {
                contador++;
                System.out.printf("%3d: %s%n", contador, linea);
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Total de líneas leídas: " + contador);
            
        } 
        // No necesita bloque finally - el recurso se cierra automáticamente
    }
}