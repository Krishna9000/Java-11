package c07;

public class P002OverloadDemo {
    void test(){
        System.out.println("No Parameters");
    }

    void test(int a, int b){
        System.out.println("a and b: "+a+", "+b);
    }

    void test(double a){
        System.out.println("Inside test(double) a: "+a);
    }
}
