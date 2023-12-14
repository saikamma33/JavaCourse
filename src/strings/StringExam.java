package strings;

public class StringExam {

    public static void main (String[] args){

        String s1 = "java";
        String s2 = new String("coding");
        String s3 = "JAVA";
        String s4 = new String("DevelopMent ");
        String s5 = "java";
        String s6 = new String("java");


        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1.equals(s6));
        System.out.println(s3.equalsIgnoreCase(s5));
        System.out.println(s1.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s1.startsWith("j"));
        System.out.println(s1.endsWith("a"));
        System.out.println(s1.replace("j" , "k"));
        System.out.println(s1.repeat(5));
        System.out.println(s1.concat(s2));

        System.out.println(" length of the word is  " + s1.length());

        System.out.println(s1.substring(0,4));
        System.out.println(s1.charAt(3));

    }
}
