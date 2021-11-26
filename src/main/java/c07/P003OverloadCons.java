package c07;



public class P003OverloadCons {
    public static void main(String[] args) {
        // create boxes using the various constructors
        P003Box box1 = new P003Box(10, 20, 15);
        P003Box box2 = new P003Box();
        P003Box cube = new P003Box(7);

        double vol;

        // get volume of first box
        vol = box1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        vol = box2.volume();
        System.out.println("Volume of mybox1 is "+vol);
        vol = cube.volume();
        System.out.println("Volume of mybox1 is "+vol);

    }
}
