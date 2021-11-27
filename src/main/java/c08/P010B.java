package c08;

public class P010B extends P010A{
    int k;
    P010B(int a, int b, int c){
        super(a,b);
        k = c;
    }

    void show(String msg){
        System.out.println(msg+k);
    }
}
