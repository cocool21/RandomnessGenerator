import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        System.out.println("Generate a random integer between 5 and 95");

        Random rnd = new Random();
        
        
          int randomInt = 5 + rnd.nextInt(90);
          System.out.println("Generated number: " + randomInt);
        
    
        System.out.println("Done.");
    }
}