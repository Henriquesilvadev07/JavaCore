package Exercicios.repeticao;

public class ConvidadosFor {
    public static void main(String[] args) {

        String[] convidados = {"João", "Matheus", "Vitória", "Rick", "Viviane", "Pedro", "Laura"};

        for (int i = 0; i < convidados.length; i++) {
            if (convidados[i].equalsIgnoreCase("rick")) {
                System.out.println("Convidado Vip : Rick");
            }else{
                System.out.println(convidados[i] + " Convidado Basic");
            }
        }
    }
}
