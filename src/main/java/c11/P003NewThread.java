package c11;

public class P003NewThread extends Thread{
    P003NewThread(){
        super("Demo Thread");
        System.out.println("Child Thread: "+this);
    }

    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
