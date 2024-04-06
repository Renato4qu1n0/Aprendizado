package Desafios;

public class DesafioAritmetico {
    public static void main(String[] args){

/*        var a = 1;
        var b = 2;
        var c = 3;
        var d = 5;
        var e = 6;
        var f = 7;
        var g = 10;


        int resum = e*(c+b);
        int elvt = (int) Math.pow(resum, 2);
        int resdois =  elvt / c*b;
        System.out.println(resdois);

        int restres = (a-d)*(b-f);
        int elvts = (int) Math.pow(restres, c);
        int resquatro = elvts / b;
        System.out.println(resquatro);

        int rescin = resdois - resquatro;
        int elvtz = (int) Math.pow(rescin, c);
        System.out.println(elvtz);

        int elvtx = (int) Math.pow(g, c);
        int resultadogeral = elvtz /elvtx;
        System.out.println(resultadogeral);
 */

        int a = 3+2;
        int b = 6*a;
        int c = (int) Math.pow(b, 2);
        int d = 3*2;
        int db = c/d;
        System.out.println(db);

        int e = 1-5;
        int f = 2-7;
        int g = e*f;
        int h = g/2;
        int i = (int) Math.pow(h,2);
        System.out.println(i);

        int j = db-i;
        System.out.println(j);

        int k = 10;
        System.out.println(k);

        int l = (int) Math.pow(j,3);
        int m = (int) Math.pow(k,3);
        int resultadofinal = l/m;
        System.out.println(resultadofinal);
    }
}
