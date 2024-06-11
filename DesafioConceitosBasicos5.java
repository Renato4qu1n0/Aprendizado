package Desafios;

import java.util.Scanner;

public class DesafioConceitosBasicos5 {
    public static void main(String[] args){
//base*altura/2
        System.out.println("Entre com a base do triângulo: ");
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();
        System.out.println("Entre com a altura do triângulo: ");
        int altura = entrada.nextInt();
        int area = (base*altura) / 2;
        System.out.println("A área do triângulo é de: " + area);
    }
}
