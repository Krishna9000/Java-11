package c09;

public class P003B implements P003A.NestedIf{
    @Override
    public boolean isNotNetgative(int x) {
        return x < 0 ? false: true;
    }
}
