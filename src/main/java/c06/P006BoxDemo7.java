package c06;

public class P006BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate and initialize box objects
        P006Box myBox1 = new P006Box(10, 20, 15);
        P006Box myBox2 = new P006Box(3, 6, 9);
        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is "+vol);
        vol = myBox2.volume();
        System.out.println("Volume is "+vol);

    }
}
