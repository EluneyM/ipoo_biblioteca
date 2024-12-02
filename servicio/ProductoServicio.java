package servicio;

import java.util.Arrays;
import java.util.Scanner;

import enums.TipoProducto;
import modelo.Producto;
import modelo.ProductoElectronico;
import modelo.ProductoRopa;

public class ProductoServicio {
    Scanner sc;

    public ProductoServicio(){
        this.sc = new Scanner(System.in);
    }
    
    public Producto crearProducto() {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = this.sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.valueOf(this.sc.nextLine());
        System.out.println("Ingrese el stock del producto");
        int stock = Integer.valueOf(this.sc.nextLine());
        String descripcion = "";
        System.out.println("Ingrese el tipo de producto: " +  Arrays.toString(TipoProducto.values()));
        TipoProducto tipoProducto = TipoProducto.valueOf(this.sc.nextLine().toUpperCase());

        if (tipoProducto == TipoProducto.ELECTRONICO) {
            return new ProductoElectronico(nombre, precio, stock, descripcion);
        } else {
            return new ProductoRopa(nombre, precio, stock, descripcion);
        }
    }

    public void cerrarScanner() {
        this.sc.close();
        System.out.println("Liberando recursos en finalize");
    }

}
