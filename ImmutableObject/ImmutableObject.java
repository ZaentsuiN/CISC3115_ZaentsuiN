import java.util.Scanner;

public class ImmutableObject {
    public static void main(String[] args) {
        float fahrenheit= 98.6f;

        float centigrade = (5.0f / 9.0f) * (fahrenheit - 32);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Centigrade: " + centigrade);

        for (float i = 0.0f; i <= 40.0f; i += 4.0f) {
            centigrade = (5.0f / 9.0f) * (i - 32);
            System.out.println("Fahrenheit: " + i + ", Centigrade: " + centigrade);
        }

        System.out.println();
        float i = 0.0f;
        while (i <= 40.0f) {
            centigrade = (5.0f / 9.0f) * (i - 32);
            System.out.println("Fahrenheit: " + i + ", Centigrade: " + centigrade);
            i += 4.0f;
        }

        stopChecking();
    }

    public static void stopChecking() {
        String[][] myArray = {
            {"BMW", "Ferrari", "Lambo"},
            {"pizza", "burger", "dumpling"}
        };

        String isin, inputwords;
        
        System.out.print("Enter a word: ");
        
        Scanner scanner = new Scanner(System.in);
        inputwords = scanner.nextLine();

        while (!inputwords.equals("STOP")) {
            isin = "False";

            for (String[] array : myArray) {
                for (String item : array) {
                    if (item.equalsIgnoreCase(inputwords)) {
                        isin = "True";
                        break;
                    }
                }
               
            }

            if (isin.equals("True")) {
                System.out.println(inputwords + " is in the 2D array.");
            } else {
                System.out.println(inputwords + " is not in the 2D array.");
            }

            System.out.print("Enter a word: (stop to terminate)     ");
            inputwords = scanner.nextLine();
        }
    }
}
