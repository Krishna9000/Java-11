package c08;



public class P011Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        var c = new C();

        A r;

        r = a;
        r.callme();

        r=b;
        r.callme();

        r=c;
        r.callme();
    }
}

class A{
    void callme(){
        System.out.println("inside A's callme method");
    }
}

class B extends A {
    void callme(){
        System.out.println("inside B's callme method");
    }
}

class C extends A {
    void callme(){
        System.out.println("inside C's call me method");
    }
}
