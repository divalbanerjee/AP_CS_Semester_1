package GUIWindows;

import Components.GraphComponents.GraphPanel;
import Graphing.Circle;
import Graphing.LineSegment;
import Graphing.Point;

import javax.swing.*;
import java.awt.*;

/**
 * Created by div on 11/2/2016.
 */
public class TwoPointGUI extends JFrame {
    private Font font = new Font("Helvetica",Font.BOLD, 30);
    //UIManager.LookAndFeelInfo;

    //component decclarations
    JLabel lbltitle = new JLabel("Two Point");

    //Typed input labels
    JLabel lblX1Input = new JLabel("X1:");
    JLabel lblY1Input = new JLabel("Y1:");
    JLabel lblX2Input = new JLabel("X2:");
    JLabel lblY2Input = new JLabel("Y2:");
    JTextField txtX1Input = new JTextField();
    JTextField txtY1Input = new JTextField();
    JTextField txtX2Input =  new JTextField();
    JTextField txtY2Input =  new JTextField();
    JLabel skip = new JLabel();
    JLabel lblInfoOutput = new JLabel("Information:");

    JLabel lblType = new JLabel("Type");

    JButton btnGraph = new JButton("Graph");

    JButton btnCalculate = new JButton("Calculate Intersection");

    JButton btnChangeGraphType = new JButton("Change Graph");

    JLabel lblGraphType = new JLabel("Line");

    Point p1 = new Point(0,0);
    Point p2 = new Point(0,0);
    Point p3 = new Point(0,0);
    Point p4 = new Point(0,0);



    Circle circle1 = new Circle(new LineSegment(p1,p2));
    Circle circle2 =  new Circle(new LineSegment(p3,p4));

    GraphPanel panel = new GraphPanel();

    int graphType = 0; //0 is line, 1 is circle
    int clickCount = 0;//keeps track of number of clicks
    int buttonClickCount = 0;
    int panelWidth = 0;
    int panelHeight = 0;


    public TwoPointGUI(){
        JPanel plot = new JPanel();
        JPanel dataPanel = new JPanel(new GridLayout(6,4,10,10));
        Container container = getContentPane();


        container.add(plot,BorderLayout.CENTER);
        container.add(dataPanel, BorderLayout.SOUTH);

        plot.setMinimumSize(new Dimension(300,300));

        dataPanel.add(lblX1Input);

        dataPanel.add(txtX1Input);
        dataPanel.add(lblY1Input);
        dataPanel.add(txtY1Input);
        dataPanel.add(lblX2Input);
        dataPanel.add(txtX2Input);
        dataPanel.add(lblY2Input);
        dataPanel.add(txtY2Input);

        dataPanel.add(btnCalculate);
        dataPanel.add(btnGraph);
        dataPanel.add(lblGraphType);
        dataPanel.add(btnChangeGraphType);
       // btnCalculate.addActionListener(new CalculateListener());
        //btnChangeGraphType.addActionListener(new changeGraphListener());
        //btnGraph.addActionListener(new graphListener());
       // panel.addMouseListener(new MouseListener());
        lblX1Input.setFont(font);
        lblX2Input.setFont(font);
        lblY1Input.setFont(font);
        lblY2Input.setFont(font);
        btnCalculate.setFont(font);
        btnGraph.setFont(font);
        btnChangeGraphType.setFont(font);
        lblGraphType.setFont(font);


        txtX1Input.setFont(font);
        txtX2Input.setFont(font);
        txtY1Input.setFont(font);
        txtY2Input.setFont(font);

        lblX1Input.setForeground(Color.white);
        lblX2Input.setForeground(Color.white);
        lblY1Input.setForeground(Color.white);
        lblY2Input.setForeground(Color.white);

        lblX1Input.setAlignmentY(RIGHT_ALIGNMENT);
        lblX2Input.setAlignmentY(RIGHT_ALIGNMENT);
        lblY1Input.setAlignmentY(RIGHT_ALIGNMENT);
        lblY2Input.setAlignmentY(RIGHT_ALIGNMENT);
        UIManager.put("OptionPane.messageFont",font);

        dataPanel.setBackground(Color.GRAY);

        panelWidth = panel.getWidth();
        panelHeight = panel.getHeight();

        pack();
        setVisible(true);


    }
}
