package c07;

public class P005Box {
    double width;
    double height;
    double depth;

//    Notice this constructor. It takes an object of type Box.
    P005Box(P005Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

//    Constructor used when all dimensions specified
    P005Box( double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

//  Constructor used when no dimensions specified
    P005Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

//    Constructor used when cube is created
    P005Box(double len){
        width = height = depth = len;
    }

//    Compute and return volume
    double volume(){
        return width * height * depth;
    }
}
