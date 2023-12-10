package basicPrograms;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the  A value ");
        int a = sc.nextInt();

        if(a%2 == 0){
            System.out.println( a +" A is even number ");
        }else{

            System.out.println( a + " A is odd number");
        }
        System.out.println(" Enter the B value  ");
        int b = sc.nextInt();
        System.out.println(" Enter the C value ");
        double c = sc.nextDouble();
        if(b>c){
        System.out.println(b + " is greater than " + c);
        }else if(b<c){
            System.out.println(b + " is lessthan " + c );
        }else{
            System.out.println(" A and b is equal ");
        }

    }
}
