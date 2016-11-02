package Mains;

import Testing.GUIButtonTest;

import javax.swing.*;

/**
 * Created by div on 10/30/2016.
 */
public class MAINButtonTester {
    public static void main(String[]args){
        JFrame buttonTester = new GUIButtonTest();
        buttonTester.setTitle("Button Test");
        buttonTester.setSize(150,300);
        //buttonTester.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buttonTester.setVisible(true);
    }
}
