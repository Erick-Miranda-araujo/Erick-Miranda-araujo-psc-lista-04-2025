package ListaDaniel4;

public class Populacao {
    public static void main(String[] args) {
        int paisA = 80000, paisB = 200000;
        double taxaA = 0.03, taxaB = 0.015;
        int ano = 0;
        while (paisA <= paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            ano++;
        }
 System.out.println("Serão necessários " + ano + " anos para a população do país A se tornar maior que a do país b");
    }
}
