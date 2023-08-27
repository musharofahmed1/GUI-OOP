import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
import javax.swing.JFrame;

class Circle {
    private int x1, y1, x2, y2;
    private Color color;

    public Circle(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x1, y1, x2 - x1, y2 - y1);
    }
}

public class Circle extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyCircle[] circles;

    public Circle() { // Constructor name should match class name
        setBackground(Color.WHITE);

        circles = new MyCircle[5 + randomNumbers.nextInt(5)];

        // Create circles
        for (int count = 0; count < circles.length; count++) {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            circles[count] = new MyCircle(x1, y1, x2, y2, color);
        }

     
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the circles
        for (MyCircle circle : circles) {
            circle.draw(g);
        }
        public static void main(String[] args){
        Circle panel = new Circle();
        JFrame app = new JFrame(null, null);

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }
    }

     

 

    