package c07;

public class P004Test {
    int a, b;

    P004Test(int i, int j){
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(P004Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
