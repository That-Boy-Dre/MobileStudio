


import java.util.*;

public class StringMethods {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
     
        //Sums the length of A and B
        System.out.println(A.length()+B.length());
        //==================================================== part1

        //Determines if A is alphabetically farther than B
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        //==================================================== part2

        //Capitalizes the first letter in A and B and print them on a single line, separated by a space.
        String output1 = A.substring(0, 1).toUpperCase() + A.substring(1);//example of calling a method on a method
        String output2 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(output1+" "+output2);
        //==================================================== part3
        sc.close();

    }
}

