package Exercicios.vetores;

public class NomesVetor {
    //esse exercicio é para alertar sobre nomes proibidos dentro do vetor//
    public static void main(String[] args) {

        String[] nomes = {"Henrique", "aline", "cilso", "admin", "milena", "marlene"};

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase("admin")){
                System.out.println("nome proibido encontrado !admin!");
            }else {
                System.out.println("Nomes permitidos: " + nomes[i]);
            }
        }
    }
}
