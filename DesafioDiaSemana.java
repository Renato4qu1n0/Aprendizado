package Desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dia da Semana");

        String diasemana = entrada.next();

        if (diasemana.equalsIgnoreCase("Domingo")){
            System.out.println(1);
        }else if(diasemana.equalsIgnoreCase("Segunda")){
            System.out.println("2");
        }else if(diasemana.equalsIgnoreCase("Terça")){
            System.out.println("3");
        }else if(diasemana.equalsIgnoreCase("Quarta")){
            System.out.println("4");
        }else if(diasemana.equalsIgnoreCase("Quinta")){
            System.out.println("5");
        }else if(diasemana.equalsIgnoreCase("Sexta")){
            System.out.println("6");
        }else if(diasemana.equalsIgnoreCase("Sábado")){
            System.out.println("7");
        }
        //Outra forma:
        /*
        else if("sabado".equalsIgnoreCase(diasemana)){
            System.out.println("7");
         */



    }
}
