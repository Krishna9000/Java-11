package c08;

import c06.P004Box;

public class P005BoxWeight extends P003Box {
    double weight;

    // initialize width, height and depth using super()
    P005BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
}
