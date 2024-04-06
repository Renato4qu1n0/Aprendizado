package Fundamentos;

public class TipoString {
    public static void main(String[] args){

        System.out.println("Ola pessoal".charAt(3));

        String s = "BOA TARDE";
        s = s.toUpperCase();//transforma os caracteres em maiusculo
        System.out.println(s.concat("!!"));//concat = concatenar um outro texto
        System.out.println(s.startsWith("BOA"));//informa se no texto tem a informação "BOA" se sim true se não false
        System.out.println("BOM\n Dia");//o \n quebra a linha do texto
        System.out.println(s.toLowerCase());//transforma caracteres em minusculo

        var nome = "Renato";
        var sobrenome = "Aquino";
        var idade = "23";
        var salario = 1900.00F;

        System.out.println("O senhor: " + nome + " " + sobrenome + " possui " + idade + " anos e recebe R$" + salario +  " por mês.");
    }
}
