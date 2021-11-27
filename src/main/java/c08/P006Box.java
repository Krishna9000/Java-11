package c08;

public class P006Box {
    private double width;
    private double height;
    private double depth;

    P006Box(P006Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    P006Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    P006Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    P006Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
