package c4;

public class C011Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println(k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println(k);
    }
}
