package c08;

public class P004RefDemo {
    public static void main(String[] args) {
        P003BoxWeight weightbox = new P003BoxWeight(3,5,7,8.37);
        P003Box plainbox = new P003Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is "+vol);
        System.out.println("Weight of weightbox is "+weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Volume of plainbox "+vol);
//        System.out.println("Weight of plainbox is "+plainbox.weight);
    }
}
