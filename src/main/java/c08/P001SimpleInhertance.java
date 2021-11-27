package c08;

public class P001SimpleInhertance {
    public static void main(String[] args) {
        P001A superOb = new P001A();
        P001B subOb = new P001B();

        // The superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb");
        superOb.showij();
        System.out.println();

        // The subclass access to all public members of its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
    }
}
