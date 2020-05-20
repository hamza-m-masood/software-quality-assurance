package survey;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void MenuTest() {
        Menu menu = new Menu();
        assertEquals("success", menu.createMenu());
    }

    // test to check for the creation of a survey

    @Test
    public void createSurveyTest() {
        Controller controller = new Controller();
        assertEquals("success", controller.createSurvey());
    }

    // test to check if answers are answered and saved in an arraylist
    @Test
    public void answerSurveyTest() {
        Controller controller = new Controller();
        controller.createSurvey();
        controller.answerSurvey();
        ArrayList<Survey> surveys = controller.surveys;
        assertEquals(10, controller.surveys.get(0).getResponses().size());
    }

    // test to check to view all surveys
    @Test
    public void vieAllSurveysTest() {
        Controller controller = new Controller();
        controller.createSurvey();
        controller.answerSurvey();
        ArrayList<Survey> surveys = controller.surveys;
        assertEquals(controller.surveys.get(0).getTitle(), controller.viewAllSurveys());
    }

    @Test
    public void getAverageTest() {
        Controller controller = new Controller();
        controller.createSurvey();
        controller.answerSurvey();
        assertEquals(2, controller.getAverage(controller.surveys.get(0)));
    }
}