package simple;

public interface ManejadorVacaciones {
    void manejarSolicitud(SolicitudVacaciones solicitud);

    void setSiguienteManejador(ManejadorVacaciones siguiente);
}
