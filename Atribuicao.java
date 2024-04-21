package Fundamentos;

public class Atribuicao {
    public static void main(String[] args){

        int a = 3;
        int b = a;
        int c = a + b;
        int d = 5;

        c += b; // c = c + b;
        System.out.println(c);

        c -= a; // c = c - a;
        System.out.println(c);

        c *= b; // c = c * b;
        System.out.println(c);

        c /= a; // c = c / a;
        System.out.println(c);

        c %= 2; // c = c % 2;
        System.out.println(c);

        c++; // c = c + 1; "Nesse caso o Java atribui o valor 1 a variavel"
        System.out.println(c);

        d--; // d = d - 1; "Nesse caso o Java subtrai o valor 1 da variavel"
        System.out.println(d);


    }
}
