package c3;

public class Scopes {
    public static void main(String[] args) {
        int x;
        x = 10;
        if(x == 10) {
            int y = 20;
        }
        // y is not known outside the block
        System.out.println("x and y "+x);
    }
}
