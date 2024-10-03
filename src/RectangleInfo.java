import java.util.Scanner;

public class RectangleInfo {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            double lengthNumber = 0.00;
            double widthNumber = 0.00;
            double areaNumber = 0.00;
            double perimeterNumber = 0.00;
            double pythagoreanNumber = 0.00;
            String trash = "";

            boolean done = false;
            do
            {
                System.out.print("Please enter the length of the rectangle: ");
                if(in.hasNextDouble())
                {
                    lengthNumber = in.nextDouble();
                    in.nextLine();
                    done = true;
                }
                else
                {

                    trash = in.nextLine();
                    System.out.println("You said your length: " + trash);
                    System.out.println("Please Input a valid amount");
                    done = false;
                }
            }while(!done);
            do
            {
                System.out.print("Please enter the width of the rectangle: ");
                if(in.hasNextDouble())
                {
                    widthNumber = in.nextDouble();

                    in.nextLine();
                    done = true;
                }
                else
                {

                    trash = in.nextLine();
                    System.out.println("You said your width was: " + trash);
                    System.out.println("Please Input a valid amount");
                    done = false;
                }
            }while(!done);
            areaNumber = lengthNumber * widthNumber;
            perimeterNumber = lengthNumber * 2 + widthNumber * 2;
            pythagoreanNumber = Math.pow(lengthNumber , 2) + Math.pow(widthNumber , 2);
            pythagoreanNumber = Math.sqrt(pythagoreanNumber);
            System.out.println("The area of your rectangle is: " + areaNumber);
            System.out.println("The perimeter of your rectangle is: " + perimeterNumber);
            System.out.println("The length of the diagonal of your rectangle is: " + pythagoreanNumber);


        }







}
