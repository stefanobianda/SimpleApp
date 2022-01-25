package ch.stefanobianda;

import javax.swing.*;
import java.awt.*;

public class SimpleForm {
    private JLabel versionLabel;
    private JLabel versionValue;
    private JLabel runningLabel;
    private JTextField timeLabel;
    private JPanel mainPanel;
    private JFrame frame;

    public SimpleForm() {
        frame = new JFrame("Simple Application");
        frame.setContentPane(this.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public void updateCount(int count) {
        timeLabel.setText(String.valueOf(count));
    }

    public void setVersion(int version) {
        versionValue.setText(String.valueOf(version));
        switch (version) {
            case 1:
                frame.getContentPane().setBackground(new Color(0,0,255));
                break;
            case 2:
                frame.getContentPane().setBackground(new Color(255,0,0));
                break;
            case 3:
                frame.getContentPane().setBackground(new Color(0,255,0));
                break;
            case 4:
                frame.getContentPane().setBackground(new Color(255,255,0));
                break;
            case 5:
                frame.getContentPane().setBackground(new Color(255,0,255));
                break;
            case 6:
                frame.getContentPane().setBackground(new Color(0,255,255));
                break;
            default:
                frame.getContentPane().setBackground(new Color(0,0,0));
        }
    }
}
