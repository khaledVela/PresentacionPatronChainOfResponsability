package tareaExamen;

class Venta extends Servicio {
    public Venta(String nombre, double valor) {
        super(nombre, valor);
    }

    @Override
    public double calcularGanancia() {
        return valor * 0.05; // 5%
    }
}