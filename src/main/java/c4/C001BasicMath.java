package c4;

public class C001BasicMath {
    public static void main(String[] args) {
        System.out.println("Integer Arithmetic");
        var a = 1 + 1;
        var b = a * 3;
        var c = b / 4;
        var d = c - a;
        var e = -d;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);

        System.out.println("/n Floating point Arithmetic");
        var da = 1d + 1d;
        var db = da * 3;
        var dc = db / 4;
        var dd = dc - 4;
        var de = -dd;
        System.out.println("da = "+da);
        System.out.println("db = "+db);
        System.out.println("dc = "+dc);
        System.out.println("dd = "+dd);
        System.out.println("de = "+de);
    }
}
