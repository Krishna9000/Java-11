package c06;

public class P005BoxDemo6 {
    public static void main(String[] args) {
        P005Box myBox1 = new P005Box();
        P005Box myBox2 = new P005Box();

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println(vol);
        vol = myBox2.volume();
        System.out.println(vol);

    }
}
