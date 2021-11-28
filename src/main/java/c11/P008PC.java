package c11;

public class P008PC {
    public static void main(String[] args) {
        P008Q q = new P008Q();
        P008Producer p = new P008Producer(q);
        P008Consumer c = new P008Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop");
    }
}
