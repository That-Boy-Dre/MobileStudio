
import java.text.NumberFormat;
public class Numberformatter {
    
    public static void main(String[] args) {

        double crabs = 543.2773;
        double squid = 3213.31223;
        NumberFormat boo = NumberFormat.getCurrencyInstance();
        NumberFormat geen = NumberFormat.getCompactNumberInstance();

        System.out.println(boo.format(crabs));
        System.out.println(geen.format(squid));

       String bird = ("swallow");
        System.out.println(bird.substring(0, 3));


        
    }
}
