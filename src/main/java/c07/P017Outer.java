package c07;

public class P017Outer {
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("display: outer_x = "+outer_x);
        }
    }
}
