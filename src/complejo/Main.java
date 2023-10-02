package complejo;

public class Main {
    public static void main(String[] args) {
        ManejadorCompra compras = new DepartamentoCompras();
        ManejadorCompra finanzas = new DepartamentoFinanzas();
        ManejadorCompra aprobaciones = new DepartamentoAprobaciones();

        compras.setSiguienteManejador(finanzas);
        finanzas.setSiguienteManejador(aprobaciones);

        SolicitudCompra solicitud1 = new SolicitudCompra("Laptop", 800);
        SolicitudCompra solicitud2 = new SolicitudCompra("Proyector", 4500);
        SolicitudCompra solicitud3 = new SolicitudCompra("Mobiliario de oficina", 12000);

        compras.manejarSolicitud(solicitud1);
        compras.manejarSolicitud(solicitud2);
        compras.manejarSolicitud(solicitud3);
    }
}
