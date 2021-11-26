package c06;

public class P003BoxDemo3 {
    public static void main(String[] args) {
        P003Box myBox = new P003Box();
        P003Box myBox2 = new P003Box();

        // assign values to box 1
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // assign values to box 2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // display volume of first box
        myBox.volume();

        // display volume of second box
        myBox2.volume();
    }
}
