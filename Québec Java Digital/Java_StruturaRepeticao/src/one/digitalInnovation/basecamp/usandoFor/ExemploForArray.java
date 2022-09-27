package one.digitalInnovation.basecamp.usandoFor;

public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x<alunos.length; x++){
            System.out.println("O aluno no indice x= "+ x + " è " + alunos[x]);
        }

        System.out.println("/n");

        for (String aluno: alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }
}
