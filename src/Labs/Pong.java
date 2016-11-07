package Labs;

/**
 * Created by div on 11/4/2016.
 */
import java.awt.Color;
import Components.GameComponents.Pong.PongPanel;

import javax.swing.JFrame;

public class Pong extends JFrame {
    private final static int WIDTH = 1600, HEIGHT = 900;
    private PongPanel panel;

    public Pong() {
        setSize(WIDTH, HEIGHT);
        setTitle("Pong");
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PongPanel(this);
        add(panel);
    }

    public PongPanel getPanel() {
        return panel;
    }
    public static void main(String[]args){
        new Pong();
    }


}
