package survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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

}
