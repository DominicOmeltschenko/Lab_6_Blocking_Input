import java.util.Scanner;
import java.util.Random;
public class HighorLow {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = new Random().nextInt(10) + 1;
        int guessNumber = 0;
        String trash = "";



        boolean done = false;
        do
        {
            System.out.print("Please enter your guess (1-10): ");
            if(in.hasNextInt())
            {
                guessNumber = in.nextInt();
                in.nextLine();
                if(guessNumber >= 1 && guessNumber <= 10 )
                {
                done = true;
                }
                else {
                    System.out.println("Your guess was: " + guessNumber + " That is outside the range of 1 - 10, please input a valid amount");
                }
            }
            else
            {

                trash = in.nextLine();
                System.out.println("You said your guess was: " + trash);
                System.out.println("Please Input a valid amount");
                done = false;
            }
        }while(!done);
        if (guessNumber == randomNumber)
        {
           System.out.println("The random number was: " + randomNumber + " Your guess was Correct!");
        }
        else if (guessNumber > randomNumber)
        {
            System.out.println("The random number was: " + randomNumber + " Your guess was too high.");
        }
        else {
            System.out.println("The random number was: " + randomNumber + " Your guess was too low.");
        }

    }
}
