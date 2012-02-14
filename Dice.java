import java.util.*;
/**
 * Write a description of class D6 here.
 * 
 * @author sam hill
 * @version (a version number or a date)
 */
public class Dice
{
   
    /**
     * Constructor for objects of class D6
     */
    public Dice()
    {
        
    }

    public int D6()
    {
        Random rand = new Random();
        int roll = 1 + rand.nextInt(6);
        
        return roll;
    }
    
    public int D20()
    {
        Random rand = new Random();
        int roll = 1 + rand.nextInt(20);
        
        return roll;
    }
    
    public int D8()
    {
        Random rand = new Random();
        int roll = 1 + rand.nextInt(8);
        
        return roll;
    }
}
