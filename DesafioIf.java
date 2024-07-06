package Desafios;

public class DesafioIf {
    public static void main(String[] args){

        double nota = 1.5;

        if(nota >= 9.0);{
            System.out.println("Aprovado");
        }
        /*O desafio é entender o porque que o código dessa forma retorna o APROVADO
        Minha resposta é: A partir do momento em que já foi atribuido valor a variavel o código irá ignorar o calculo
        e simplesmente irá retornar o Aprovado por saber que a variavel está dentro do IF.
         */
    }
}
