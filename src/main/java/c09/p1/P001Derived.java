package c09.p1;

public class P001Derived extends P001Protection{
    P001Derived(){
        System.out.println("derived constructor");
        System.out.println("n = "+n);
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}
