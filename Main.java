import java.util.ArrayList;
import java.util.Scanner;

public class ListaCiudades {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String respuesta;

        do {
            System.out.println("Ingreese el nombre de la ciudad: ");
            ciudades.add(scanner.nextLine());

            System.out.println("Quiere agregar otra ciudad?");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Lista de ciudades ingresadas: ");
        for (String c : ciudades) {
            System.out.println(c);
        }

        scanner.close();

    }
}
