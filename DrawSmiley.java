import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 75, 30, 30);
        g.fillOval(135, 75, 30, 30);

        //moni 1
        g.setColor(Color.white);
        g.fillOval(70, 87, 9, 8);
        g.fillOval(150, 87, 9, 8);



        // Draw the mouth (smile)
        g.setColor(Color.BLACK);
        g.fillOval(80, 145, 60, 10);
       // g.fillOval(50, 140, 30, 30);


    }

    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}

