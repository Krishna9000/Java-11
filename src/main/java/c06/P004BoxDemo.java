package c06;

public class P004BoxDemo {
    public static void main(String[] args) {
        P004Box myBox1 = new P004Box();
        P004Box myBox2 = new P004Box();
        double vol;

        // initialize each box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(9, 6, 9);

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is "+vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is "+vol);
    }
}
