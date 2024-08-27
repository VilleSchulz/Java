import java.util.Random;

public class RandomNumberGenerator{
    public static void main(String[] args){
        //create random object
        Random random = new Random(123);
        //create random number 0-99
        int randomInt = random.nextInt(100);
        // 0.0-1.0 väliltä(0-0.99999)
        double randomDouble = random.nextDouble();

        System.out.println(randomInt);
        System.out.println(randomDouble);
    }
}