package modelo;

public abstract class Producto {
    // nombre, precio, cantidad en stock y una descripción
    protected String nombre;
    protected double precio;
    protected int stock;
    protected String descripcion;

    public Producto(String nombre, double precio, int stock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\nProducto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", descripcion=" + descripcion
                + "]";
    }

    public boolean estaFueraDeStock() {
        return this.stock == 0;
    }

    public abstract double calcularPrecio();
}
