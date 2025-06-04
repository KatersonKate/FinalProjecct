import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;
public class Circles extends JPanel{
    private int x;
    private int y;
    private int radius;
    private Ellipse2D shape;
    private Random random = new Random();

    public Circles(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.shape = new Ellipse2D.Double(x, y, radius * 2,radius * 2);
    }

    public void paint(Graphics2D g){
        int red = random.nextInt(256);
        int blue = random.nextInt(256);
        int green = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        g.drawOval(400, 400, 300, 300);
        g.setColor(randomColor);
        g.fill(shape);
    }
}
