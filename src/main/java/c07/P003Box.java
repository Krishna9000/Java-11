package c07;

public class P003Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    P003Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
//    Constructor used when no dimensions specified
    P003Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    P003Box(double len){
        width = height = depth = len;
    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }
}
