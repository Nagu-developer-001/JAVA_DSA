import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TypedTextDisplay extends JFrame implements KeyListener
{
    JTextField text;
    JLabel label;

    public TypedTextDisplay()
    {
        setTitle("Typed Text Display");
        setLayout(new FlowLayout());

        text = new JTextField(10);
        label = new JLabel("Typed text : ");

        text.addKeyListener(this);

        add(text);
        add(label);

        setSize(300,150);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e)
    {
        label.setText("Typed text : " + text.getText());
    }

    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String args[])
    {
        new TypedTextDisplay();
    }
}