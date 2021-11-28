package c11;

public class P005DemoJoin {
    public static void main(String[] args) {
        P005NewThread nt1 = new P005NewThread("one");
        P005NewThread nt2 = new P005NewThread("two");
        P005NewThread nt3 = new P005NewThread("three");

        // start the threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("thread one is alive: "+nt1.t.isAlive());
        System.out.println("thread two is alive: "+nt2.t.isAlive());
        System.out.println("thread three is alive: "+nt3.t.isAlive());

        try{
            System.out.println("Waiting for threads to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Thread One is alive : "+nt1.t.isAlive());
        System.out.println("Thread Two is alive : "+nt2.t.isAlive());
        System.out.println("Thread three is alive : "+nt3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
