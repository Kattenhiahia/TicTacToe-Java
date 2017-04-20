
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by samuelhaggmyr on 2017-04-17.
 */
public class View extends JFrame implements Observer{
    static JPanel MainPanel;
    private final Controller controller;
    JLabel Info1;
    JLabel Empty;
    JLabel Info2;
    JButton Field1;
    JButton Field2;
    JButton Field3;
    JButton Field4;
    JButton Field5;
    JButton Field6;
    JButton Field7;
    JButton Field8;
    JButton Field9;


    public View(Controller controller) {
        this.controller = controller;

        setTitle("TicTacToe");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainPanel = new JPanel();
        MainPanel.setLayout(new GridLayout(4, 3, -3, -3));
        Field1 = new JButton("");
        Field2 = new JButton("");
        Field3 = new JButton("");
        Field4 = new JButton("");
        Field5 = new JButton("");
        Field6 = new JButton("");
        Field7 = new JButton("");
        Field8 = new JButton("");
        Field9 = new JButton("");
        Info1 = new JLabel(" Play 1: ");
        Empty = new JLabel(" Player x's turn ");
        Info2 = new JLabel(" Play 2: ");

        Field1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field1.setText("U clicked on this button");
            }
        });
        Field2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field2.setText("U clicked on this button");
            }
        });
        Field3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field3.setText("U clicked on this button");
            }
        });
        Field4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field4.setText("U clicked on this button");
            }
        });
        Field5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field5.setText("U clicked on this button");
            }
        });
        Field6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field6.setText("U clicked on this button");
            }
        });
        Field7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field7.setText("U clicked on this button");
            }
        });
        Field8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Field8.setText("U clicked on this button");
            }
        });
        Field9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.itsSomething();
            }
        });
        MainPanel.add(Field1);
        MainPanel.add(Field2);
        MainPanel.add(Field3);
        MainPanel.add(Field4);
        MainPanel.add(Field5);
        MainPanel.add(Field6);
        MainPanel.add(Field7);
        MainPanel.add(Field8);
        MainPanel.add(Field9);
        MainPanel.add(Info1);
        MainPanel.add(Empty);
        MainPanel.add(Info2);
        add(MainPanel);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {

        Field9.setText("Observer updated");
    }
}
