package modelo;

public class ProductoRopa extends Producto implements Comprable {

    public ProductoRopa(String nombre, double precio, int stock, String descripcion){
        super(nombre, precio, stock, descripcion);
    }

    @Override
    public double calcularPrecio() {
        return this.precio * 1.1;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
}
