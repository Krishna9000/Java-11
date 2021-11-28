package c11;

public class P008Producer implements Runnable{
    P008Q q;
    Thread t;

    P008Producer(P008Q q){
        this.q = q;
        t = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
