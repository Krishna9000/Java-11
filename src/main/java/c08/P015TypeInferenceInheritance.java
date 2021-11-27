package c08;

class Myclass{

}

class FirstDerivedClass extends Myclass{
    int x;
}

class SecondDerivedClass extends Myclass{
    int y;
}

public class P015TypeInferenceInheritance {

    static Myclass getObj(int which){
        switch (which){
            case 0: return new Myclass();
            case 1: return new FirstDerivedClass();
            default: return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);

        System.out.println(mc instanceof Myclass);
        System.out.println(mc2 instanceof FirstDerivedClass);
        System.out.println(mc3 instanceof SecondDerivedClass);
    }
}
