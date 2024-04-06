package Fundamentos;

public class Wrappers {
    public static void main(String[] args){

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //int
        Long l = 100000L;


        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bd = Boolean.parseBoolean("true");
        System.out.println(bd);
        System.out.println(bd.toString().toUpperCase());
        System.out.println(("" + bd).toUpperCase()); // Mesmo resultado que a linha 18 mas muito feio para identação de código

        Character c = '#'; // char
        System.out.println(c.toString());

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5134;
        System.out.println(d);

    }
}
