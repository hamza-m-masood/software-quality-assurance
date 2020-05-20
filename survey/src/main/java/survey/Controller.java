package survey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
            try {
                survey.addExpectedAnswer(Integer.parseInt(sc.nextLine()));

            } catch (Exception inputException) {

                System.out.println("ERROR: Enter value between 1 - 5 inclusive");
            }

            count++;
        } while (count < 11);
        count = 0;
        surveys.add(survey);
        System.out.println("\nTitle of your survey: ");
        System.out.println(survey.getTitle());

        System.out.println("\nyour questions are:");
        for (Question q : survey.getQuestions()) {
            System.out.println(q.getQuestion());
        }
        System.out.println("\n\nYou will now be returned to the main menu with your survey saved.");

        return "success";
    }

    public void viewAllSurveys() {
        if (surveys.isEmpty()) {
            System.out.println("\n\nNo surveys within database");
        } else {
            System.out.println("\n\n========Survey Titles========\n");
            for (Survey s : surveys) {

                System.out.println(s.getTitle());
            }

        }

    }

    public void answerSurvey() {
        String surveyTitle;
        Boolean surveyFound = false;
        SurveyResponse surveyResponse = new SurveyResponse();
        Survey chosenSurvey = new Survey();
        if (surveys.isEmpty()) {
            System.out.println("No surveys within database");
        } else {
            Scanner sc = new Scanner(System.in);
            viewAllSurveys();
            System.out.println("What survey would you like to answer? (please enter the name of the survey): ");
            surveyTitle = sc.nextLine();
            do {
                for (Survey s : surveys) {
                    if (surveyTitle.equalsIgnoreCase(s.getTitle())) {
                        chosenSurvey = s;
                        surveyFound = true;
                        break;
                    }
                }

                if (!surveyFound) {
                    System.out.println("ERROR: Please type in a name that matches one of the surveys on the list: ");
                    surveyTitle = sc.nextLine();
                }

            } while (!surveyFound);
            int i = 1;
            System.out.println("=======ANSWERING SURVEY=======");
            for (Question q : chosenSurvey.getQuestions()) {
                System.out.println("question " + i);
                System.out.println(q.getQuestion());
                i++;
                System.out.print("answer (between 1-5 inclusive): ");
                surveyResponse.getAnswers().add(Integer.parseInt(sc.nextLine()));

            }
            chosenSurvey.getResponses().add(surveyResponse);
            System.out.println("\n\n=======SURVEY ENDED=======");
            System.out.println("your answers : ");
            for (int s : surveyResponse.getAnswers()) {
                System.out.println(s);
            }
        }

    }

    public void viewResults() {
        Boolean surveyFound = false;
        String surveyTitle;
        Survey chosenSurvey = new Survey();
        int answer;
        if (surveys.isEmpty()) {
            System.out.println("No surveys within database");
        } else {
            Scanner sc = new Scanner(System.in);
            viewAllSurveys();
            System.out
                    .println("What survey would you like to view results for? (please enter the name of the survey): ");
            surveyTitle = sc.nextLine();
            do {
                for (Survey s : surveys) {
                    if (surveyTitle.equalsIgnoreCase(s.getTitle())) {
                        chosenSurvey = s;
                        surveyFound = true;
                        break;
                    }
                }

                if (!surveyFound) {
                    System.out.println("ERROR: Please type in a name that matches one of the surveys on the list: ");
                    surveyTitle = sc.nextLine();
                }

            } while (!surveyFound);
            System.out.println("survey found");
            if (chosenSurvey.getResponses().isEmpty()) {
                System.out.println("Survey has not been answered yet");
            } else {
                System.out.println("\n1. View analytics for entire survey");
                System.out.println("2. View analytics for each question within survey");
                System.out.println("Please input 1 or 2: ");
                answer = Integer.parseInt(sc.nextLine());
                if (answer == 1) {
                    System.out.println("\n\n==========SURVEY ANALYTICS==========");
                    System.out.println("Survey average: ");
                    System.out.println(getAverage(chosenSurvey));
                    System.out.println("Survey Standard deviation");
                    System.out.println(getStandardDeviation(chosenSurvey));
                    System.out.println("Survey minimumn and maximum score: ");
                    System.out.println(getMinMaxScore(chosenSurvey));
                } else {
                    System.out.println("\n\n==========SURVEY QUESTIONS ANALYTICS==========");
                    System.out.println("Survey questions average: ");
                    System.out.println(getResponseAverage(chosenSurvey));
                    System.out.println("Survey Standard deviation");
                    System.out.println(getResponseStandardDeviation(chosenSurvey));
                    System.out.println("Survey minimumn and maximum score: ");
                    System.out.println(getResponseMinMaxScore(chosenSurvey));
                }
            }

        }
    }

    public double getAverage(Survey chosenSurvey) {
        ArrayList<Survey> surveysFound = new ArrayList<>();
        int answers = 0;
        int size = 0;
        for (Survey s : surveys) {
            if (s.getTitle().equals(chosenSurvey.getTitle())) {
                surveysFound.add(s);
            }
        }

        for (Survey s : surveysFound) {
            for (SurveyResponse r : s.getResponses()) {
                for (int i = 0; i < r.getAnswers().size(); i++) {
                    answers = answers + r.getAnswers().get(i);
                }
                size = size + r.getAnswers().size();
            }

        }
        return answers / size;
    }

    public double getStandardDeviation(Survey chosenSurvey) {
        ArrayList<Survey> surveysFound = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();
        for (Survey s : surveys) {
            if (s.getTitle().equals(chosenSurvey.getTitle())) {
                surveysFound.add(s);
            }
        }

        for (Survey s : surveysFound) {
            for (SurveyResponse r : s.getResponses()) {
                for (int i = 0; i < r.getAnswers().size(); i++) {
                    answers.add(r.getAnswers().get(i));
                }
            }

        }

        // Step 1:
        double mean = calculateAverage(answers);
        double temp = 0;

        for (int i = 0; i < answers.size(); i++) {
            int val = answers.get(i);

            // Step 2:
            double squrDiffToMean = Math.pow(val - mean, 2);

            // Step 3:
            temp += squrDiffToMean;
        }

        // Step 4:
        double meanOfDiffs = (double) temp / (double) (answers.size());

        // Step 5:
        return Math.sqrt(meanOfDiffs);

    }

    // helper method for calculating standard deviation
    private double calculateAverage(List<Integer> marks) {
        Integer sum = 0;
        if (!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }

    public String getMinMaxScore(Survey chosenSurvey) {
        ArrayList<Survey> surveysFound = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();
        for (Survey s : surveys) {
            if (s.getTitle().equals(chosenSurvey.getTitle())) {
                surveysFound.add(s);
            }
        }

        for (Survey s : surveysFound) {
            for (SurveyResponse r : s.getResponses()) {
                for (int i = 0; i < r.getAnswers().size(); i++) {
                    answers.add(r.getAnswers().get(i));
                }
            }

        }

        return "Min : " + Collections.min(answers) + " Max: " + Collections.max(answers);
    }

    public double getResponseAverage(Survey chosenSurvey) {
        return 0;
    }

    public double getResponseStandardDeviation(Survey chosenSurvey) {
        return 0;
    }

    public double getResponseMinMaxScore(Survey chosenSurvey) {
        return 0;
    }

}
