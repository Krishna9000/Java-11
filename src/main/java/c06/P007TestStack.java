package c06;

public class P007TestStack {
    public static void main(String[] args) {
        P007Stack myStack = new P007Stack();
        P007Stack myStack2 = new P007Stack();

        // push some numbers onto the stack
        for(int i = 0; i < 10; i++) myStack.push(i);
        for(int i = 0; i < 20; i++) myStack2.push(i);

        // pop those numbers out of stack
        System.out.print("Stack in mystack1: ");
        for(int i = 0; i < 10; i++)
            System.out.print(myStack.pop());

        System.out.println();

        System.out.print("Stack in mystack2: ");
        for(int i = 0; i < 10; i++)
            System.out.print(myStack2.pop());


    }
}
