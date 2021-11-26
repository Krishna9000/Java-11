package c07;

public class P001OverloadDemo {
    void test(){
        System.out.println("No Parameters");
    }

    // Overload test for one integer parameter
    void test(int a){
        System.out.println("a : "+a);
    }

    // Overload test for two integer parameters
    void test(int a, int b){
        System.out.println("a and b: "+a+", "+b);
    }

    // Overload test for double parameter
    double test(double a){
        System.out.println("Double a: "+a);
        return a*a;
    }
}
