package c07;

public class P007Test {
    int a, b;

    P007Test(int i, int j){
        a = i;
        b = j;
    }

    void meth(P007Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
