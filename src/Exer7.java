import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Digite sua lista de 5 valores: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" -> ");
            nums[i] = scanner.nextInt();
        }

        System.out.print("Sua lista é: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
