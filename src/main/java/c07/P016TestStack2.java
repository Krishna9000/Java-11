package c07;

public class P016TestStack2 {
    public static void main(String[] args) {
        P016Stack myStack1 = new P016Stack(5);
        P016Stack myStack2 = new P016Stack(8);

        // push some numbers onto the stack
        for(int i = 0; i < 5; i++) myStack1.push(i);
        for(int i = 0; i < 8; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for(int i = 0; i < 5; i++)
            System.out.print(myStack1.pop());

        System.out.println("Stack in myStack2: ");
        for(int i = 0; i < 8; i++)
            System.out.print(myStack2.pop());
    }
}
