package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args){
        System.out.println("2" == "2");

        String s = new String("2");
        //Não se usa == para comparar string pois pode retornar erro ou acerto.
        //Em via das duvidas, melhor não usar, para isso existe o .equals
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);

        //nextLine não retira os espaços em branco, se fosse apenas
        //next(); ele iria retirar os espaços em branco
        String s2 = entrada.nextLine();
        System.out.println("2" == s2);

        //.trim() serve para retirar os espaços em branco.
        System.out.println("2" == s2.trim());

        //Forma correta de se comparar
        System.out.println("2".equals(s2.trim()));


        entrada.close();

    }
}
