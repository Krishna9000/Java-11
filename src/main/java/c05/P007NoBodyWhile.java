package c05;

public class P007NoBodyWhile {
    public static void main(String[] args) {
        var i = 100;
        var j = 200;

        while(++i < --j);
        System.out.println("Midpoint is "+i);
    }
}
