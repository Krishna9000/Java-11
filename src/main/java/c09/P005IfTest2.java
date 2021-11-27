package c09;

public class P005IfTest2 {
    public static void main(String[] args) {
        P005DynStack myStack1 = new P005DynStack(5);
        P005DynStack myStack2 = new P005DynStack(8);

        // these loops cause each stack to grow
        for(int i = 0; i < 12; i++) myStack1.push(i);
        for(int i = 0; i < 20; i++) myStack2.push(i);

        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 12; i++) System.out.print(myStack1.pop()+" ");
        System.out.println();
        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 20; i++) System.out.print(myStack2.pop()+" ");
        System.out.println();
    }
}
