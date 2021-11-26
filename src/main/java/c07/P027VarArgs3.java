package c07;

public class P027VarArgs3 {
    static void vaTest(int ...v){
        System.out.println("vaTest(int ...): "+"Number of args: "+v.length+" Contents");
        for(int x: v)
            System.out.println(x+" ");
        System.out.println();
    }

    static void vaTest(boolean ...v){
        System.out.println("vaTest(boolean) "+"Number of args: "+v.length+" Contents");
        for(boolean x: v)
            System.out.println(x + " ");
        System.out.println();
    }

    static void vaTest(double ...v){
        System.out.println("vaTest(double) "+"Number of args: "+v.length+" Contents");
        for(double x: v)
            System.out.println(x + " ");
        System.out.println();
    }

    static void vaTest(String s, double ...v){
        System.out.println("vaTest(String, double...): Message: "+s+" ,Number of args: "+v.length+" Contents");
        for(double x: v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true, true, false);
        vaTest(1.2,2.3,3);
        vaTest("Testing", 1.2,2.3,3);
    }
}
