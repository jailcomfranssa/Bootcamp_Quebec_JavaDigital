package one.digitalInnovation.basecamp.metodos;

public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("CALCULADORA: ");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.0);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        // Mensagem
        System.out.println("mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println(" empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        Emprestimo.calcular(10, 2);

    }
}
