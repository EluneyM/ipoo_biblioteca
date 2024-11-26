import java.util.Scanner;

import modelo.Biblioteca;
import modelo.Libro;

public class Aplicacion {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("\033\143");
        do {
            System.out.println("---- Menú de Biblioteca ----");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int numeroDePaginas = scanner.nextInt();

                    Libro libro = new Libro(titulo, autor, numeroDePaginas);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    biblioteca.mostrarCatalogo();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }

}