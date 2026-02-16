package miniProjetos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CadastroProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        System.out.println("Bem-vindo ao sistema de cadastro");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome " + (i+1) + ";");
           nomes[i] = sc.nextLine();
        }
        System.out.println("Digite um nome que deseja encontrar");
        String busca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)){
                encontrado = true;
                System.out.println(nomes[i]);
            }
        }
        if (encontrado){
            System.out.println("usuario encontrado!");

        }else {
            System.out.println("Usuario nao encontrado");
        }
    sc.close();

    }
}
