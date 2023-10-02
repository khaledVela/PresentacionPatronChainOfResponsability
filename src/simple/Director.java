package simple;

public class Director implements ManejadorVacaciones {
    @Override
    public void setSiguienteManejador(ManejadorVacaciones siguiente) {
        // En este caso, el director es el último en la cadena y no tiene siguiente.
    }

    @Override
    public void manejarSolicitud(SolicitudVacaciones solicitud) {
        System.out.println("El Director ha aprobado " + solicitud.getDias() + " días de vacaciones.");
    }
}
