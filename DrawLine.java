import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.swing.JPanel;
import javax.swing.JFrame;
public class DrawLine extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;

    public DrawLine(){
        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        //create circles
        for(int count = 0; count < lines.length;count++){

            //genarate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //genarate random color
            Color color = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));

            lines[count] = new MyLine(x1,y1,x2,y2,color);

        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //draw the circle
        for(MyLine line: lines)
        line.draw(g);
    }
    public static void main(String[] args){
        DrawLine panel = new DrawLine();
        JFrame app = new JFrame(null, null);

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }
}

