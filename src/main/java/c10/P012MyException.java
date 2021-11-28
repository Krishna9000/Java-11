package c10;

public class P012MyException extends Exception{
    private int detail;

    P012MyException(int a){
        detail = a;
    }

    public String toString(){
        return "myException["+detail+"]";
    }
}

class ExceptionDemo{
    static void compute(int a) throws P012MyException{
        System.out.println("Called compute("+a+")");
        if(a>10)
            throw new P012MyException(a);
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }catch (P012MyException e){
            System.out.println("Caught "+e);
        }
    }
}