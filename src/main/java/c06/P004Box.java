package c06;

public class P004Box {
    double width;
    double height;
    double depth;

    // compute and return volume
    double volume(){
        return width * height * depth;
    }

    // sets dimensions of a box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
