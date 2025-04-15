package ListaDaniel4;

import java.util.Scanner;

public class PopulacaoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paisA = 0, paisB = 0, ano = 0;
        double taxaA = 0, taxaB = 0;

        System.out.println("Qual é a população do país A?");
        paisA = scanner.nextInt();
        System.out.println("Qual é a população do país B?");
        paisB = scanner.nextInt();
        System.out.println("Qual é a taxa de crescimento do país A?");
        taxaA = scanner.nextDouble();
        System.out.println("Qual é a taxa de crescimento do país B?");
        taxaB = scanner.nextDouble();

        while (paisA <= paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            ano++;
        }
        System.out.println("Serão necessários " + ano + " anos para a população do pais A se tornar maior que a do pais b");
        scanner.close();
    }
}
