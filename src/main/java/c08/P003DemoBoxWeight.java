package c08;

public class P003DemoBoxWeight {
    public static void main(String[] args) {
        var myBox1 = new P003BoxWeight(10, 20, 15, 34.3);
        var myBox2 = new P003BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        System.out.println("Weight of mybox1 is "+myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of mybox2 is "+vol);
        System.out.println("Weight of mybox2 is "+myBox2.weight);

    }
}
