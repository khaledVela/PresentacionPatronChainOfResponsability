package tareataxi;

public class Pago {
    private String idPago;
    private Servicio servicio;
    private String metodo; // "efectivo", "tarjeta", "transferencia"
    private double monto;
    private boolean completado;

    public Pago(String idPago, Servicio servicio, String metodo, double monto) {
        this.idPago = idPago;
        this.servicio = servicio;
        this.metodo = metodo;
        this.monto = monto;
        this.completado = false;
    }

    public void procesarPago() {
        this.completado = true;
        servicio.marcarComoPagado();
        System.out.println("Pago completado con método: " + metodo);
    }

    // Getters y Setters
    // ...
}
