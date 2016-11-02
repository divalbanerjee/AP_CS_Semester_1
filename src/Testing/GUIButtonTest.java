package Testing;

import Components.Button;

import javax.swing.*;
import java.awt.*;

/**
 * Created by div on 10/30/2016.
 */
public class GUIButtonTest extends JFrame {
    //used to test the custom button class
    Button btnTest = new Button(Color.white);

    public GUIButtonTest(){
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JPanel buttonFrame = new JPanel (new GridLayout(1,1,25,25));

        btnTest.setText("Demo");
        buttonFrame.add(btnTest);

    }

}
