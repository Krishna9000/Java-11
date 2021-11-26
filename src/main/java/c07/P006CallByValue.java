package c07;

public class P006CallByValue {
    public static void main(String[] args) {
        P006Test ob = new P006Test();

        int a = 15;
        int b = 20;

        System.out.println("a and b before call: "+a+" "+b);
        ob.meth(a, b);
        System.out.println("a and b after call: "+a+" "+b);

    }
}
