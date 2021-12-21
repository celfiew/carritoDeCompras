package classes;

import exceptions.ExceptionCar;

import java.util.List;

public class Vacio implements EstadoCarrito{

    @Override
    public void agregarUnProducto(Producto producto, List<Producto> productos) throws ExceptionCar {
        throw new ExceptionCar("No se puede agregar productos en el estado vacio");
    }

    @Override
    public EstadoCarrito cancelarCarrito() throws ExceptionCar {
        throw new ExceptionCar("El carrito ya se encuentra vacío");
    }

    @Override
    public EstadoCarrito volverAlPuntoAnterior() throws Exception {
        throw new ExceptionCar("No se puede volver en el estado vacío");
    }

    @Override
    public EstadoCarrito PasarAlSiguienteEstado() {
     return new Cargando();
    }
}
