package one.digitalInnovation.basecamp.tiposDeDados;

public class Main {
    public static void main(String[] args) {
        byte b1 = 20;
        byte b2 = 10;

        short s1 = 20000;
        //short s2 = 40000; Passou o limite máximo do short

      //  int i1 = -10000000000; acima do limite permitido
        int i2 = 28500;

       // long l1 = 1000000000000000000; precisa do L para identificar ser um long
        long l2 = 2004005005000550000L;

        //float f1 = 4.5; o java identifica como um double
        float f2 = 10.68f;

        double d1 = 58.69;
        double d2 = 99.04d;

        char c1 = 'w';
       // char c2 = 'Tw'; So recebe um carecter
        char c3 ='\u0057'; // representação de um unicod.

        String st1 = "Fulando";
        String st2 = "CICLANO";
        String st3 = "ad hbhb jijiswq vbbn";
        //String st4 = 12331; String nao aceita tipo numeric

        boolean bol1 = true;
        boolean bol2 = false;
        //boolean bol3 = 0; so aceita true ou false;


    }
}
