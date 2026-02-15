public class Ternario {
    public static void main(String[] args) {
        double salario = 6000;

        String mensagemDoar = "Vou doar 500 pro RickDev";
        String mensagemNaoDoar = "ainda não tenho condições mas vou ter";
        String resultado = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
