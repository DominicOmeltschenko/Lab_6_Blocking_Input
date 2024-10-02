import java.util.Scanner;

public class FuelCosts
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            double gallonsInTank = 0.00;
            double fuelEfficiency = 0.00;
            double gasPrice = 0.0;
            double tankCost = 0.00;
            double mileAmount = 0.00;
            String trash = "";

            boolean done = false;
            do
            {
                System.out.print("Please enter the number of gallons of gas you have in the tank: ");
                if(in.hasNextDouble())
                {
                    gallonsInTank = in.nextDouble();
                    in.nextLine();
                    done = true;
                }
                else
                {

                    trash = in.nextLine();
                    System.out.println("You said you temperature was: " + trash);
                    System.out.println("Please Input a valid amount");
                    done = false;
                }
            }while(!done);
            do
            {
                System.out.print("Please enter the fuel efficiency of your car (in mpg): ");
                if(in.hasNextDouble())
                {
                    fuelEfficiency = in.nextDouble();

                    in.nextLine();
                    done = true;
                }
                else
                {

                    trash = in.nextLine();
                    System.out.println("You said you temperature was: " + trash);
                    System.out.println("Please Input a valid amount");
                    done = false;
                }
            }while(!done);
            do
            {

                System.out.print("Please enter the price of a gallon of gas in your area: ");
                if(in.hasNextDouble())
                {
                    gasPrice = in.nextDouble();
                    in.nextLine();
                    done = true;
                }
                else
                {

                    trash = in.nextLine();
                    System.out.println("You said you temperature was: " + trash);
                    System.out.println("Please Input a valid amount");
                    done = false;
                }
            }while(!done);
            tankCost = (100.0 / fuelEfficiency) * gasPrice;
            mileAmount = (fuelEfficiency * gallonsInTank);
            System.out.println("It would cost you: " + tankCost + " dollars to go 100 miles.");
            System.out.println("You could drive " + mileAmount + " miles with a full tank of gas.");
        }

}
