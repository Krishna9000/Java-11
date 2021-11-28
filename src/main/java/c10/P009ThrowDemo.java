package c10;

public class P009ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside demo proc.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught: "+e);
        }
    }
}
