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
    
    
    public launchPage(){
    
    
    setTitle("Schedule Form"); //sets title of the frame
	setBounds(300, 90, 900, 600); //set to x, y, width, height
	setDefaultCloseOperation(EXIT_ON_CLOSE); // causes exit after a close window event
	setResizable(false);

    container = getContentPane();
	container.setLayout(null); //No layout manager
    
    //ask how many artists 

    //how long the gaps 
    //How many stages
    //How many days
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
