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
    private JLabel stagesL;
    private JComboBox artistsNo;
    private JComboBox gapNo;
    private JComboBox stageNo;
    private JComboBox daysNo;

    private Integer artistsArray[]
        ={0,1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11,12,13,14,15,
            16,17,18,19,20,
            21,22,23,24,25};

    private Integer gapArray[]
                ={0,1, 2, 3, 4, 5,
                6, 7, 8, 9, 10,
                11,12,13,14,15,
                16,17,18,19,20,
                21,22,23,24,25,
                26, 27, 28, 29, 30,
                31,32,33,34,35,36,
                37,38,39,40,41,42,
                43,44,45,46,47,48,
                49,50,51,52,53,54,
                55,56,57,58,59,60};
    
    private Integer stageArray[]
                ={0,1, 2, 3, 4, 5,
                6, 7, 8, 9, 10};
    
    private Integer dayArray[]
                ={0,1, 2, 3, 4, 5,
                6, 7, 8, 9, 10};

    public launchPage(){
    
    
        setTitle("Launch Page"); //sets title of the frame
        setBounds(300, 90, 500, 500); //set to x, y, width, height
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
        artistsNo = new JComboBox(artistsArray);
        artistsNo.setBounds(250, 100, 60, 20);
        artistsNo.setEditable(true); //So user can type into the comboBox not just use drop down
        container.add(artistsNo);

        //how long the gaps 
        gap = new JLabel("Gap Length (mins):");
        gap.setBounds(100, 150, 150, 20);
        container.add(gap);

        //input gap
        gapNo = new JComboBox(gapArray);
        gapNo.setBounds(250, 150, 60, 20);
        gapNo.setEditable(true); //So user can type into the comboBox not just use drop down
        container.add(gapNo);

        //How many stages
        stagesL = new JLabel("No of Stages:");
        stagesL.setBounds(100, 200, 150, 20);
        container.add(stagesL);

        //Input No of stages
        stageNo = new JComboBox(stageArray);
        stageNo.setBounds(250, 200, 60, 20);
        stageNo.setEditable(true); //So user can type into the comboBox not just use drop down
        container.add(stageNo);
        
        //How many days
        days = new JLabel("No of Days:");
        days.setBounds(100, 250, 150, 20);
        container.add(days);

        //No 0f days
        daysNo = new JComboBox(dayArray);
        daysNo.setBounds(250, 250, 60, 20);
        daysNo.setEditable(true); //So user can type into the comboBox not just use drop down
        container.add(daysNo);

        //Close when press complete button 
        next = new JButton("Next page");
        next.setBounds(300, 350, 130, 30);
        next.setFocusable(false);// Makes sure button isnt highlighted
        next.addActionListener(this); //signals if pressed
        container.add(next);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) { 
    //code that reacts to the action... 
    if(e.getSource()==next){

        program.pc  = (Integer)artistsNo.getSelectedItem();
        program.stages  = (Integer)stageNo.getSelectedItem();
        program.gaps  = (Integer)gapNo.getSelectedItem();
        program.day  = (Integer)daysNo.getSelectedItem();
        System.out.println(program.pc);
        System.out.println(program.gaps);
        System.out.println(program.stages);
        System.out.println(program.day);
        dispose();
        Schedule schedule = new Schedule();

    }
    
    }

}
