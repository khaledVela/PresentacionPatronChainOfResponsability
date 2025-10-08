package tareataxi;

import java.time.LocalDateTime;

public class Servicio {
    private String idServicio;
    private Cliente cliente;
    private Taxi taxiAsignado;
    private String tipoServicio; // "transporte", "producto", "compra"
    private double costo;
    private LocalDateTime fechaHora;
    private boolean pagado;

    public Servicio(String idServicio, Cliente cliente, String tipoServicio, double costo) {
        this.idServicio = idServicio;
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.costo = costo;
        this.fechaHora = LocalDateTime.now();
        this.pagado = false;
    }

    public void asignarTaxi(Taxi taxi) {
        this.taxiAsignado = taxi;
    }

    public void marcarComoPagado() {
        this.pagado = true;
    }

    // Getters y Setters
    // ...
}
