
import java.util.Random;
import java.util.Scanner;
public class HoTAlternate {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String game = "";
        String HoT = "";
        int coin = 0;

        Random rn = new Random();    

        while(true){// start of while loop
                System.out.println("Which will you choose little boy, Heads or Tails?");        
                System.out.println("(Press G to go and S to stop the program)");
                game = input.next();

                        if(game.equalsIgnoreCase("g")){

                        coin = rn.nextInt(3) ; //alternative to the Heads or tails program using the random class instead of the Math.Random() method
                        if(coin == 1){
                            HoT = ("HEADS!");
                            System.out.println(coin);
                        } else if (coin == 2){
                            System.out.println(coin);
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