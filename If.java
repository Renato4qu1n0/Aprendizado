package Controle;

import java.util.Scanner;

public class If {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a média: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("Aprovado");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("Recuperação");
        }
        /*
        Também poderia adicionar uma nova variavel ex:

        boolean criterioReprovacaoAtingindo = media < 4.5 && media >= 0;

        também iria retornar o código corretamente e ficaria de fácil leitura
        seria apenas necessário colocar a variavel fora do if com o calculo e dentro
        do if a variavel e o retorno no system.out.println .
         */
        if (media < 4.5 && media >= 0) {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
