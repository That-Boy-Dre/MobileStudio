

/*

for all the people who are saying that how will the scanner.hasNext() condition will come false,then listen folks. it is not described here but
the input is coming from a text file and the scanner object starts to read from the top and reads upto the end. when the end of the text file 
comes as there is nothing to read the condition become false and loop brakes.

*/


//The challenge here is to read lines of input until you reach EOF, then number and print all


import java.util.Scanner;
public class EndOfFile {
  

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    for(int i = 1; scan.hasNext() == true; i++){ //scan.hasNext() == true makes a loop to keep asking for user input
      System.out.println(i+" "+scan.nextLine());
    }

    scan.close();
  }
}

/*
hello world
1 hello world
hello world
2 hello world
hello world
3 hello world
hello world
4 hello world
hello world
5 hello world
hello world
6 hello world
*/

