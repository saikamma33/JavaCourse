package arrays;

public class AllTypesOfArray {

    public static void main(String[] args) {

        int inArr[]= {11,22,33,44,55};
        double d[] = {10.5, 11.6, 23.7, 34.8, 46.9};
        char c[] = {'k' ,'s', 'b','m', 'n'};
        boolean b[] = {true , false, false ,true, false};

        System.out.print(" Interger Array :- ");

        for(int i=0; i<inArr.length; i++) {

            System.out.print(" intArr [" + i + "] = " + inArr[i] + " , ");
        }
        System.out.print("\n\n Double Array :- ");
        for(int i=0; i<d.length; i++) {
            System.out.print(" d [" + i + "] = " + d[i] + " , ");
        }

        System.out.print("\n\n characters :- ");
        for(int i=0; i<c.length; i++) {
            System.out.print(" c [" + i + "] = " + c[i] + " , ");
        }
        System.out.print("\n\n Boolean :- ");
        for(int i=0; i<b.length; i++) {
            System.out.print(" b [" + i + "] = " + b[i] + " , ");
        }
    }
}

