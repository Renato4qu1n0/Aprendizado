package Fundamentos;

public class Aritmeticos {
    public static void main(String[] args){
/*
Expressões arítméticas que podemos usar em java e seus exemplos
+ = Soma;
- = Subtração;
/ = Divisão;
* = Multiplicação (Em expressões arítméticas ela é executada primeiro);
% = Resto da divisão;
*/
        System.out.println(2+3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);

        int a = 8 ;
        int b = 3 ;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a/ (float)b);
        System.out.println(a/ (double)b);

        System.out.println(a%b);
        System.out.println(8%3);

        System.out.println(x - y * a / b % a);
/*
Como elevar um número a 2ª potencia ou 3ª potencia;
 */
        int potencia = 3;
        int resultado = (int) Math.pow(potencia, 5);
        System.out.print(resultado);

    }
}
