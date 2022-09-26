package one.digitalInnovation.basecamp.metodos;

public class Calculadora {

    public static void soma(double x1, double x2){
        double resultado = x1 + x2;
        System.out.println("A soma de "  + x1+ " mais " + x2 + " é "+ resultado);
    }

    public static void subtracao(double x1, double x2){
        double resultado = x1 - x2;
        System.out.println("A subtração de "  + x1+ " mais " + x2 + " é "+ resultado);
    }

    public static void multiplicacao(double x1, double x2){
        double resultado = x1 * x2;
        System.out.println("A Multiplicação de "  + x1+ " mais " + x2 + " é "+ resultado);
    }

    public static void divisao(double x1, double x2){
        double resultado = x1 / x2;
        System.out.println("A divisão de "  + x1+ " mais " + x2 + " é "+ resultado);
    }

}
