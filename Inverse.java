import java.util.Scanner;

/*
* A program that inverses the letters in a user's name.
* Date: Feb 14, 2022
*/
class Inverse {

    static String firstName = "";
    static String firstNameInverse = "";
    static String middleName = "";
    static String middleNameInverse = "";
    static String lastName = "";
    static String lastNameInverse = "";
    static String fullNameInverse = "";
    static char letter;

    //The main method will gather user's name with a scanner.
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

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

    //This method reverses user's middle name.
   static String inverseFirstName(String firstName) {

        for (int i = 0; i < firstName.length(); i++) {
            letter = firstName.charAt(i);
            firstNameInverse = letter + firstNameInverse;
        }
        return firstNameInverse;
    }

    //This method reverses user's middle name.
    static String inverseMiddleName(String middleName) {
        
        for (int i = 0; i < middleName.length(); i++) {
            letter = middleName.charAt(i);
            middleNameInverse = letter + middleNameInverse;
        } 
        return middleNameInverse;
    }

    //This method reverses user's last name.
    static String inverseLastName(String lastName) {
        
        for (int i = 0; i < lastName.length(); i++) {
            letter = lastName.charAt(i);
            lastNameInverse = letter + lastNameInverse;
        }
        return lastNameInverse;
    }

    //This method combines each name into one full name depending on user's inputs.
    static String combineFullName(String firstName, String middleName, String lastName) {
        
        if (middleName.equalsIgnoreCase("n/a")) {

            fullNameInverse = inverseFirstName(firstName) + " " + inverseLastName(lastName);
        }
        else {
            fullNameInverse = inverseFirstName(firstName) + " " + inverseMiddleName(middleName) + " " + inverseLastName(lastName);
        }
        return fullNameInverse.toLowerCase();
    }
}
