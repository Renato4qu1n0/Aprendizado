package Controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args)
    {
        String valor = JOptionPane.showInputDialog("Informe o número:");

        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        //pode ou não usar as chaves { } para definir o bloco de codigo do if e else.
    }
}
