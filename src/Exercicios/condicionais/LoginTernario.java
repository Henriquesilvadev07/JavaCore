package Exercicios.condicionais;

public class LoginTernario {
    public static void main(String[] args) {
        boolean logado = true;

        String permitido = "Acesso liberado";
        String naoPermitido = "Acesso negado";
        String login = logado ? permitido : naoPermitido;
        System.out.println(login);
    }
}
