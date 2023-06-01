import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina o inicio do intervalo: ");
        int intervaloInicio = scanner.nextInt();

        System.out.print("Defina o fim do intervalo: ");
        int intervaloFim = scanner.nextInt();

        if (intervaloInicio >= intervaloFim) {
            System.out.println("Intervalo de valores inválido!");
            return;
        }

        for (int i = intervaloInicio; i <= intervaloFim; i++) {
                System.out.println(i);
        }

    }
}
