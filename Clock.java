import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class AnalogClock extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 50, 200, 200);   
        Date d = new Date();
        int h = d.getHours(), m = d.getMinutes();
        int x = 150, y = 150;          
        g.drawLine(x, y, x + (int)(60*Math.sin(Math.PI*h/6)),
                         y - (int)(60*Math.cos(Math.PI*h/6))); 
        g.drawLine(x, y, x + (int)(90*Math.sin(Math.PI*m/30)),
                         y - (int)(90*Math.cos(Math.PI*m/30))); 
    }
}