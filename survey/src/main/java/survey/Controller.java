package survey;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Survey> surveys = new ArrayList<>();

    public Controller() {
    }

    public String createSurvey() {

        Survey survey = new Survey();
        String surveyName = "";
        String question = "";
        String answer = "";
        int questionAmount = 0;
        int count = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "=========SURVEY CREATION=========\nYou will now being the process of creating a survey\nYou must enter in a number of questions\nthe answers will always be in the form of a number ranging between 1-5\n\n");

        System.out.println("what would you like to name the survey?");
        survey.setTitle(surveyName = sc.nextLine());
        do {
            System.out.println("Please enter question no." + count + ": ");
            survey.addQuestion(new Question(question = sc.nextLine()));
            System.out
                    .println("Please enter the expected answer for the survey (Enter value between 1 - 5 inclusive): ");
            survey.addExpectedAnswer(Integer.parseInt(sc.nextLine()));
            count++;
        } while (count < 11);
        count = 0;
        System.out.println("\nTitle of your survey: ");
        System.out.println(survey.getTitle());

        System.out.println("\nyour questions and expected answers:");
        for (Question q : survey.getQuestions()) {
            System.out.println(q.getQuestion());
        }
        System.out.println("\n\nYou will now be returned to the main menu with your survey saved.");

        return "success";
    }

}
