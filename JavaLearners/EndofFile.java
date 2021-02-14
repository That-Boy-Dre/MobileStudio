
import java.util.Scanner;
public class EndofFile {
  

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String words = "";
    boolean inputAsked = true;
    int count = -1;
    
    while(inputAsked){
      count++;
      words = scan.nextLine();

      if(words.equalsIgnoreCase("finish")){
        inputAsked = false;

      }
    }
    
    for(int i = 0; i <= count; i++){
    System.out.println(count+" "+words);
    }
    

    scan.close();
  }

}
