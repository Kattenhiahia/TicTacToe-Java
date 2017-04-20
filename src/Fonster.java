
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fonster extends JFrame implements ActionListener
{
    private final int size = 4;
    private JButton minKnapp, minKnapp2, minKnapp3;
    private JPanel centerPanel, southPanel;
    private JButton[][] centerButtons;
    public Fonster()
    {
        centerPanel = new JPanel(new GridLayout(size, size));
        southPanel = new JPanel(new FlowLayout());
        centerButtons = new JButton[size][size];
        setupButtons();
        setTitle("Fonster");
        setSize(400,300);
        minKnapp = new JButton("Min knapp");
        minKnapp2 = new JButton("Min knapp2");
        minKnapp3 = new JButton("Min knapp3");
        add(minKnapp, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        southPanel.add(minKnapp2);
        southPanel.add(minKnapp3);
        add(southPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void setupButtons()
    {
        for(int i=0;i<size;i++)
            for(int k=0;k<size;k++)
            {
                centerButtons[i][k] = new JButton(""+ i + " " + k);
                centerButtons[i][k].setActionCommand(""+ i + " " + k);
                centerPanel.add(centerButtons[i][k]);
            }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
