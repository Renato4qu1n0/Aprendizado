package Desafios;
import java.util.Scanner;
public class DesafioConceitosBasicos1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com os Farenheit:");
        int fh = entrada.nextInt();
        System.out.println("A conversão para Celsius é:");
        double celsius = (fh-32) / 1.8;
        System.out.print(celsius + "Cº");

    }
}
