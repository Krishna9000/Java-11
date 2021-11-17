package c4;

public class C010BoolLogic {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = a | b;
        var d = a & b;
        var e = a ^ b;
        var f = (!a & b) | ( a & !b);
        var g = !a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
