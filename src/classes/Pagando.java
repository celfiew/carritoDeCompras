package classes;

import exceptions.ExceptionCar;

import java.util.List;

public class Pagando implements EstadoCarrito{

    List<Producto> productos;
    Carrito carrito;


    @Override
    public void agregarUnProducto(Producto producto, List<Producto> productos) throws ExceptionCar {
        throw new ExceptionCar("No se aceptan más productos en este estado");
    }

    @Override
    public EstadoCarrito cancelarCarrito() {
        return new Vacio();
    }

    @Override
    public EstadoCarrito volverAlPuntoAnterior() {
        return new Cargando();
    }

    @Override
    public EstadoCarrito PasarAlSiguienteEstado() {
        return new Cerrado();
    }
}
