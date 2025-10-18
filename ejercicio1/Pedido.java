package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    
    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::calcularTotal)
                .sum();
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificarCambioEstado(this, nuevoEstado);
        }
    }
    
    // Getters y Setters
    public List<Producto> getProductos() { return productos; }
    public String getEstado() { return estado; }
    public Cliente getCliente() { return cliente; }
}