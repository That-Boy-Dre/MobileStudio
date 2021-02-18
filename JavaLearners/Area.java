


//Static initialization blocks are executed when the class is loaded, 
//and you can initialize static variables in those blocks.


import java.util.*;
public class Area {

  static Scanner scan = new Scanner(System.in);
  static int B = scan.nextInt();
  static int H = scan.nextInt();
  static boolean flag = true;

  //A static initialization blocks allows more complex initialization, for 
  //example using conditionals:
  
  static{ //static block can't contain assigned variables
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }

}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class