


import java.util.Random;
public class RandomInArray {

    public static void main(String[] args) {
        
        int[] squa = {50, 20, 25, 500, 30, 102};

        for(int i = 1; i <= 5; i++){
            System.out.println(squa[new Random().nextInt(squa.length)]);
        }

    }
}