package sample;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {

        Calculo soma = (a, b) -> a + b; // atribui o comportamento da lambda a variavel soma
        Calculo subtracao = (a, b) -> a - b;
        Calculo divisao = (a, b) -> a / b;
        Calculo mult = (a, b) -> a * b;

        System.out.println(executarOperacao(soma,5,3)); // passa o comportamento de soma, com os valores a serem usados em "a" e "b";
        System.out.println(executarOperacao(subtracao,5,3));
        System.out.println(executarOperacao(divisao,94,10));
        System.out.println(executarOperacao(mult,5,3));


    }

    public static int executarOperacao(Calculo calculo, int a, int b) {


        return calculo.calcular(a,b); //recebe o comportamento da lambda junto com os valores a serem calculados, com a assinatura definida na interface
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}
