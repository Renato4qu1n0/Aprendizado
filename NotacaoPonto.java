package Fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args){

        String s = "valor";
        s = s.toUpperCase();

        String y = "Bom dia"
                .replace("Bom", "Péssimo")
                        .toUpperCase()
                                .concat("!!!");

        System.out.println(y);

    }
}
