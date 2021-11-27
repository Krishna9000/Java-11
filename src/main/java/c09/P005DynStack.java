package c09;

public class P005DynStack implements P004IntStack{

    private int stck[];
    private int tos;

    P005DynStack(int size){
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if(tos==stck.length-1){
            int temp[] = new int[stck.length*2];
            for(int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if(tos<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
