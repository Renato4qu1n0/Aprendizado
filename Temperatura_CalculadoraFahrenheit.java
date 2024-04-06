package Fundamentos;

public class Temperatura_CalculadoraFahrenheit {
    public static void main(String[] args){
        //Formula de conversão Fª para Cª (Fª - 32) x 5/9 = ªC

        int fahrenheit = 0;
        final int cinco = 5;
        final double ninezin = 9.0;
        double conversor = (fahrenheit - 32) * cinco / ninezin;

        System.out.println("O resultado é: " + conversor + "ºC");
    }
}
