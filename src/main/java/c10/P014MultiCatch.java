package c10;

public class P014MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};

        try{
            int result = a / b;
            vals[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Caught "+e);
        }
        System.out.println("After multi-catch");
    }
}
