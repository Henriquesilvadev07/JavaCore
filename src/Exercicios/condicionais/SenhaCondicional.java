package Exercicios.condicionais;

import java.util.Scanner;

public class SenhaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "senha123";

        System.out.println("Digite a senha: ");

        String senhaDigitada = sc.nextLine();

        if(senha.equals(senhaDigitada)) {
            System.out.println("senha correta, acesso liberado");
        }else {
            System.out.println("Senha incorreta, acesso negado!!!#@$%#%$ˆ$(ˆ&*");
        }
        sc.close();

    }
}
