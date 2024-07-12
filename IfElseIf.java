package Controle;

import javax.swing.*;
import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota: ");

        double nota = entrada.nextDouble();
        if (nota > 10 || nota < 0) {
            System.out.println("Inválido");
        } else if (nota >= 8.1) {
            System.out.println("A");
        } else if (nota >= 6) {
            System.out.println("B");
        } else if (nota > 4.9) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        entrada.close();
       /*Forma suja de deixar o codigo
        if(nota >10 || nota <0){
            System.out.println("Inválido");
        }else if(nota >=8.1)
            System.out.println("A");
        if(nota >=6){
            System.out.println("B");
        }else {
            if (nota >4.9)
                System.out.println("C");
            else {
                System.out.println("D");
            }
        }
        */

    }
}
