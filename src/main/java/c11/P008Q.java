package c11;

public class P008Q {
    int n;

    synchronized  int get(){
        System.out.println("Got: "+n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: "+n);
    }
}
