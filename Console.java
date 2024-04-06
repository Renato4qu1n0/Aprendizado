package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args){
        System.out.print("Bom");//Sem quebra de linha
        System.out.print("Dia\n\n");//sem quebra \n quebra a linha


        System.out.println("Dia");//Com quebra de linha
        System.out.println("Noite");

        System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5);//string formatada


        //System.out é uma saída de informação do sistema, mas o System.in é uma entrada de teclado, mouse, camera e etc...
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();//variavel string recebendo entrada do teclado
        String nomefinal = entrada.nextLine();
        int idade = entrada.nextInt();//variavel do tipo int salvando um numero com entrada do teclado
        double salario = entrada.nextDouble();


        System.out.println(nome + " "+ nomefinal + "\n" + idade + "\n" + salario);

    }
}
