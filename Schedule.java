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
    private JComboBox hours;
    private JComboBox mins;

    private String hoursArray[]
        ={"0","1", "2", "3", "4", "5",
        "6", "7", "8", "9", "10",
        "11","12","13","14", "15",
        "16","17","18","19","20",
        "21","22","23","24" };

    private String minsArray[]
        ={"0","1", "2", "3", "4", "5",
        "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15",
        "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25",
        "26", "27", "28", "29", "30",
        "31","32","33","34","35","36",
        "37","38","39","40","41","42",
        "43","44","45","46","47","48",
        "49","50","51","52","53","54",
        "55","56","57","58","59",};

    
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

        time = new JLabel("Length: (hrs/mins)");
        time.setBounds(100, 200, 150, 20);
        container.add(time);

        hours = new JComboBox(hoursArray);
        hours.setBounds(250, 200, 60, 20);
        container.add(hours);

        mins = new JComboBox(minsArray);
        mins.setBounds(310, 200, 80, 20);
        container.add(mins);

        conf = new JButton("Confirm");
        conf.setBounds(150, 450, 100, 30);
        container.add(conf);



        setVisible(true);

    }
        

}



