package survey;

import java.util.Scanner;

public class Menu {
    Controller controller = new Controller();

    public String createMenu() {
        int input = 0;

        Boolean inputCorrect = false;
        System.out.println("\n\nWelcome to the survey creation and response program!");
        do {
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n\n\n=========MAIN MENU========");
                System.out
                        .println("Please choose from the following options (enter a number between 1 - 3 inclusive): ");
                System.out.println("1. Create survey");
                System.out.println("2. Respond to a survey");
                System.out.println("3. View all surveys");
                System.out.println("4. View survey results");
                System.out.println("5. Exit");
                try {

                    input = sc.nextInt();
                    if (input == 1 || input == 2 || input == 3 || input == 4) {
                        inputCorrect = true;
                    } else if (input == 5) {
                        System.out.println("Goodbye!");
                        inputCorrect = true;
                    } else {
                        System.out.println("ERROR: please enter a number between 1-3 inclusive");

                    }

                } catch (Exception inputException) {
                    System.out.println("ERROR: please enter a number with no letters");

                }

            } while (!inputCorrect);

            processing(input);
        } while (input != 5);

        return "success";
    }

    public void processing(int input) {
        switch (input) {
            case 1:
                controller.createSurvey();
                break;
            case 2:
                controller.answerSurvey();
                break;
            case 3:
                controller.viewAllSurveys();
                break;
            case 4:
                controller.viewResults();

        }
    }

    public static void main(String[] args) {
        Menu main = new Menu();
        main.createMenu();
    }
}