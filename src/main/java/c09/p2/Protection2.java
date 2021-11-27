package c09.p2;

import c09.p1.P001Protection;

public class Protection2 extends P001Protection {
    Protection2(){
        System.out.println("derived other package constructor");
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}
