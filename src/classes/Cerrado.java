package classes;

import exceptions.ExceptionCar;

import java.util.List;

public class Cerrado implements EstadoCarrito{
    @Override
    public void agregarUnProducto(Producto producto, List<Producto> productos) throws ExceptionCar {
        throw new ExceptionCar("No se aceptan más productos en este estado");

    }

    @Override
    public EstadoCarrito cancelarCarrito() throws ExceptionCar {
        throw new ExceptionCar("No se acepta cancelar carrito en este estado");

    }

    @Override
    public EstadoCarrito volverAlPuntoAnterior() throws Exception {
        throw new ExceptionCar("No se puede volver de el estado classes.Cerrado");
    }

    @Override
    public EstadoCarrito PasarAlSiguienteEstado() throws Exception {
        throw new ExceptionCar("No se puede avanzar del estado classes.Cerrado");

    }
}
