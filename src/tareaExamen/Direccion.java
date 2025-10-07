package tareaExamen;

class Direccion {
    private String departamento;
    private String ciudad;
    private String calle;

    public Direccion(String departamento, String ciudad, String calle) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.calle = calle;
    }

    @Override
    public String toString() {
        return departamento + ", " + ciudad + ", " + calle;
    }
}