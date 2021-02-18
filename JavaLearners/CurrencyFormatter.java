
/*
Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' 
getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. 
Then print the formatted values as follows:
*/

import java.util.Locale; //Import locale to make things easier
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormatter {
  
  public static void main(String[] args) {
    
  Scanner scan = new Scanner(System.in);
  //System.out.print("Enter your intended amount: ");
  double payment = scan.nextDouble();

  /*
  If there isn't already a predefined country Locale for you then you'll have to 
  look up the country's code in the IANA Language Subtag Registry
  https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry
  or just simply google it
  */

  NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
  NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "in")); //This is required to look up the correct locale online.
  NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
  NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

  String US = (u.format(payment));
  String China = (c.format(payment));
  String India = (i.format(payment));
  String France = (f.format(payment));

  System.out.println("US: "+US);
  System.out.println("India: "+India);
  System.out.println("China: "+China);
  System.out.println("France: "+France);


    scan.close();
  }
}

/*
Enter your intended amount: 314431.432
US: $314,431.43
China ¥314,431.43
India ₹314,431.43
France 314.431,43 €
*/