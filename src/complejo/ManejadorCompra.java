package complejo;

public interface ManejadorCompra {
    void manejarSolicitud(SolicitudCompra solicitud);
    void setSiguienteManejador(ManejadorCompra siguiente);
}
