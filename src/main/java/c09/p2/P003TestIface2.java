package c09.p2;

import c09.P001Client;
import c09.P002Callback;

public class P003TestIface2 {
    public static void main(String[] args) {
        P002Callback c = new P001Client();
        P003AnotherClient ob = new P003AnotherClient();
        c.callback(5);
        c = ob;
        c.callback(5);
    }
}
