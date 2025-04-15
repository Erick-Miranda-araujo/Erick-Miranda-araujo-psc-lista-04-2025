package ListaDaniel4;

import java.util.Scanner;

public class InformacoesCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        String nome = "", sexo = "", estadoCivil = "";
        double salario;

        System.out.println("Digite um nome com mais de três caracteres");
        nome = scanner.next();
        while (nome.length() > 3) {
            System.out.println("valido");
            break;
        }
        System.out.println("Digite uma idade entre 0 e 150");
        idade = scanner.nextInt();
        while (idade > 0 && idade < 150) {
            System.out.println("valido");
            break;
        }
        System.out.println("Digite o seu salário");
        salario = scanner.nextInt();
        while (salario > 0) {
            System.out.println("valido");
            break;
        }
        System.out.println("Digite o seu sexo feminino(f) ou masculino(m)");
        sexo = scanner.next();
        while (sexo.equals("f") || sexo.equals("m")) {
            System.out.println("valido");
            break;
        }
        System.out.println("Digite seu estado civil(s,c,d,v) ");
        estadoCivil = scanner.next();
        while (true) {
            if (estadoCivil == "s" || estadoCivil == "c" || estadoCivil == "v" || estadoCivil == "d") {
                System.out.println("valido");
            }
            break;
        }
        scanner.close();
    }
}