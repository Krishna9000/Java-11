package c11;

public class P006Caller implements Runnable{
    String msg;
    P006Callme target;
    Thread t;

    public P006Caller(P006Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run(){
        target.call(msg);
    }
}
