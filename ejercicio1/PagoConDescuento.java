package ejercicio1;

// Interfaz para pagos con descuento
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}
