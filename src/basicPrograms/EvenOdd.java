package basicPrograms;

import java.util.Scanner;

public class EvenOdd {

    public static void main (String[] args){
System.out.println(" not example ");
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number ");

        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println( num + " is even number ");
        }else{
            System.out.println( num+ "  is odd number ");
        }
    }
}
