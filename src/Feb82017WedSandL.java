import java.util.Scanner;

/*
*
* These problems do various tasks
*
* @author Robert Hill-Guarino
* @version Feb 8, 2017
*/
public class Feb82017WedSandL {

    public static void problem1()
    {
        String firstName;
        String middleName;
        String lastName;

        Scanner keyScan = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        firstName = keyScan.nextLine();

        System.out.println("Please enter your middle name:");
        middleName = keyScan.nextLine();

        Character middleInitial= middleName.charAt(0);

        System.out.println("Please enter your last name:");
        lastName = keyScan.nextLine();

        String middleI = middleInitial.toString();
        System.out.println("Your full name is:" + firstName + middleI + lastName);
        // you get to finish the rest of this method.


    }

    public static void problem2()
    {
        String response;

        Scanner keyScan = new Scanner(System.in);
        System.out.print("Enter a sentence or phrase with a ! somewhere inside it: ");
        response = keyScan.nextLine();

        response.
        // you get to finish the rest of this method.

    }

    public static void problem3()
    {
        // you get to create the contents of this method

    }

}

