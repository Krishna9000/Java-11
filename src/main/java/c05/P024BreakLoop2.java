package c05;

public class P024BreakLoop2 {
    public static void main(String[] args) {
        var i = 0;
        while(i<100){
            if(i==10) break;
            System.out.println("i: "+i);
            i++;
        }
        System.out.println("Loop complete");
    }
}
