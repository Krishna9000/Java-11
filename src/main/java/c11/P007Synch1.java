package c11;

public class P007Synch1 {
    public static void main(String[] args) {
        P007CallMe target = new P007CallMe();
        P007Caller ob1 = new P007Caller(target, "Hello");
        P007Caller ob2 = new P007Caller(target, "Synchronized");
        P007Caller ob3 = new P007Caller(target, "World");

        // start the threads
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        // wait for threads to end
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
