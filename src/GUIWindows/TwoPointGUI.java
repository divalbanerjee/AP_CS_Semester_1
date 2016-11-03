package GUIWindows;

import Components.GraphComponents.GraphPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by div on 11/2/2016.
 */
public class TwoPointGUI extends JFrame {
    private Font font = new Font("Helvetica",Font.BOLD, 30);



    public TwoPointGUI(){
        JPanel plot = new JPanel();
        JPanel dataPanel = new JPanel(new GridLayout(6,4,10,10));
        Container container = getContentPane();


        container.add(plot,BorderLayout.CENTER);
        container.add(dataPanel, BorderLayout.SOUTH);



        JPanel
    }
}
