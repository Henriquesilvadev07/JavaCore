package Exercicios.vetores;

public class ParesVetor {

    //esse exercício mostra os valores em posições pares, não os valores pares
    public static void main(String[] args) {

        int[] numeros = {17, 43, 5, 9, 0, 3, 8};

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
