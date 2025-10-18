package ejercicio1;


// Clase Cliente
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificarCambioEstado(Pedido pedido, String nuevoEstado) {
        System.out.println("Notificación para " + nombre + ":");
        System.out.println("El pedido ha cambiado a estado: " + nuevoEstado);
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        System.out.println("---------------------------");
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}