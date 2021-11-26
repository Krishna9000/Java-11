package c06;

public class P005Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box
    P005Box(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // copute and return volume
    double volume(){
        return width * height * depth;
    }
}
