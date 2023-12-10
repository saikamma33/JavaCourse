package basicPrograms;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A number ");
        int num = sc.nextInt();
        int reminder = 0;
        int reverse = 0;
        int temp = num;

        while(num!=0 ){

            reminder = num%10;
            reverse = (reverse*10)+reminder;
            num = num/10;


        }
        if(reverse == temp){
             System.out.println(" Given number " + temp + " is palidrome ");
        }else{
            System.out.println(" Given number " + temp + " is not palidrome ");
        }

    }
}
