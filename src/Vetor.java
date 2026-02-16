import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] meusNumeros = new int[7];


        for (int i = 0; i < meusNumeros.length; i++) {
            System.out.println("digite um numero: ");
            meusNumeros[i] = sc.nextInt();
        }
        System.out.println("numeros digitados");
        for (int i = 0; i < meusNumeros.length; i++) {
            System.out.println(meusNumeros[i]);
        }
        sc.close();

    }
}
