package ListaDaniel4;

import java.util.Scanner;

public class EntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, contador = 0;
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        for (contador = num1; contador <= num2; contador++) {
            System.out.println("\n" + contador);
        }
        scanner.close();
    }
}
