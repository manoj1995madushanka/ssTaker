import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenShotTakerTest {

    @Test
    void testGetDefaultFilePath()
    {
        ScreenShotTaker screenShotTaker = new ScreenShotTaker();
        assertNotNull(screenShotTaker.getDefaultFilePath());
    }

    @Test
    void testTakeSS()
    {
        ScreenShotTaker screenShotTaker = new ScreenShotTaker();
        screenShotTaker.takeSS();
    }
}