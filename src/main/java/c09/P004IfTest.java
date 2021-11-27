package c09;

public class P004IfTest {
    public static void main(String[] args) {
        P004FixedStack myStack1 = new P004FixedStack(5);
        P004FixedStack myStack2 = new P004FixedStack(8);

        // push some numbers onto the stack
        for(int i = 0; i < 5; i++) myStack1.push(i);
        for(int i = 0; i < 8; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for(int i = 0; i < 5; i++){
            System.out.print(myStack1.pop()+" ");
        }
        System.out.println();


        // pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for(int i = 0; i < 8; i++){
            System.out.print(myStack2.pop()+" ");
        }
        System.out.println();
    }
}
