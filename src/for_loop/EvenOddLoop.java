package for_loop;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class EvenOddLoop {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the starting number ");
        int startingNumber = sc.nextInt();

        System.out.println(" Enter the Ending number ");
        int endingNumber = sc.nextInt();

        System.out.println(" Here is the even numbers ");
        for(int number = startingNumber; number<=endingNumber; number++){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
