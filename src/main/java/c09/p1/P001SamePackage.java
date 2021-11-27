package c09.p1;

public class P001SamePackage {
    P001SamePackage(){
        P001Protection protection = new P001Protection();
        System.out.println("same package constructor");
        System.out.println("n = "+ protection.n);
        System.out.println("n_pro = "+ protection.n_pro);
        System.out.println("n_pub = "+ protection.n_pub);
    }
}
