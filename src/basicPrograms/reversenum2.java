package basicPrograms;

import java.util.Scanner;

public class reversenum2 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out .println(" enter the number ");

        int a = sc.nextInt();
        int reminder;
        int reverse = 0;

        System.out.println(" Before reverse " + a );
        while(a>0){

            reminder =a%10;
            reverse = reverse*10+reminder;
            a = a/10;

            System.out.println(" After Reverse " +reverse);


        }
    }
}
