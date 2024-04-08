package Fundamentos;

public class Relacionais {
    public static void main(String[] args){

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 != 4 );
        System.out.println(3 > 2);
        System.out.println(61 >= 4);
        System.out.println(33 < 4);
        System.out.println(3 <= 4);

        double notaMedia = 1.5;
        boolean boaReputacao = false;
        boolean passouDeAno = notaMedia >= 5;
        boolean desconto = boaReputacao && passouDeAno;

        System.out.println("Tem desconto?" + desconto);
    }
}
