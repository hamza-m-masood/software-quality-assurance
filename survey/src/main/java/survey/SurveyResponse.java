package survey;

import java.util.ArrayList;

public class SurveyResponse {
    ArrayList<Integer> answers = new ArrayList<>();

    public double getAverage() {
        return 0;
    }

    public double getStandardDeviation() {
        return 0;
    }

    public double getMinMaxScore() {
        return 0;
    }

    public ArrayList<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Integer> answers) {
        this.answers = answers;
    }

}