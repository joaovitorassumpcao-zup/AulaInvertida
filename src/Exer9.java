import java.util.ArrayList;
import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<Integer> parList = new ArrayList<>();
        ArrayList<Integer> imparList = new ArrayList<>();

        int buffer;

        System.out.println("Informe os números: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(" -> ");
            arrayList.add(scanner.nextInt());

            buffer = arrayList.get(i);
            if (buffer % 2 == 0) {
                parList.add(buffer);
            } else {
                imparList.add(buffer);
            }
        }

        System.out.println("Lista: " + arrayList);
        System.out.println("Lista de ímpares: " + imparList);
        System.out.println("Lista de pares: " + parList);
    }
}
