public class DiceRoll {

  
  public static void main(String[] args) {
    
    System.out.println("Here are 20 random rolls of the dice:");

    int high = 6;
    int low = 1;
    

    for(int i = 1; i <= 20; i++){
      int ran = (int)((Math.random()*high - low + 1)) + low;
      System.out.print(ran + " ");
    }

  }
}



//This version uses a self created random int method


/*
public class DiceRoll {


  //incredibly important method used for finding random numbers within a certain range
  public static int randomInt(int low, int high){

      int result = (int)((Math.random()*(high - low + 1)) + low);
       return result;
    }



    public static void main(String[] args){

    int roll;
    
    System.out.println("Here are 20 random rolls of the dice:");

    for (int i=0; i<20; i++) {
      roll = randomInt(1, 6); 
      System.out.print(roll + " "); 
    }

    
    }

}

		
*/
