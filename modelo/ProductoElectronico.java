package modelo;

public class ProductoElectronico extends Producto implements Comprable {

    public ProductoElectronico(String nombre, double precio, int stock, String descripcion){
        super(nombre, precio, stock, descripcion);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularPrecio() {
        return this.precio * 2.1;
    }
}
