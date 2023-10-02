package simple;

public class JefeEquipo implements ManejadorVacaciones {
    private ManejadorVacaciones siguiente;

    @Override
    public void setSiguienteManejador(ManejadorVacaciones siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarSolicitud(SolicitudVacaciones solicitud) {
        if (solicitud.getDias() <= 5) {
            System.out.println("El Jefe de Equipo ha aprobado " + solicitud.getDias() + " días de vacaciones.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        } else {
            System.out.println("Nadie puede aprobar " + solicitud.getDias() + " días de vacaciones.");
        }
    }
}


