import java.util.Scanner;

import modelo.Cliente;
import modelo.Producto;
import modelo.exepciones.FueraDeStockException;
import servicio.ProductoServicio;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        Cliente cliente = new Cliente();
        ProductoServicio productoServicio = new ProductoServicio();

        do {

            try {
                System.out.println("""
                        Bienvenido al e-commerce:
                            1 - Agregar producto al carrito
                            2 - Ver el carrito
                            3 - Realizar la compra
                            4 - Salir del sistema
                            """);

                opcion = Integer.valueOf(sc.nextLine());

                switch (opcion) {
                    case 1:
                        Producto producto = productoServicio.crearProducto();

                        cliente.agregarProductoAlCarrito(producto);
                        break;
                    case 2:
                        cliente.verCarrito();
                        break;
                    case 3:
                        cliente.realizarCompra();
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        break;
                }
            } catch (FueraDeStockException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 4);

        // Sugerencia adicional:
        // Se puede incluir una opción "volver a comprar" en el menú, que mantenga en
        // memoria el stock de productos afectado por la compra anterior.
        productoServicio.cerrarScanner();
        sc.close();
    }

}