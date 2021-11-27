package c09;

public class P004FixedStack implements P004IntStack{

    private int stck[];
    private int tos;

    P004FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    @Override
    public void push(int item) {
        if(tos==stck.length-1) // use length member
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
