package c08;

public class P007B extends P007A{
    int i;

    P007B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("i in superclass is "+super.i);
        System.out.println("i in subclass is "+i);
    }
}
