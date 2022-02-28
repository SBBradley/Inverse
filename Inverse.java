import java.util.Scanner;

/*
* A program that inverses the letters in a user's name.
* Date: Feb 14, 2022
*/
class Inverse {

    private static String firstName = "";
    private static String firstNameInverse = "";
    private static String middleName = "";
    private static String middleNameInverse = "";
    private static String lastName = "";
    private static String lastNameInverse = "";
    private static String fullNameInverse = "";
    private static char letter;

    //The main method will gather user's name with a scanner.
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Enter first name.");
    firstName = scan.nextLine();

    System.out.println();
    System.out.println("Enter middle name. (if no middle name, enter n/a)");
    middleName = scan.nextLine();

    System.out.println();
    System.out.println("Enter last name.");
    lastName = scan.nextLine();

    scan.close();

    System.out.println();
    System.out.println("Inverse time..." + "\n" + "Your name inversed is:");
    System.out.println();
    System.out.println(combineFullName(firstName, middleName, lastName));
    System.out.println();
    }
    catch (Exception ex) {
        System.out.println("\n" + "An error occurred" + "\n");
        ex.printStackTrace();
        System.exit(0);
    }
    }

    //This method reverses user's middle name.
   static String inverseFirstName(String firstName) {

        for (int i = 0; i < firstName.length(); i++) {
            letter = firstName.charAt(i);
            firstNameInverse = letter + firstNameInverse;
            firstNameInverse = firstNameInverse.toLowerCase();
        }
        return capitalizeString(firstNameInverse);
    }

    //This method reverses user's middle name.
    static String inverseMiddleName(String middleName) {
        
        for (int i = 0; i < middleName.length(); i++) {
            letter = middleName.charAt(i);
            middleNameInverse = letter + middleNameInverse;
            middleNameInverse = middleNameInverse.toLowerCase();
        } 
        return capitalizeString(middleNameInverse);
    }

    //This method reverses user's last name.
    static String inverseLastName(String lastName) {
        
        for (int i = 0; i < lastName.length(); i++) {
            letter = lastName.charAt(i);
            lastNameInverse = letter + lastNameInverse;
            lastNameInverse = lastNameInverse.toLowerCase();
        }
        return capitalizeString(lastNameInverse);
    }

    //This method combines each name into one full name depending on user's inputs.
    static String combineFullName(String firstName, String middleName, String lastName) {
        
        if (middleName.equalsIgnoreCase("n/a")) {

            fullNameInverse = inverseFirstName(firstName) + " " + inverseLastName(lastName);
        }
        else {
            fullNameInverse = inverseFirstName(firstName) + " " + inverseMiddleName(middleName) + " " + inverseLastName(lastName);
        }
        return fullNameInverse;
    }
    
    //Method to manually capitalize first letter in a string.
   public static String capitalizeString(String input) {
   String firstLetter = input.substring(0, 1);
   String firstLetterCapitalized = firstLetter.toUpperCase();
   String remainingString = input.substring(1);
   String finalString = firstLetterCapitalized + remainingString;
      return finalString;
   }
}
