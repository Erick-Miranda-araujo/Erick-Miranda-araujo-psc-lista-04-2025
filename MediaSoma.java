package ListaDaniel4;

import java.util.Scanner;

public class MediaSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            soma += numero;
        }
        media = soma / 5;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}
