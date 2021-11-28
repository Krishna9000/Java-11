package c10;

public class P0013ChainExcDemo {
    static void demoproc(){
        // create an exception
        NullPointerException e = new NullPointerException("top layer");

        // add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Caught: "+e);
            System.out.println("Original cause: "+e.getCause());
        }
    }
}
