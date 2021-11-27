package c08;

public class P008BoxWeight extends P008Box{

    double weight;

    P008BoxWeight(P008BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    P008BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    P008BoxWeight(){
        super();
        weight = -1;
    }

    P008BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
