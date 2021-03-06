package c07;

public class P016Stack {
    private int stck[];
    private int tos;

    // allocate and initialize stack
    P016Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    // push an item on to the stack
    void push(int item){
        if(tos==stck.length-1)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    // Pop an item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else return stck[tos--];
    }
}
