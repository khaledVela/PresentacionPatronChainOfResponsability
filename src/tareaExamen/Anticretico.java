package tareaExamen;

import tareaExamen.Servicio;

class Anticretico extends Servicio {
    public Anticretico(String nombre, double valor) {
        super(nombre, valor);
    }

    @Override
    public double calcularGanancia() {
        return valor * 0.03; // 3%
    }
}