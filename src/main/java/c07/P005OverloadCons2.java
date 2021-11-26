package c07;

public class P005OverloadCons2 {
    public static void main(String[] args) {
        P005Box myBox1 = new P005Box(10, 20, 15);
        P005Box myBox2 = new P005Box();
        P005Box myBox3 = new P005Box(7);

        P005Box myClone = new P005Box(myBox1); // creating copy of myBox1

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of box 1: "+vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of box 2: "+vol);

        // get volume of cube
        vol = myBox3.volume();
        System.out.println("Volume of cube: "+vol);

        // get volume of clone
        vol = myClone.volume();
        System.out.println("Volume of box1 Clone: "+vol);

    }
}
