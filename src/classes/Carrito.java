package classes;

import exceptions.ExceptionCar;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();
    private EstadoCarrito estado;


    public Carrito() {
        this.estado = new Vacio();
    }

    public void addProducto(Producto producto) throws ExceptionCar {
        this.estado.agregarUnProducto(producto,productos);
    }

    public EstadoCarrito getEstado() {
        return estado;
    }

    public void cancelarCarrito() throws ExceptionCar {
        this.productos = new ArrayList<>();
        this.estado = this.estado.cancelarCarrito();
    }


    public void volverAlPuntoAnterior() throws Exception {
        this.estado = this.estado.volverAlPuntoAnterior();
    }

    public void PasarAlSiguienteEstado() throws Exception {
        this.estado = this.estado.PasarAlSiguienteEstado();
    }


    public void mostrarProductos(){
        for (Producto producto : this.productos){
            System.out.println(producto.toString());
            System.out.println("-----------------");
        }
    }
}
