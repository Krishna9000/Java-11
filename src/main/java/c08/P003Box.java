package c08;

public class P003Box {
    double width;
    double height;
    double depth;

    P003Box(P003Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    P003Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    P003Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    P003Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
