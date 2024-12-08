// 20 Write a program to create 3 radio buttons named C++, Java and Pascal and add on 
// JPanel. The user is asked to identify which of them is not an OOP language. When the 
// user selects on choice, the program responds by displaying whether the selection is 
// correct or wrong.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Identify Non-OOP Language");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Create the radio buttons
        JRadioButton cppButton = new JRadioButton("C++");
        JRadioButton javaButton = new JRadioButton("Java");
        JRadioButton pascalButton = new JRadioButton("Pascal");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(cppButton);
        group.add(javaButton);
        group.add(pascalButton);

        // Add the radio buttons to the panel
        panel.add(new JLabel("Which of the following is NOT an OOP language?"));
        panel.add(cppButton);
        panel.add(javaButton);
        panel.add(pascalButton);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("");
        panel.add(resultLabel);

        // Add ActionListener to radio buttons
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pascalButton.isSelected()) {
                    resultLabel.setText("Correct! Pascal is not an OOP language.");
                } else {
                    resultLabel.setText("Wrong! Try again.");
                }
            }
        };

        cppButton.addActionListener(listener);
        javaButton.addActionListener(listener);
        pascalButton.addActionListener(listener);

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
