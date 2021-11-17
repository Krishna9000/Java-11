package c4;

public class C006ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int c = -64;
        c = c << 1;
        System.out.println(c);
        System.out.println(c<<1);
        System.out.println(c<<2);
        System.out.println(c<<3);
        System.out.println(c<<4);
        System.out.println(c<<5);
        System.out.println(c<<6);
        System.out.println(c<<7);
        System.out.println(c<<8);
        System.out.println(c<<9);
        System.out.println(c<<10);
        System.out.println(c<<11);
        System.out.println(c<<12);
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a: "+a);
        System.out.println("i and b: "+i+" "+b);
    }
}
