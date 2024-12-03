import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        leerValores(lista);
        mostrarResultados(lista);
    }

    private static void mostrarResultados(List<Integer> lista) {
        System.out.println("Valores" + lista);
        System.out.println("La sumatoria es: " + calcularSuma(lista));
        double media = calcularPromedio(lista);
        System.out.println("El promedio es: " + media);
        int contador = 0;
        for (Integer i : lista) {
            if (i > media)
                contador++;
        }
        System.out.println("Hay " + contador + " numeros superiores a la media");

    }

    private static double calcularPromedio(List<Integer> lista) {
        return calcularSuma(lista) / lista.size();
    }

    private static int calcularSuma(List<Integer> lista) {
        int total = 0;
        for (Integer valor : lista) {
            total += valor;
        }
        return total;
    }

    static void leerValores(List<Integer> lista) {
        Scanner scanner = new Scanner(System.in);
        int dato;
        do {
            System.out.println("Ingrese un numero; para finalizar ingrese -99");
            dato = scanner.nextInt();
            if (dato != -99) {
                lista.add(dato);
            } else {
                scanner.close();
                break;
            }
        } while (true);
    }
}