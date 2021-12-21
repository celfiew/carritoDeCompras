package classes;

public class Producto {
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
