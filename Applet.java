import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello Applet", 100, 50);
        g.drawRect(50, 70, 200, 80);
        g.drawOval(100, 90, 100, 60);
        g.drawLine(0, 0, 300, 200);
    }
}