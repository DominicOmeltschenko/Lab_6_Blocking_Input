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
        double celsiusTemp = 0.00;
        double CONSTANT = (double) 5 /9;
        String trash = "";

        boolean done = false;
        do
        {
            System.out.print("Please enter the Temperature: ");
            if(in.hasNextDouble())
            {
                currentTemp = in.nextDouble();
                celsiusTemp = CONSTANT * (currentTemp - 32);
                in.nextLine();
                done = true;
            }
            else
            {

                trash = in.nextLine();
                System.out.println();
                System.out.println();
            }
        }while(!done);
    }



}
