package c09;

public class IfTest3 {
    public static void main(String[] args) {
        P004IntStack myStack;
        P005DynStack ds = new P005DynStack(5);
        P004FixedStack fs = new P004FixedStack(8);

        myStack = ds;
        for(int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs;
        for(int i = 0; i < 8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("Values in dynamic stack: ");
        for (int i = 0; i < 12; i++)
            System.out.println(myStack.pop()+" ");
        System.out.println();

        myStack = fs;
        System.out.println("Values in fixed stack: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack.pop()+" ");
        System.out.println();
    }
}
