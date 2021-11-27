package c08;

public class P002B extends P002A{

    int total;
    void sum(){
//        total = i + j; // Error, j is not accessible.
        total = i;
    }
}
