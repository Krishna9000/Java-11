package c06;

public class P002BoxDemo2 {
    public static void main(String[] args) {
        P001Box myBox1 = new P001Box();
        P001Box myBox2 = new P001Box();
        double vol;

        // assign values to mybox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // assign different values to mybox2's instance variables
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // compute volume of first box
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Volume is "+vol);
        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Volume is "+vol);
    }
}
