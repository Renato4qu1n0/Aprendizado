package Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args){
    /*
      Idéia do desafio, montar uma calculadora com 2 entradas do usuário
      e ele irá inserir a operação aritmética com o símbolo(+, -, * etc.)
      e com base no símbolo inserido a calculadora fará a operação.
     */

       /* Scanner entrada = new Scanner(System.in);
        System.out.println("Coloque o primeiro número:");
        double num1 = entrada.nextDouble();

        System.out.println("Coloque o segundo número:");
        double num2= entrada.nextDouble();

        System.out.println("Insira o símbolo da operação que deseja realizar:");
        String operacao = entrada.next();
        boolean aritmetica = true;
        if (aritmetica){

            operacao = "*";
            double vezes = num1 * num2;
            System.out.println("Resultado: " + vezes);

        }
         else {
            operacao = "+";
            double mais = num1 + num2;
            System.out.println("Resultado: " + mais);

     AQUI TERMINA MEU CÓDIGO PRIMEIRO E ERRADO
        }*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        double num1 = entrada.nextDouble();

        System.out.println("Entre com o segundo número:");
        double num2 = entrada.nextDouble();

        System.out.println("Entre com a operação:");
        String op = entrada.next();

        //lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.1f %s %.1f = %.1f", num1, op, num2, resultado);
        entrada.close();
    }
}