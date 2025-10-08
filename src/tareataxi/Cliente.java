package tareataxi;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Servicio> servicios;

    public Cliente(String idCliente, String nombre, String telefono, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.servicios = new ArrayList<>();
    }

    public void solicitarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    // Getters y Setters
    // ...
}
