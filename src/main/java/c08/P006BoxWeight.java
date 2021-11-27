package c08;

public class P006BoxWeight extends P006Box{
    double weight;

    P006BoxWeight(P006BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    // constructor when all parameters are specified
    P006BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    P006BoxWeight(){
        super();
        weight = -1;
    }

    P006BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
