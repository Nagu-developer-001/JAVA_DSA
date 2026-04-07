import java.awt.event.*;
import javax.swing.*;

public class SwingForm extends JFrame implements ActionListener
{
    JLabel title, nameLabel, genderLabel, interestLabel;
    JTextField nameField;
    JRadioButton male, female;
    JCheckBox music, swimming;
    JButton submit, exit;
    ButtonGroup bg;

    public SwingForm()
    {
        setTitle("Welcome to Swing Components");
        setLayout(null);

        title = new JLabel("Welcome to Swing Components");
        title.setBounds(90,10,250,30);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50,50,100,20);

        nameField = new JTextField();
        nameField.setBounds(120,50,150,25);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50,90,100,20);

        male = new JRadioButton("Male");
        male.setBounds(120,90,70,20);

        female = new JRadioButton("Female");
        female.setBounds(200,90,80,20);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        interestLabel = new JLabel("Interest:");
        interestLabel.setBounds(50,130,100,20);

        music = new JCheckBox("Music");
        music.setBounds(120,130,80,20);

        swimming = new JCheckBox("Swimming");
        swimming.setBounds(200,130,100,20);

        submit = new JButton("Submit");
        submit.setBounds(90,180,80,30);

        exit = new JButton("Exit");
        exit.setBounds(190,180,80,30);

        submit.addActionListener(this);
        exit.addActionListener(this);

        add(title);
        add(nameLabel);
        add(nameField);
        add(genderLabel);
        add(male);
        add(female);
        add(interestLabel);
        add(music);
        add(swimming);
        add(submit);
        add(exit);

        setSize(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submit)
        {
            String name = nameField.getText();


            JFrame f = new JFrame("Info");
            JLabel l = new JLabel("Registered Successfully " + name);
            l.setBounds(40,30,200,30);

            f.setLayout(null);
            f.add(l);
            f.setSize(250,150);
            f.setVisible(true);
        }

        if(e.getSource()==exit)
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        new SwingForm();
    }
}