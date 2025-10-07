package tareaExamen;
// Clase abstracta Servicio
abstract class Servicio {
    protected String nombre;
    protected double valor;

    public Servicio(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public abstract double calcularGanancia();

    public void imprimir() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Valor real: " + valor);
        System.out.println("Ganancia: " + calcularGanancia());
    }

    public double getGanancia() {
        return calcularGanancia();
    }

    public String getNombre() {
        return nombre;
    }
}