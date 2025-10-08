package tareataxi;

import java.util.LinkedList;
import java.util.Queue;

public class Parada {
    private String nombre;
    private String ubicacion;
    private Queue<Taxi> colaTaxis;

    public Parada(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.colaTaxis = new LinkedList<>();
    }

    public void registrarTaxi(Taxi taxi) {
        colaTaxis.offer(taxi);
    }

    public Taxi obtenerSiguienteTaxi() {
        return colaTaxis.poll();
    }

    // Getters y Setters
    // ...
}
