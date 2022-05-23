import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class launchPage
    extends JFrame
    implements ActionListener{ 


    //Created instance variables
    private Container container;
    private JLabel title;
    private JButton next;
    private JLabel artists;
    private JLabel gap;
    private JLabel days;
    private JLabel stages;
    private JComboBox artistsNo;
    private JComboBox gapNo;
    private JComboBox stageNo;
    private JComboBox daysNo;



    
    public launchPage(){
    
    
        setTitle("Launch Page"); //sets title of the frame
        setBounds(300, 90, 900, 600); //set to x, y, width, height
        setDefaultCloseOperation(EXIT_ON_CLOSE); // causes exit after a close window event
        setResizable(false);

        container = getContentPane();
        container.setLayout(null); //No layout manager

        title = new JLabel("Initial Inputs");
        title.setBounds(200, 30, 300, 30);
        container.add(title); // adds object to frame
        
        //ask how many artists 
        artists = new JLabel("Number of artists:");
        artists.setBounds(100, 100, 150, 20);
        container.add(artists);

        //input artists
        // hours = new JComboBox(hoursArray);
        // hours.setBounds(250, 200, 60, 20);
        // hours.setEditable(true); //So user can type into the comboBox not just use drop down
        // container.add(hours);

        //how long the gaps 
        gap = new JLabel("Gap Length (mins):");
        gap.setBounds(100, 150, 150, 20);
        container.add(gap);

        //How many stages
        stages = new JLabel("No of Stages:");
        stages.setBounds(100, 200, 150, 20);
        container.add(stages);
        
        //How many days
        days = new JLabel("No of Days:");
        days.setBounds(100, 250, 150, 20);
        container.add(days);

        //Close when press complete button 
        next = new JButton("Next page");
        next.setBounds(150, 450, 130, 30);
        next.setFocusable(false);// Makes sure button isnt highlighted
        next.addActionListener(this); //signals if pressed
        container.add(next);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) { 
    //code that reacts to the action... 
    if(e.getSource()==next){
        dispose();
        Schedule schedule = new Schedule();

    }
    
    }

}
