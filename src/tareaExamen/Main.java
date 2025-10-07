package tareaExamen;

public class Main {
    public static void main(String args[]) {
        Alquiler a1 = new Alquiler("Departamento",500);
        a1.imprimir(); // Debera imprimir: Servicio Alquiler
        System.out.println("Comision Alquiler = " + a1.calcularGanancia()); // Comision Alquiler = 350

        Venta v1 = new Venta("Monoambiente",35000);
        v1.imprimir(); // Debera imprimir: Servicio Venta
        System.out.println("Comision Venta = " + v1.calcularGanancia()); // Comision Venta = 2950

        Anticretico at1 = new Anticretico("Tienda",22000);
        at1.imprimir(); // Debera imprimir: Servicio Anticretico
        System.out.println("Comision Anticretico = " + at1.calcularGanancia()); // Comision Venta = 300
    }
}