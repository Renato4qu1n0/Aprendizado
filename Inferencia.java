package Fundamentos;

public class Inferencia {
    public static void main(String[] args){

        /**
         * Inferencia de tipo é quando voce nao define o TIPO da variavel mas define o valor dela, fazendo isso o proprio
         * java vai entender da forma como ele espera o valor... no exemplo abaixo mostra que quando coloca um texto
         * entre "" ele entende que é um tipo character.
         */

        double a = 4.5; //Declarou e atribuiu um valor a variavel
        System.out.println(a);

        var b = "Textinho";
        var c = "NOME";

        System.out.println(c);
        System.out.println(b);



        double m;//declarou o nome da variavel e o tipo
        m = 15.5;//atribuiu o valor a variavel
        System.out.println(m);//chamou o resultado da variavel
    }
}
