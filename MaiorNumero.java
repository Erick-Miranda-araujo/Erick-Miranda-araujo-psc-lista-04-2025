package ListaDaniel4;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, maior = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
