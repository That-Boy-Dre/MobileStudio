import java.util.Scanner;

public class rounding {
  
  public static void main(String[] args) {
    

    Scanner scan = new Scanner(System.in);
    double digit = scan.nextDouble();

    System.out.printf("%.4f\n",digit);

    scan.close();
  }
}
