package simple;

public class Main {
    public static void main(String[] args) {
        ManejadorVacaciones jefe = new JefeEquipo();
        ManejadorVacaciones gerente = new Gerente();
        ManejadorVacaciones director = new Director();

        jefe.setSiguienteManejador(gerente);
        gerente.setSiguienteManejador(director);

        SolicitudVacaciones solicitud1 = new SolicitudVacaciones(3);
        SolicitudVacaciones solicitud2 = new SolicitudVacaciones(8);
        SolicitudVacaciones solicitud3 = new SolicitudVacaciones(12);

        jefe.manejarSolicitud(solicitud1);
        jefe.manejarSolicitud(solicitud2);
        jefe.manejarSolicitud(solicitud3);
    }
}
