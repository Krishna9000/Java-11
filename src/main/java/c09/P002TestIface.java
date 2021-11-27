package c09;

public class P002TestIface {
    public static void main(String[] args) {
        P002Callback c = new P001Client();
        c.callback(5);
    }
}
