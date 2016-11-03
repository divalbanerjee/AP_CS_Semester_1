package Mains;

import GUIWindows.TwoPointGUI;

import javax.swing.*;

/**
 * Created by div on 11/2/2016.
 */
public class TwoPointMain {
    public static void main(String[]args) {
        JFrame theGUI = new TwoPointGUI();

        theGUI.setTitle("GUI Program");
        theGUI.setSize(800, 1100);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ColorPanel panel = new ColorPanel(Color.white);
        //	Container pane = theGUI.getContentPane();
        //pane.add(panel);

        theGUI.setVisible(true);
    }
}
