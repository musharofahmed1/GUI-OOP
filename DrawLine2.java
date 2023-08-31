import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawLine2 extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;

    public DrawLine2() {
        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // create lines
        for (int count = 0; count < lines.length; count++) {

            // generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // generate random color
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            lines[count] = new MyLine(x1, y1, x2, y2, color);

        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw the lines
        for (MyLine line : lines)
            line.draw(g);
    }

    public static void main(String[] args) {
        DrawLine2 panel = new DrawLine2();
        JFrame app = new JFrame("Random Lines", null); // Set a title here

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}

