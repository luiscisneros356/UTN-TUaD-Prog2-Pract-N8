package ejercicio1;

// Implementación PayPal
public class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
        // Lógica real de procesamiento de pago
        return true;
    }
}