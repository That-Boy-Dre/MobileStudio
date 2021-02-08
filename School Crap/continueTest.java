

public class continueTest {

  public static void main(String[] args) {
    

     //print numbers from 1 to 20 but skip 12
     int numbers = 0;

     while(numbers < 20){
          numbers = numbers + 2;
 
          if(numbers == 12){
            continue;
          }
       
          System.out.print(numbers + " ");
         }


  }
}