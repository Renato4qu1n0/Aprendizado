package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;

        //A partir do momento que adiciona final antes da variavel ele transforma a variavel numa constante
        //Para poder diferenciar a variavel da constante pode ser feito usando a constante com letras maiusculas
        final double PI = 3.14159;
        double area = PI * raio * raio;

        System.out.println(area);


    }
}