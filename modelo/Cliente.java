package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.exepciones.FueraDeStockException;

public class Cliente {
    private List<Producto> carritoCompras;

    public Cliente(){
        this.carritoCompras = new ArrayList<>();
    }

    public void agregarProductoAlCarrito(Producto p){
        this.carritoCompras.add(p);
    }

    public void verCarrito(){
        for (Producto producto : carritoCompras) {
            System.out.println(producto);
        }
    }

    public void realizarCompra() throws FueraDeStockException{
        double total = 0;

        for (Producto producto : carritoCompras) {
            if (producto.estaFueraDeStock()) {
                throw new FueraDeStockException("Fuera de stock para el producto: \n" + producto.toString());
            }

            total += producto.calcularPrecio();
        }

        System.out.println("El total es: " + total);
    }
}
