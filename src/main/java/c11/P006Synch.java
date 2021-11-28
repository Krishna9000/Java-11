package c11;

public class P006Synch {
    public static void main(String[] args) {
        P006Callme target = new P006Callme();
        P006Caller ob1 = new P006Caller(target, "hello");
        P006Caller ob2 = new P006Caller(target, "Synchronized");
        P006Caller ob3 = new P006Caller(target, "World");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
