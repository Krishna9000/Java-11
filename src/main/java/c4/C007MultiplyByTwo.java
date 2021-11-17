package c4;

public class C007MultiplyByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
