package c09;

public interface P008MyIF {
    int getNumber();

    default String getString(){
        return "Default String";
    }
}
