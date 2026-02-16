package Exercicios.condicionais;

import java.util.Scanner;

public class VotoCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeMinima = 16;

        System.out.println("Bem-vindo ao sistema de votação!");
        System.out.println("Digite sua idade para saber se ja pode votar: ");
        int idadeDigitada = sc.nextInt();

        if (idadeDigitada >= 18) {
            System.out.println("Muito bem voce pode votar!!");
        } else if (idadeDigitada >= 16 && idadeDigitada <= 17) {
            System.out.println("O voto é opcional");
        }else
        {
            System.out.println("que pena! sua idade não permite que voce vote ainda");
        }
        sc.close();

    }
}
