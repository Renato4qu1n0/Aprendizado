package Desafios;

import java.util.Scanner;

public class DesafioConceitosBasicos4 {
    public static void main(String[] args){

        System.out.println("Entre com o valor desejado.");
        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();
        double quadrado = valor*valor;
        double cubo = valor*valor*valor;

        System.out.println("O valor ao quadrado do número é: " + quadrado);
        System.out.println("O valor ao cubo do número é: " + cubo);
    }
}
