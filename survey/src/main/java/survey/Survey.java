package survey;

import java.util.ArrayList;

public class Survey {
    String title;

    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<Integer> expectedAnswers = new ArrayList<>();
    ArrayList<SurveyResponse> responses = new ArrayList<>();

    public Survey() {

    }

    public Survey(String title, ArrayList<Question> questions) {
        this.title = title;
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void addExpectedAnswer(int answer) {
        this.expectedAnswers.add(answer);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Integer> getExpectedAnswers() {
        return expectedAnswers;
    }

    public void setExpectedAnswers(ArrayList<Integer> expectedAnswers) {
        this.expectedAnswers = expectedAnswers;
    }

    public ArrayList<SurveyResponse> getResponses() {
        return responses;
    }

    public void setResponses(ArrayList<SurveyResponse> responses) {
        this.responses = responses;
    }

}