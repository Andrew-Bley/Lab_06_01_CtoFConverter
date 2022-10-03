import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double degCel = 0;

        System.out.print("\nEnter the degrees in Celcius: ");
        if(in.hasNextDouble())
        {
            degCel = in.nextDouble();
            in.nextLine();
            System.out.print("\nYou said your temperature is " + degCel);
        }
        else
        {
            trash = in.nextLine ();
            System.out.println(trash + " is an invalid input");
        }
        double degF = (degCel * 9 / 5 + 32 ) ;
        System.out.print("\nThe degrees in F is " + degF);



    }
}