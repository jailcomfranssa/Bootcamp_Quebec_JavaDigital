package one.digitalInnovation.basecamp.usandoForBreakContinue;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
