package c11;

public class P006Callme {
    synchronized void call(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
