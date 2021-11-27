package c08;

public class P008Shipment extends P008BoxWeight{

    double cost;

    // construct clone of an object
    P008Shipment(P008Shipment ob){
        cost = ob.cost;
    }

    P008Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    P008Shipment(){
        super();
        cost = -1;
    }

    P008Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }

}
