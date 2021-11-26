package c06;

public class P007Stack {
    int stck[] = new int[10];
    int tos;

    // Initialize top-of-stack
    P007Stack(){
        tos = -1;
    }

    // Push an item on to the stack
    void push(int i){
        if(tos==9)
            System.out.println("Stack is full");
        else {
            stck[++tos] = i;
        }
    }

    // Pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack is empth");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
