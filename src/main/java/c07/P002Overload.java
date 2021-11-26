package c07;

public class P002Overload {
    public static void main(String[] args) {
        P002OverloadDemo ob = new P002OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}
