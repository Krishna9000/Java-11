package c08;

public class P002Access {
    public static void main(String[] args) {
        var subOb = new P002B();
        subOb.setij(10,12);
        subOb.sum();
        System.out.println("Total is "+subOb.total);
    }
}
