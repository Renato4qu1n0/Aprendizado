package Desafios;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {

    public static void main(String[] args){

        Locale.setDefault(new Locale("en", "US"));
    //Desafio: Usar o Scanner(entrada no terminal), pegar 3 strings que irão receber salários e a ideia é calcular
    //a média dividido por 3, o usuário deve poder entrar tanto com , ou com . para dividir os centavos.

        Scanner entrada = new Scanner(System.in);
        Double sal1 = entrada.nextDouble();
        System.out.println("O salário de março é: " + sal1);

        Double sal2 = entrada.nextDouble();
        System.out.println("O salário de abril é: " + sal2);

        Double sal3 = entrada.nextDouble();
        System.out.println("O salário de maio é: " + sal3);

        double media = sal1 + sal2 + sal3;

        System.out.println("A média dos 3 meses é: " + media / 3);
    }
}
