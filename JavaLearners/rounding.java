import java.util.Scanner;

public class rounding {
  
  public static void main(String[] args) {
    

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the decimal your trying to round up");
    double digit = scan.nextDouble();

    System.out.printf("%.1f\n",digit);

    scan.close();
  }
}
