package ejercicio1;

// Implementación TarjetaCredito
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    
    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de Crédito: $" + montoConDescuento);
        // Lógica real de procesamiento de pago
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento para tarjetas de crédito
        return monto * 0.95;
    }
}
