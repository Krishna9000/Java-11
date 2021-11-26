package c07;

public class P008Test {
    int a;

    P008Test(int i){
        a = i;
    }

    P008Test incrByTen(){
        P008Test temp = new P008Test(a+10);
        return temp;
    }
}
