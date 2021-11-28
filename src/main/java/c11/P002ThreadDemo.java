package c11;

public class P002ThreadDemo {
    public static void main(String[] args) {
        P002NewThread nt = new P002NewThread();

        nt.t.start();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted: "+e);
        }
        System.out.println("Main thread exiting");
    }
}
