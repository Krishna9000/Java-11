package c08;

abstract class AA{
    abstract void callme();

    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}

class BA extends AA{
    void callme(){
        System.out.println("This is implementation of call me");
    }
}

public class P013AbstractDemo {

    public static void main(String[] args) {
        BA b = new BA();
        b.callme();
        b.callmetoo();
    }
}
