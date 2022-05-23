import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Schedule 
    extends JFrame{


    //Created instance variables
    private Container container;
    private JLabel title;
    private JLabel name;
    private JTextField nameText;
    private JLabel priority;
    private JLabel time;
    private JButton conf;

    
    public Schedule(){

        setTitle("Schedule Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

        title = new JLabel("Schedule Form");
        title.setBounds(200, 30, 300, 30);
        container.add(title);

        name = new JLabel("Name:");
        name.setBounds(100, 100, 100, 20);
        container.add(name);

        nameText = new JTextField();
        nameText.setBounds(200, 100, 190, 20);
        container.add(nameText);

        priority = new JLabel("Priority:");
        priority.setBounds(100, 150, 100, 20);
        container.add(priority);

        time = new JLabel("Length:");
        time.setBounds(100, 200, 100, 20);
        container.add(time);

        conf = new JButton("Confirm");
        conf.setBounds(150, 450, 100, 30);
        container.add(conf);

        setVisible(true);

    }
        

}



