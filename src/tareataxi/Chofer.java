package tareataxi;

public class Chofer {
    private String idChofer;
    private String nombre;
    private String licencia;
    private String telefono;
    private Taxi taxiAsignado;

    public Chofer(String idChofer, String nombre, String licencia, String telefono) {
        this.idChofer = idChofer;
        this.nombre = nombre;
        this.licencia = licencia;
        this.telefono = telefono;
    }

    // Métodos
    public void asignarTaxi(Taxi taxi) {
        this.taxiAsignado = taxi;
    }

    // Getters y Setters
    // ...
}
