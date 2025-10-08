package tareataxi;

public class Operadora {
    private String nombre;
    private String idOperadora;

    public Operadora(String nombre, String idOperadora) {
        this.nombre = nombre;
        this.idOperadora = idOperadora;
    }

    public void despacharServicio(Servicio servicio, Parada parada) {
        Taxi taxi = parada.obtenerSiguienteTaxi();
        if (taxi != null) {
            servicio.asignarTaxi(taxi);
            System.out.println("Taxi " + taxi.getNumeroIdentificacion() + " despachado.");
        } else {
            System.out.println("No hay taxis disponibles en la parada.");
        }
    }

    // Getters y Setters
    // ...
}
