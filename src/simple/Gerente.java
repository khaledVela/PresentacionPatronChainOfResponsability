package simple;

public class Gerente implements ManejadorVacaciones {
    private ManejadorVacaciones siguiente;

    @Override
    public void setSiguienteManejador(ManejadorVacaciones siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarSolicitud(SolicitudVacaciones solicitud) {
        if (solicitud.getDias() <= 10) {
            System.out.println("El Gerente ha aprobado " + solicitud.getDias() + " días de vacaciones.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        } else {
            System.out.println("Nadie puede aprobar " + solicitud.getDias() + " días de vacaciones.");
        }
    }
}
