import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * menu class
 * 
 * @author sam hill
 * @version 1/19/2012
 */
public class MyMenu extends JFrame implements ActionListener
{
    
    JMenuItem mInc,mDec,mReset,mExit;
    JButton die,die2,die3;
    JPanel jpNorth, jpCenter, jpSouth;
    JTextArea jta;
    JLabel jl;
    /**
     * Constructor for objects of class MyMenu
     */
    public MyMenu()
    {
        super("Dice Roller");
        setSize(500,500);
        setLocation(200,200);
        setLayout(new BorderLayout());
        
        JPanel jpNorth = new JPanel();
        JPanel jpCenter = new JPanel();
        JPanel jpSouth = new JPanel();
        
        //logo
        JLabel jl = new JLabel();
        ImageIcon logo = new ImageIcon("botheadLogo.png"); 
        jl.setIcon(logo); 
        jl.setVisible(true);
        jpSouth.add(jl); 
        add(jpSouth, "South");
        
        //dice rolls
        die = new JButton("Roll D6");
        ImageIcon icon = new ImageIcon("d6.png");
        die.setIcon(icon);
        die.setVisible(true);
        jpNorth.add(die);
        add(jpNorth, "North"); 
        
        die3 = new JButton("Roll D8");
        ImageIcon icon3 = new ImageIcon("d8.png");
        die3.setIcon(icon3);
        die3.setVisible(true);
        jpNorth.add(die3);
        add(jpCenter, "Center");
        
        die2 = new JButton("Roll D20");
        ImageIcon icon2 = new ImageIcon("d20.png");
        die2.setIcon(icon2);
        die2.setVisible(true);
        jpNorth.add(die2);
        add(jpNorth, "North");
        
        jta = new JTextArea();
        jta.setVisible(true);
        jpCenter.add(jta);
        add(jpCenter, "Center");
        
        //actionListeners
        
       
        
        die.addActionListener(this);
        die2.addActionListener(this);
        die3.addActionListener(this);
        //edit menu
       // mDeposit.addActionListener(new EditMenu(die,mWithdraw,mDeposit,mInterest));
        
    
    }

    public static void main(String [] args)
    {
        //create the frame
        MyMenu m = new MyMenu();
        m.setTitle("Dice Roller");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(500,200);
        m.setLocation(100,100);
        m.setVisible(true);
    }
    
   public void actionPerformed(ActionEvent e)
    {
         if(e.getSource() == die)
        {
             die.setText("D6");
             Dice d6 = new Dice();
             die.setText("       " + d6.D6());
        }
        if(e.getSource() == die2)
        {
            die2.setText("D20");
             Dice d20 = new Dice();
             die2.setText("       " + d20.D20());
        }
        if(e.getSource() == die3)
        {
            die3.setText("D8");
             Dice d8 = new Dice();
             die3.setText("       " + d8.D8());
        }
        
    }
    
   
}
