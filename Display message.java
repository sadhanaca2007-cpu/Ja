import java.applet.Applet;
import java.awt.*;
public class ColorFontApplet extends Applet {

    public void paint(Graphics g) {
        
        Font f1 = new Font("Arial", Font.BOLD, 20);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("Welcome to Java Applet", 50, 80);

        Font f2 = new Font("Times New Roman", Font.ITALIC, 25);
        g.setFont(f2);
        g.setColor(Color.BLUE);
        g.drawString("Different Font & Size", 50, 130);

        Font f3 = new Font("Courier", Font.PLAIN, 30);
        g.setFont(f3);
        g.setColor(Color.GREEN);
        g.drawString("Colored Text Example", 50, 180);
    }
}