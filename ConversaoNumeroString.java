package Fundamentos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConversaoNumeroString {
    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("teste" + num1).length());
        System.out.println(("teste" + num2).length());
    }
}