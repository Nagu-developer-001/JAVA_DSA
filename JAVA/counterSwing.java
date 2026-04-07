

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class counterSwing extends JFrame implements ActionListener
{
    JLabel label;
    JTextField text;
    JButton addBtn, resetBtn;
    int count;

    public counterSwing()
    {
        setTitle("Counter Test");
        setLayout(new FlowLayout());

        count = 0;

        label = new JLabel("Count");
        text = new JTextField("0",5);

        addBtn = new JButton("Add");
        resetBtn = new JButton("Reset");

        addBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        add(label);
        add(text);
        add(addBtn);
        add(resetBtn);

        setSize(350,200);
        //setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==addBtn)
        {
            count++;
            text.setText(String.valueOf(count));
        }

        if(ae.getSource()==resetBtn)
        {
            count = 0;
            text.setText(String.valueOf(count));
        }
    }

    public static void main(String args[])
    {
        new counterSwing();
    }
}