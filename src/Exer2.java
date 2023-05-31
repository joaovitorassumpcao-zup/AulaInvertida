import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] semana = {"", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        System.out.print("Digite o número do dia da semana: ");
        int dia = scanner.nextInt();

        if (dia > 7 || dia < 1) {
            System.out.println("Esse dia não existe!");
            return;
        }

        System.out.println("Dia " + dia + " é " + semana[dia]);
    }
}
