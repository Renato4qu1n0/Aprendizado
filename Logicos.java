package Fundamentos;

public class Logicos {

    public static void main(String[] args){
/*
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println(true && false);
        //E(Só retornará verdadeiro se as 2 condições forem verdadeiras)  -  and
        System.out.println(condicao1 && condicao2);
        //Ou(Só retornará falso se as 2 condições forem falsos) -  Or
        System.out.println(condicao1 || condicao2);
        //Ou Exclusivo(Exclusivamente verdadeiro, então apenas 1 pode ser verdadeiro)  -  Xor
        System.out.println(condicao1 ^ condicao2);
        //Negação lógica(Se a condição 1 for verdadeira retornará
        // falso e se a condição 2 for falsa então retornará verdadeiro)
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        //Retornará true por conta que está negando a condição 2
        System.out.println(condicao1 && !condicao2);
        //Retornará verdadeiro por conta que colocou uma dupla negação
        //Se fosse uma '!' apenas ele retornaria falso
        System.out.println(!!condicao1);

*/
        /*TABELA VERDADE E(AND)*/
        System.out.println("Tabela Verdade: E");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        /*TABELA VERDADE OU(OR)*/
        System.out.println("\nTabela Verdade: Ou");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        /*TABELA VERDADE OU EXCLUSIVO(XOR)*/
        System.out.println("\nTabela Verdade: Ou Exclusivo");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        /*TABELA VERDADE NEGAÇÃO LOGICA(NOT)*/
        System.out.println("Tabela Verdade: Negação logica");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!!true);
        System.out.println(!!false);
    }
}