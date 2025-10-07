package tareaExamen;

class Alquiler extends Servicio {
    public Alquiler(String nombre, double valor) {
        super(nombre, valor);
    }

    @Override
    public double calcularGanancia() {
        return valor * 1.0; // 100%
    }
}