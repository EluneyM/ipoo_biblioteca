import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class OrdenMerito {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int nota;
        String respuesta;

        do {
            System.out.println("Ingrese la nota: ");
            nota = scanner.nextInt();

            if (nota >= 1 && nota <= 10) {
                notas.add(nota);
            } else {
                System.out.println("La nota debe estar entre 1 y 10.");
            }
            System.out.println("desea ingresar otra nota? si/no");
            scanner.nextLine();
            respuesta = scanner.next();
            scanner.close();
        } while (respuesta.equalsIgnoreCase("si"));

        Collections.sort(notas);
        System.out.println("lista de menor a mayor:");
        System.out.println(notas);

        Collections.reverse(notas);
        System.out.println("lista de mayor a menor:");
        System.out.println(notas);


    }
