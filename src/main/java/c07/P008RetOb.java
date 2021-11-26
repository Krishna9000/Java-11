package c07;

public class P008RetOb {
    public static void main(String[] args) {
        P008Test ob1 = new P008Test(2);
        P008Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "+ob2.a);
    }
}
