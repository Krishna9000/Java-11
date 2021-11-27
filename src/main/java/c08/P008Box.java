package c08;

public class P008Box {
    private double width;
    private double height;
    private double depth;

    P008Box(P008Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    P008Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    P008Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    P008Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
