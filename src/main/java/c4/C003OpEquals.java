package c4;

public class C003OpEquals {
    public static void main(String[] args) {
        var a = 1;
        var b = 2;
        var c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
