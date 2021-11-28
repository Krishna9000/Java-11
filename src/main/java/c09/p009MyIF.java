package c09;

public interface p009MyIF {
    int getNumber();

    default String getString(){
        return "Default String";
    }

    static int getDefaultNumber(){
        return 0;
    }
}
