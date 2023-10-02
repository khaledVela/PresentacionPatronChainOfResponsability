package complejo;

public class DepartamentoFinanzas implements ManejadorCompra {
    private ManejadorCompra siguiente;

    @Override
    public void setSiguienteManejador(ManejadorCompra siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarSolicitud(SolicitudCompra solicitud) {
        if (solicitud.getMonto() <= 5000) {
            System.out.println("El Departamento de Finanzas ha aprobado la compra de " +
                    solicitud.getDescripcion() + " por $" + solicitud.getMonto());
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        } else {
            System.out.println("Nadie puede aprobar la compra de " +
                    solicitud.getDescripcion() + " por $" + solicitud.getMonto());
        }
    }
}
