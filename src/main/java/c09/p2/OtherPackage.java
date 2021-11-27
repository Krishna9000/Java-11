package c09.p2;

import c09.p1.P001Protection;

public class OtherPackage {
    OtherPackage(){
        P001Protection p = new P001Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub = "+p.n_pub);
    }
}
