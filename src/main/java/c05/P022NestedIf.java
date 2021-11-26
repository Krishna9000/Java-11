package c05;

public class P022NestedIf {
    public static void main(String[] args) {
        for( var i = 0; i < 10; i++){
            for( var j = i; j < 10; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
