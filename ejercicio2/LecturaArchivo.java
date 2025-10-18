package ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        
        try {
            leerYMostrarArchivo(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public static void leerYMostrarArchivo(String nombreArchivo) 
            throws FileNotFoundException, IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        int numeroLinea = 1;
        
        while ((linea = reader.readLine()) != null) {
            System.out.println(numeroLinea + ": " + linea);
            numeroLinea++;
        }
        
        reader.close();
    }
}