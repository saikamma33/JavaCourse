package basicPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the A value");
        int  a = input.nextInt();

        System.out.println(" Enter the B value ");
        int b = input.nextInt();

        System.out.println(" Before swapping " + a + "  and  " +  b);
        int temp ;
        temp = a;
         a = b;
          b= temp;

          System.out.println(" After Swapping " + a + " and "+ b);
    }
}
