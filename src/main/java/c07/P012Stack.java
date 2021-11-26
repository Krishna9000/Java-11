package c07;

public class P012Stack {
    private int stck[] = new int[10];
    private int tos;

//    Initialize top-of-stack
    P012Stack(){
        tos = -1;
    }

//    Push an item onto the stack
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

//    Pop an item from stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
