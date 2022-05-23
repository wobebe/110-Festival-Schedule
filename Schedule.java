import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Schedule implements ActionListener{
    private JPanel panel;
    private JFrame frame;
    private JLabel name;
    private JTextField nameText;
    private JLabel length;
    private JTextField lengthHrs;
    private JTextField lengthMins;
    private JButton button;
    
    
    public Schedule(){
        panel = new JPanel();
        frame = new JFrame();
        

        frame.setTitle("Schedule input");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        
        name = new JLabel("Act Name:");
        name.setBounds(10, 20, 80, 25);
        panel.add(name);
        
        nameText = new JTextField();
        nameText.setBounds(120, 20, 165, 25);
        panel.add(nameText);
        
        length = new JLabel("Act Length:");
        length.setBounds(10, 50, 100, 25);
        panel.add(length);

        lengthHrs = new JTextField();
        lengthHrs.setBounds(120, 50, 40, 25);
        panel.add(lengthHrs);
        
        lengthMins = new JTextField();
        lengthMins.setBounds(180, 50, 105, 25);
        panel.add(lengthMins);
        
        button = new JButton("Done");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
    }
    public static void main(String[] args){
        new Schedule();
    }
}


