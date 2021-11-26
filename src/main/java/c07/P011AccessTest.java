package c07;

public class P011AccessTest {
    public static void main(String[] args) {
        P011Test ob = new P011Test();
        ob.a = 10;
        ob.b = 20;

//        The following won't execute
//        ob.c = 100;

        ob.setc(100);
        System.out.println("a, b and c: "+ob.a+", "+ob.b+", "+ob.getc());

    }
}
