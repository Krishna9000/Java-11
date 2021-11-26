package c07;

public class P010Recursion2 {
    public static void main(String[] args) {
        P010RecTest ob = new P010RecTest(10);
        int i;

        for(i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);

    }
}
