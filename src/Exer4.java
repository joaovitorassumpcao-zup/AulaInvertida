import java.util.ArrayList;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Adicione números para a verificação: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" -> ");
            arrayList.add(scanner.nextInt());
        }

        int minimo = arrayList.get(0);
        int maximo = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < minimo) {
                minimo = arrayList.get(i);
            }
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > maximo) {
                maximo = arrayList.get(i);
            }
        }

        System.out.println("Minímo é: " + minimo);
        System.out.println("Máximo é: " + maximo);
    }
}
