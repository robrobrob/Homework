import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
*
* These problems do various tasks
*
* @author Robert Hill-Guarino
* @version Feb 8, 2017
*/
public class Feb82017WedSandL {

    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
    }
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
        System.out.println("Your full name is: " + firstName +" "+ middleI +" "+ lastName);
        // you get to finish the rest of this method.


    }

    public static void problem2()
    {
        String response;

        Scanner keyScan = new Scanner(System.in);
        System.out.print("Enter a sentence or phrase with a ! somewhere inside it: ");
        response = keyScan.nextLine();

        if (response.contains("!")){
            int i;
            int totalContent = response.length();
            for(i = 0; i<=totalContent;i++){
                char found = response.charAt(i);
                char exPoint = '!';
                if(found == exPoint){
                    int index = i;
                    int indexPlus = i+1;
                    System.out.println(response.substring(0,i));
                    System.out.println(response.substring(indexPlus,response.length()));
                    i = totalContent+1;
                }
            }
        }
        // you get to finish the rest of this method.

    }

    public static void problem3()
    {
        // you get to create the contents of this method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter anything!:");
        String output = input.nextLine();
        int lengthOfOutput = output.length();
        char firstLetter = output.charAt(output);
        String first = String.valueOf(firstLetter);
        char lastLetter = output.charAt(output.length());
        String last = String.valueOf(lastLetter);
        System.out.println(lengthOfOutput);
        System.out.println(first);
        System.out.println(last);

    }

    public static void problem4(){

    }

}

