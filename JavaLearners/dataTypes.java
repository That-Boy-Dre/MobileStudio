

import java.util.*;
import java.io.*;



class dataTypes{
    public static void main(String []args){
    

        System.out.print("Enter the amount of test cases you would wish to try: ");

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){ //Begining of for loop
            System.out.println("Enter a primitive digit to find it's appropriate data type");

            try{
            
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x >= -128 && x <= 127){
                  System.out.println("* byte");
                } else if(x >= -32768 && x <= 32767){
                  System.out.println("* short");
                } else if(x >= -2147483648 && x <= 2147483647){
                  System.out.println("* int");
                } else if(x >= (int)(Math.pow(-2, 63)) && x <= (int)(Math.pow(2, 63))-1){
                  System.out.println("* long");
                }

                

             




            }
            catch(Exception e){
              System.out.println(sc.next()+" can't be fitted anywhere.");
            }
            

        } //End of for loop

        sc.close();
    }
}



