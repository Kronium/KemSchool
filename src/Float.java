import java.math.BigDecimal;
import java.util.Scanner;

public class Float {
    /*
      public static void main(String[] args) {
          String line;
          Scanner in = new Scanner(System.in);

          System.out.print("Say a numbie: ");
          line = in.nextLine();
          System.out.println(line + "0");
      }

     */
    //scanner

    /*
    first numbie
     */
    public static void main(String[] args) {

        // Telling the system to truncate ( a function defined below ) a decimal
        //Object 1
        Scanner myObj = new Scanner(System.in);
        System.out.println("Number 1: ");
        String numberOne = myObj.nextLine();

        System.out.println(truncateDecimal(Double.parseDouble(numberOne), 2));

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Number 2: ");
        String numberTwo = myObj2.nextLine();

        System.out.println(truncateDecimal(Double.parseDouble(numberTwo), 2));
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Number 3: ");
        String numberThree = myObj3.nextLine();

        System.out.println(truncateDecimal(Double.parseDouble(numberThree), 2));


    }
    //////////////////////////////////////////////
    //Telling the system how to truncate a decimal
    //This is the function referred to in System.out.println(truncateDecimal
    //
    //Double is your input number or x
    //Number of decimals is the number you want to go over so 2 = .00 and 3 = .000
    //////////////////////////////////////////////

    private static BigDecimal truncateDecimal(double x, int numberofDecimals) {
        if ( x > 0)
        {
            //This is telling it to return a string from the number x over 2 decimals if below 0

            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
        }
        else
        {
            //This is telling it to return a string from the number x over 2 decimals if above 0

            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
        }
    }

}