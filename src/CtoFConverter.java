import java.util.Scanner;
public class CtoFConverter {

    //start
    //	output “Please insert your temperature”
    //	input currentTemp
    //	celsiusTemp = celsiusTemp = 5/9 * (currentTemp - 32)
    //	output “Your temperature in celsius is:” + celsiusTemp
    //end
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double currentTemp = 0.00;
        double fahrenheitTemp = 0.00;
        double CONSTANT = 1.8;
        String trash = "";

        boolean done = false;
        do
        {
            System.out.print("Please enter the Temperature (in Celsius): ");
            if(in.hasNextDouble())
            {
                currentTemp = in.nextDouble();
                fahrenheitTemp = (currentTemp * CONSTANT) + 32;
                System.out.print("Your temperature in Fahrenheit is: " + fahrenheitTemp);
                in.nextLine();
                done = true;
            }
            else
            {

                trash = in.nextLine();
                System.out.println("You said your temperature was: " + trash);
                System.out.println("Please Input a valid amount");
            }
        }while(!done);
    }



}
