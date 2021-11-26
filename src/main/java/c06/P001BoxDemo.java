package c06;

public class P001BoxDemo {
    public static void main(String[] args) {
        P001Box myBox = new P001Box();
        double vol;

        // assign values to mybox's instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // compute volume of box
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is "+vol);
    }
}
