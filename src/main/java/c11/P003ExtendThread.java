package c11;

public class P003ExtendThread {
    public static void main(String[] args) {
        P003NewThread nt = new P003NewThread();
        nt.start();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted"+e);
        }
        System.out.println("Main Thread Exiting");
    }
}
