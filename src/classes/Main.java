package classes;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        Carrito carrito = new Carrito(); // -> empieza en estado vacio
        Producto mesa = new Producto("Mesa", 200);
        Producto tele = new Producto("Tele", 500);
        Producto silla = new Producto("Silla", 50);

        System.out.println(carrito.getEstado().getClass().getName());
        carrito.PasarAlSiguienteEstado();
        System.out.println(carrito.getEstado().getClass().getName());
        //Esta en estado cargando
        carrito.addProducto(mesa);
        carrito.addProducto(tele);
        carrito.addProducto(silla);

        carrito.mostrarProductos();

        carrito.PasarAlSiguienteEstado();
        System.out.println(carrito.getEstado().getClass().getName());
        //classes.Pagando

        carrito.PasarAlSiguienteEstado();
        System.out.println(carrito.getEstado().getClass().getName());
        //classes.Cerrado

        carrito.cancelarCarrito(); // -> vuelve a el estado vacio
    }
}
