package strings;

public class Stringp1 {

    public static void main (String[] args){
        String s1 = " 14k61a1205";
        String s2 = new String("hello ");

        String s3 = " 14k61a1205";
        String s4 = new String(" hello");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1==s2); // false
        System.out.println(" comparing ");
       // camparing data b/w  two strings use equals() method.
        System.out.println(" s1 and s2  are " + s1.equals(s2)); // false
        System.out.println(" S1 and s3 are " + s1.equals(s3)); // true
        System.out.println(" s1 and s4 are " + s1.equals(s4)); // false
       System.out.println(s1.startsWith(" 14 " ));


    }
}
