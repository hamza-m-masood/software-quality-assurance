package survey;

public class Survey {
    Question question;
    SurveyResponse surveyResponse;

    public Survey() {

    }

    public Survey(Question question, SurveyResponse surveyResponse) {
        this.question = question;
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
}