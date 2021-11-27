package c08;

public class P006DemoSuper {
    public static void main(String[] args) {
        P006BoxWeight myBox1 = new P006BoxWeight(10,20, 15, 34.3);
        var myBox2 = new P006BoxWeight(2, 3, 4, 0.076);
        var myBox3 = new P006BoxWeight();
        var myCube = new P006BoxWeight(3, 2);
        var myClone = new P006BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of box 1 is "+vol);
        System.out.println("Weight of box 1 is "+myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of box 2 is "+vol);
        System.out.println("Weight of box 2 is "+myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume of box 3 is "+vol);
        System.out.println("Weight of box 3 is "+myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone is "+vol);
        System.out.println("Weight of myClone is "+myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume of myCube is "+vol);
        System.out.println("Weight of myCube is "+myCube.weight);
        System.out.println();

    }
}
