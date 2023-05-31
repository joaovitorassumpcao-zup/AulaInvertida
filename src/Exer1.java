import java.util.ArrayList;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> arrayList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o preço do " + i + "º produto: ");
            arrayList.add(scanner.nextFloat());
        }

        float min = Math.min(arrayList.get(0), Math.min(arrayList.get(1), arrayList.get(2)));

        System.out.printf("Compre o produto de R$ %.2f", min);
    }
}
