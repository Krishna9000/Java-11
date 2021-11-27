package c09;

public class P003NestedIfDemo {
    public static void main(String[] args) {
        P003A.NestedIf nif = new P003B();

        if(nif.isNotNetgative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNetgative(-12))
            System.out.println("this won't be displayed");
    }
}
