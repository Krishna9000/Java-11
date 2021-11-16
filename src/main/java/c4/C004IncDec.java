package c4;

public class C004IncDec {
    public static void main(String[] args) {
        var a = 1;
        var b = 2;
        var c = ++b;
        var d = a++;
        c++;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
