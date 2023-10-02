//Imported the Random class for the dice
import java.util.Random;

public class DiceRoll {


        public static void main(String[] args) {
            System.out.print("You rolled a: " + RandomNumber()); // Tells the user what they rolled
        }
        public static int RandomNumber(){
            Random rand = new Random(); //Random number Object being created

            return rand.nextInt(6) + 1; //Random number that will be 1-6 like a real die
        }
}
