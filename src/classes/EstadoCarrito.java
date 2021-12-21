package classes;

import exceptions.ExceptionCar;

import java.util.List;

public interface EstadoCarrito {

    void agregarUnProducto(Producto producto, List<Producto> productos) throws ExceptionCar;

    EstadoCarrito cancelarCarrito() throws ExceptionCar;

    EstadoCarrito volverAlPuntoAnterior() throws Exception;

    EstadoCarrito PasarAlSiguienteEstado() throws Exception;

}
