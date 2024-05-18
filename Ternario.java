package Fundamentos;

public class Ternario {
    public static void main(String[] args){

        double media = 6;
        //? significa SE
        //: significa Caso Contrário
        //O código é usado para retornar se um usuário está ou não aprovado ou
        //em recuperação. Usando a média como base;
        String resultado = media >=7.0 ? "Aprovado" : "Recuperação";
        System.out.println(resultado);

        /*Teste de interpretaçãod e código com o código abaixo.
        O Código tem por sua vez determinar se um aluno terá
        ou não desconto em sua mensalidade, para isso é colocado
        a nota que de acordo com a variavel passou deve ser igual ou
        maior que 5, com base nisso será validado o comportamento que
        está como true ou verdadeiro. Isso indica que o aluno teve
        um bom comportamento e ele só terá o desconto se a nota e o
        comportamento forem nota maior ou igual 5 e comportamento
        igual true. Com base nisso ele retorna se o aluno teve ou não
        desconto.
         */
        double nota = 9.9;
        boolean comportamento = true;
        boolean passou = nota >=5;
        boolean desconto = comportamento && passou;
        String resolucao = desconto ? "Sim." : "Não.";

        System.out.println(resolucao);

    }
}
