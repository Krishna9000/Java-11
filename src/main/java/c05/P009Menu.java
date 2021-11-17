package c05;

import java.io.IOException;

public class P009Menu {
    public static void main(String[] args) throws IOException {
        char choice;

        do {
            System.out.println(" Help on: ");
            System.out.println("1.if 2.switch 3.while 4.do-while 5.for\n");
            System.out.println("Choose One:");
            choice = (char) System.in.read();
        }while(choice < '1' || choice > '5');
        System.out.println();

        switch (choice){
            case '1':
                System.out.println("If Condition");
                break;
            case '2':
                System.out.println("Switch Condition");
                break;
            case '3':
                System.out.println("While Statement");
                break;
            case '4':
                System.out.println("do-while Statement");
                break;
            case '5':
                System.out.println("for statement");
                break;
        }
    }
}
