package ListaDaniel4;

import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        System.out.println("digite o seu nome de usuário: ");
        usuario = scanner.next();
        System.out.println("Digite sua senha: ");
        senha = scanner.next();

        while (usuario.equals(senha)) {
       System.out.println("ERRO! O usuário e senha não podem ser iguais: ");    
      
       System.out.println("digite o seu nome de usuário: ");
       usuario = scanner.next();
       System.out.println("Digite sua senha: ");
       senha = scanner.next(); 
        }
        if (usuario != senha) {
        System.out.println("Cadastro realizado com sucesso!");
        }
        scanner.close();
    }
}
