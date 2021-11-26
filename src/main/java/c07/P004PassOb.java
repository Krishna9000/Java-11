package c07;

public class P004PassOb {
    public static void main(String[] args) {
        P004Test ob1 = new P004Test(100, 22);
        P004Test ob2 = new P004Test(100, 22);
        P004Test ob3 = new P004Test(-1, -1);

        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob1.equalTo(ob3));
    }
}
