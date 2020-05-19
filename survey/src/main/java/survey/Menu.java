package survey;

import java.util.Scanner;

public class Menu {

    public String createMenu() {
        int input;

        Boolean inputCorrect = false;
        System.out.println("\n\nWelcome to the survey creation and response program!");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose from the following options (enter a number between 1 - 3 inclusive): ");
            System.out.println("1. Create survey");
            System.out.println("2. Respond to a survey");
            System.out.println("3. View survey results");
            try {

                input = sc.nextInt();
                if (input == 1 || input == 2 || input == 3) {
                    inputCorrect = true;
                } else {
                    System.out.println("ERROR: please enter a number between 1-3 inclusive");
                }

            } catch (Exception inputException) {
                System.out.println("ERROR: please enter a number with no letters");

            }

        } while (!inputCorrect);

        return "success";
    }

    public static void main(String[] args) {
        Menu main = new Menu();
        main.createMenu();
    }
}