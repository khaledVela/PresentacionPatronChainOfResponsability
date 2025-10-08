package tareataxi;

import java.util.ArrayList;
import java.util.List;

public class SistemaRadioTaxi {
    private List<Parada> paradas;
    private List<Servicio> servicios;
    private List<Cliente> clientes;
    private List<Operadora> operadoras;

    public SistemaRadioTaxi() {
        this.paradas = new ArrayList<>();
        this.servicios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.operadoras = new ArrayList<>();
    }

    public void registrarParada(Parada parada) {
        paradas.add(parada);
    }

    public void registrarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    // Otros métodos de gestión...
}
