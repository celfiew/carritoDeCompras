package classes;

import exceptions.ExceptionCar;

import java.util.List;

public class Cargando implements EstadoCarrito{



    @Override
    public void agregarUnProducto(Producto producto, List<Producto> productos) throws ExceptionCar {
        productos.add(producto);
    }

    @Override
    public EstadoCarrito cancelarCarrito() {
       return new Vacio();
    }

    @Override
    public EstadoCarrito volverAlPuntoAnterior() {
       return new Vacio();
    }

    @Override
    public EstadoCarrito PasarAlSiguienteEstado() throws Exception {
            return new Pagando();
    }
}

