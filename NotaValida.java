package ListaDaniel4;

import java.util.Scanner;

public class NotaValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        System.out.println("Digite uma nota de 0 entre 10: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("nota Inválda\n" + "Digite a nota novamente:");
            nota = scanner.nextInt();
        }
        scanner.close();
    }
}
