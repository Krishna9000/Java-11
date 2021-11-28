package c11;

public class P004MultiThreadDemo {
    public static void main(String[] args) {
        P004NewThread nt1 = new P004NewThread("One");
        P004NewThread nt2 = new P004NewThread("Two");
        P004NewThread nt3 = new P004NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
