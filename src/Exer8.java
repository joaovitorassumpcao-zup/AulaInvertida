import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Informe a lista de números: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "#: ");
            nums[i] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
