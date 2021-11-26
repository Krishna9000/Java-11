package c07;

public class P010RecTest {
    int values[];

    P010RecTest(int i){
        values = new int[i];
    }

    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"]"+values[i-1]);
    }
}
