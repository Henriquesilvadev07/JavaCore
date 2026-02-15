package Exercicios.condicionais;

public class IdadeTernario {
    public static void main(String[] args) {
        int idade = 16;
        String liberado = "Pode entrar";
        String negado = "Entrada proibida";
        String acesso = idade >= 18 ? liberado : negado;
        System.out.println(acesso);

    }
}
