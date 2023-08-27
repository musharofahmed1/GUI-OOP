import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrawShapes extends JPanel {
    private int choice;

    // constructor set the user choice
    public DrawShapes(int userChoice) {
        choice = userChoice;
    }

    // draw cascade of shapes string from top left corner
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // obtain user choice
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw Rectangles\n" + "Enter 2 to draw ovals");
        int choice = Integer.parseInt(input);

        DrawShapes panel = new DrawShapes(choice);

        // create a new JFrame
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}


