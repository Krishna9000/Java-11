package c05;

public class P017ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int x: nums){
            sum += x;
            if(x==5) break;
        }

        System.out.println("Summation is "+sum);
    }
}
