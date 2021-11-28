package c11;

public class P002NewThread implements Runnable{
    Thread t;

    P002NewThread(){
        // Create a new, second Thread
        t = new Thread(this, "Demo thread");
        System.out.println("Child thread: "+t);
    }
    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
