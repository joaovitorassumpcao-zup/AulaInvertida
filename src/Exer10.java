import java.util.Arrays;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        int soma = 0, mult = 1;

        System.out.println("Entre 5 números: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" -> ");
            nums[i] = scanner.nextInt();
            soma += nums[i];
            mult *= nums[i];
        }

        System.out.println("Lista entrada: " + Arrays.toString(nums));
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + mult);
    }
}
