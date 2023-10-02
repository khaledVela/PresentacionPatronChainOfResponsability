package complejo;

public class SolicitudCompra {
    private final String descripcion;
    private final double monto;

    public SolicitudCompra(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }
}
