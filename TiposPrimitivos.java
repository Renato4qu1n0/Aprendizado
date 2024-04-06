package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args)
    {
        //Informações do funcionario

        //Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo Booleano
        boolean estaDeFerias = false; //ou true

        //Tipo caractere
        char status = 'A'; //Ativo, tipo caractere aceita apenas uma letra

        //Dias de empresa
        System.out.println("Tempo de empresa(em anos): " + anosDeEmpresa * 365);
        //Numero de viagens
        System.out.println("Numero de vôos realizados: " + numeroDeVoos / 2);
        //Ponto por real
        System.out.println("Pontos que o funcionário acumulou: " + pontosAcumulados / vendasAcumuladas);

        System.out.println("Funcionário do id: " + id + " Ganha: R$" + salario);
        System.out.println("Férias: " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
