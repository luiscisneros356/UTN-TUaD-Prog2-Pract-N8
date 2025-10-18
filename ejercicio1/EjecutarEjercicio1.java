package ejercicio1;

import core.Ejecutable;

public class EjecutarEjercicio1 extends Ejecutable {
    @Override
    public void execute() {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");
        
        // Crear productos
        Producto laptop = new Producto("Laptop Gamer", 1500.00);
        Producto mouse = new Producto("Mouse Inalámbrico", 50.00);
        Producto teclado = new Producto("Teclado Mecánico", 120.00);
        
        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);
        pedido.agregarProducto(teclado);
        
        // Calcular total
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        // Procesar pagos
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Pérez");
        PayPal paypal = new PayPal("juan@email.com");
        
        // Procesar pago con tarjeta (con descuento)
        tarjeta.procesarPago(pedido.calcularTotal());
        
        // Procesar pago con PayPal (sin descuento)
        paypal.procesarPago(pedido.calcularTotal());
        
        // Cambiar estados del pedido (notificaciones automáticas)
        pedido.cambiarEstado("CONFIRMADO");
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
    }
}
