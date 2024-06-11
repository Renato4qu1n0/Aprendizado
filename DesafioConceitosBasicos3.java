package Desafios;

import java.util.Scanner;

public class DesafioConceitosBasicos3 {
    public static void main(String[] args){

        System.out.println("Entre com seu peso em kg:");
        Scanner entrada = new Scanner(System.in);
        double peso = entrada.nextDouble();
        System.out.println("Entre com sua altura em m:");
        double altura = entrada.nextDouble();
        double imc = peso / (altura*altura);
        System.out.print("Seu IMC é: " + imc);

    }
}
