package c11;

public class P007Caller implements Runnable{
    String msg;
    P007CallMe target;
    Thread t;

    public P007Caller(P007CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    //synchronize calls to call()
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}
