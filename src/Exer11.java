import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso do peixe: ");
        int peso = scanner.nextInt();

        if (peso > 50) {
            int excesso = peso - 50;
            float multa = excesso * 4;

            System.out.println("Peso: " + peso + " Kg");
            System.out.println("Excesso: " + excesso + " Kg");
            System.out.println("Multa (R$4,00/Kg):  R$ " + multa);
            return;
        }

        System.out.println("Sem multa!");
    }
}
