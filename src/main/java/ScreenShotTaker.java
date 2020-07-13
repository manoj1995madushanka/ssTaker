import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShotTaker {
    public static final long serialVersionUID = 1L;

    public void takeSS() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // It saves screenshot to desired path
        String path = getDefaultFilePath();

        // Used to get ScreenSize and capture image
        Rectangle capture =
                new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage Image = robot.createScreenCapture(capture);
        try {
            ImageIO.write(Image, "jpg", new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot saved");

    }

    String getDefaultFilePath()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("C://").append("Users").append("/").append(System.getProperty("user.name")).append("/").append("Pictures");
        return sb.toString();
    }

    /*public static void main(String[] args)
    {
        try {
            Thread.sleep(120);
            Robot r = new Robot();

            // It saves screenshot to desired path
            String path = "D:// Shot.jpg";

            // Used to get ScreenSize and capture image
            Rectangle capture =
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }*/
}
