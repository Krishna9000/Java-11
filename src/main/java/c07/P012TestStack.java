package c07;

public class P012TestStack {
    public static void main(String[] args) {
        P012Stack myStack1 = new P012Stack();
        P012Stack myStack2 = new P012Stack();

        // push some numbers onto the stack
        for(int i = 0; i<10; i++) myStack1.push(i);
        for(int i = 10; i<10; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for (int i = 0; i<10; i++){
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack in myStack2: ");
        for (int i = 0; i<10; i++){
            System.out.println(myStack2.pop());
        }

    }
}
