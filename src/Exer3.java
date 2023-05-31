import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabuada a ser mostrada (2, 3, etc.) : ");
        int tab = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tab + " * " + i + " = " + (tab * i));
        }
    }
}
