





import java.util.Scanner;
public class HeadsorTails{


  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    while(true){ //start

      System.out.println("Heads or tails? That is the question to be asked here!!!");
      System.out.println("(Press G to go and S to stop the program)");
      String ans = scan.next();

      if(ans.equalsIgnoreCase("S")){
        break;
      } 

              if(ans.equalsIgnoreCase("g")){
              int numb = (int)((Math.random() * (2 + 1 - 1)) + 1);

              if(numb == 1){
                System.out.println("Heads!\n");
                  } else{
                    System.out.println("Tails!\n");
                  }
              }else{
                System.out.println("||| Invalid response!!! |||");
                continue;
              }

    } //end

    scan.close();
  }
}






/*
//Old version
import java.util.Scanner;
public class HeadsorTails {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String game = "";
        String HoT = "";
        int coin = 0;

        
        while(true){// start of while loop
                System.out.println("Which will you choose little boy, Heads or Tails?");        
                System.out.println("(Press G to go and S to stop the program)");
                game = input.next();

                        if(game.equalsIgnoreCase("g")){

                        coin = (int)((Math.random() * (2 + 1 - 1)) + 1);// This is how you choose numbers to generate between
                        if(coin == 1){
                            HoT = ("HEADS!");
                        } else if (coin == 2){
                            HoT = ("TAILS!");
                        }

                        System.out.println(HoT+"\n");

                        } else if(game.equalsIgnoreCase("s")){
                            System.out.println("The program has ended");
                            break;
                        }
                }// end of while loop
                input.close();
            
    }
}
*/