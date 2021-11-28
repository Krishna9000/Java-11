package c11;

public class P008Consumer implements Runnable{

    P008Q q;
    Thread t;

    P008Consumer(P008Q q){
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while(true){
            q.get();
        }
    }
}
