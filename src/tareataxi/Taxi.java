package tareataxi;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private String numeroIdentificacion;  // ID único del taxi
    private String placa;
    private String modelo;
    private String marca;
    private Parada paradaActual;
    private List<Chofer> choferes;

    public Taxi(String numeroIdentificacion, String placa, String modelo, String marca) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.choferes = new ArrayList<>();
    }

    // Métodos
    public void asignarParada(Parada parada) {
        this.paradaActual = parada;
    }

    public void agregarChofer(Chofer chofer) {
        choferes.add(chofer);
    }

    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    // Getters y Setters
    // ...
}
