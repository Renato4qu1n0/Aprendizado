package Desafios;
import java.util.Scanner;

public class DesafioConceitosBasicos2 {
    public static void main(String[] args){

        System.out.println("Entre com os Celsius");
        Scanner entrada = new Scanner(System.in);
        int celsius = entrada.nextInt();
        double fh = (celsius*1.8) + 32;
        System.out.println("O valor da conversão é:");
        System.out.print(fh + "Fº");
    }
}
