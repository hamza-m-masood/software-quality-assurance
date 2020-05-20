package survey;

import java.util.ArrayList;

public class Survey {
    String title;
    ArrayList<Question> questions = new ArrayList<>();
    SurveyResponse surveyResponse;

    public Survey() {

    }

    public Survey(String title, ArrayList<Question> questions, SurveyResponse surveyResponse) {
        this.title = title;
        this.questions = questions;
        this.surveyResponse = surveyResponse;
    }
    
    public void addQuestion() {

    }

    public double getAverage() {
        return 0;
    }

    public double getStandardDeviation() {
        return 0;
    }

    public double getMinMaxScore() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SurveyResponse getSurveyResponse() {
        return surveyResponse;
    }

    public void setSurveyResponse(SurveyResponse surveyResponse) {
        this.surveyResponse = surveyResponse;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

}