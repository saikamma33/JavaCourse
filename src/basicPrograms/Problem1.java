package basicPrograms;

import java.util.Scanner;

public class Problem1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the value of x ");
              int x = sc.nextInt();
        System.out.println(" Enter the value of z ");
        int z = sc.nextInt();

        if(x==z){
            System.out.println(x + " is equals to  " + z);
        }else if(x>z){
            System.out.println(x + " is greater than " + z);
        }else {
            System.out.println(x + " is lessthan " + z);
        }
problemone();
    }
    public static void problemone(){
        Scanner cs = new Scanner(System.in);

        System.out.println(" Enter the value of  m ");
        int m = cs.nextInt();

        System.out.println(" Enter the N value ");
        int n = cs.nextInt();

        if(m<n){
            System.out.println(" m is lessthan n ");
        }else if(m==n){
            System.out.println(" m is equals to n ");
        }else{
            System.out.println(" m is greater than n ");
        }

    }

    public static class Rev1 {

        public static void main(String[] args){
            int number = 365;
            int reversed = 0;
            int reminder;

            System.out.println("Original Number: " + number);

            while(number!=0){

                 reminder = number%10;
                 reversed = (reversed *10)+reminder;
                 number = number / 10;
                System.out.println("Reversed Number: " + reversed);
            }



        }
    }
}
