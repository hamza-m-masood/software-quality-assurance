package survey;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void createSurveyTest() {
        Controller controller = new Controller();
        assertEquals("success", controller.createSurvey());
    }
}
