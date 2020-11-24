package ko;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JLabel label1;
    private JLabel label2;

    int locX = 0;
    int locY = 100;
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Fire");
        setSize(500, 500);

        label1 = new JLabel("()=");
        label1.setSize(300,30);
        label1.setLocation(0,100);
        add(label1);

        label2 = new JLabel("HUMAN");
        label2.setSize(300,30);
        label2.setLocation(410,100);
        add(label2);

        label = new JLabel("-->");
        label.setSize(300,30);
        label.setLocation(locX,locY);
        add(label);

        button = new JButton("FIRE");
        button.setSize(300,30);
        button.setLocation(100,150);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operation operation = new Operation(locX,locY,label);
                operation.start();
            }
        });
        add(button);

    }
}
