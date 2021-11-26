package c07;

public class P007PassObjRef {
    public static void main(String[] args) {
        P007Test ob = new P007Test(15, 20);
        System.out.println("ob.a and ob.b before call: "+ob.a+" "+ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: "+ob.a+" "+ob.b);
    }
}
