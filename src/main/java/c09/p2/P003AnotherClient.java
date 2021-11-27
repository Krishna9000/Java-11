package c09.p2;

import c09.P002Callback;

public class P003AnotherClient implements P002Callback {
    @Override
    public void callback(int param) {
        System.out.println("Another version of callback");
        System.out.println("p squared is "+(param * param));
    }
}
