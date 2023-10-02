package complejo;

public class DepartamentoAprobaciones implements ManejadorCompra {
    @Override
    public void setSiguienteManejador(ManejadorCompra siguiente) {
        // En este caso, el Departamento de Aprobaciones es el último en la cadena y no tiene siguiente.
    }

    @Override
    public void manejarSolicitud(SolicitudCompra solicitud) {
        System.out.println("El Departamento de Aprobaciones ha aprobado la compra de " +
                solicitud.getDescripcion() + " por $" + solicitud.getMonto());
    }
}
