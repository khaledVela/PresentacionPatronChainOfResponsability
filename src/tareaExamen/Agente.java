package tareaExamen;
import tareaExamen.Servicio;

class Agente {
    private String nombre;
    private Direccion direccion;
    private java.util.ArrayList<Servicio> servicios;

    public Agente(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.servicios = new java.util.ArrayList<>();
    }

    public void agregarServicio(Servicio s) {
        servicios.add(s);
    }

    public double calcularGananciaTotal() {
        double total = 0;
        for (Servicio s : servicios) {
            total += s.calcularGanancia();
        }
        return total;
    }

    public double calcularPago() {
        double totalGanancia = calcularGananciaTotal();
        if (totalGanancia > 3000) {
            return totalGanancia * 0.7; // 70%
        } else {
            return totalGanancia * 0.5; // 50%
        }
    }

    public Servicio servicioMasRentable() {
        Servicio mayor = servicios.get(0);
        for (Servicio s : servicios) {
            if (s.getGanancia() > mayor.getGanancia()) {
                mayor = s;
            }
        }
        return mayor;
    }

    public void imprimirResumen() {
        System.out.println("Agente: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("\nServicios realizados:");
        for (Servicio s : servicios) {
            s.imprimir();
            System.out.println();
        }
        double total = calcularGananciaTotal();
        System.out.println("TOTAL GANANCIA: " + total);
        System.out.println("Pago al agente: " + calcularPago());
        System.out.println("Servicio más rentable: " + servicioMasRentable().getNombre());
    }
}