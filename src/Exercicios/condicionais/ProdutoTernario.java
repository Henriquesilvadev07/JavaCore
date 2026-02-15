package Exercicios.condicionais;

public class ProdutoTernario {
    public static void main(String[] args) {

        boolean estoque = true;
        String disponivel = "Produto disponivel no estoque";
        String indisponivel = "Produto indisponivel no estoque no momento";
        String resultado = estoque ? disponivel : indisponivel;
        System.out.println(resultado);

    }
}
