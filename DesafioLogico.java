package Desafios;

public class DesafioLogico {

/*
 Desafio Lógico - Uma pessoa tem 2 trabalhos na proxima semana, esse trabalho pode
 ou não ser confirmado.
 Se trabalhar na terça e na quinta, então irá no shopping com a familia no final
 de semana para tomar sorvete e comprar uma TV de 50".
 Se apenas o trabalho de terça der certo, então irão no shopping tomar sorvete e
 comprar uma TV de 32".
 Se nenhum dos dois trabalhos der certo então não fará nada
 */
    public static void main(String[] args){

        boolean terça = true;
        boolean quinta = true;
        boolean quintaf = false;
        boolean terçaf = false;


        boolean tv50 = terça && quinta;
        System.out.println("Comprou TV\"50? " + tv50);

        boolean tv32 = terça ^ quintaf;
        System.out.println("\nComprou a TV\"32? " + tv32);

        boolean semtv = terçaf || quintaf;
        System.out.println("\nFez alguma coisa?: " + semtv);
    }
}
