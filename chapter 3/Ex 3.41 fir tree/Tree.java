
/**
 * This class will help us draw a pine tree
 *
 * @author Jacob Knott
 */
public class Tree
{
    private Square trunk;
    private Triangle leaves;
    private boolean drawn;
    
    /**
     * Constructor for objects of class tree
     */
    public Tree()
    {
        trunk = new Square();
        leaves = new Triangle();
        drawn = false;
    }
   
    /**
     * The setup mehtod will draw a fir tree
     */
    public void setup()
    {
        if(!drawn) {
            trunk.changeColor( "black" );
            trunk.moveHorizontal(-110);
            trunk.moveVertical(80);
            trunk.changeSize(60);
            trunk.makeVisible();
            
            leaves.changeSize(180, 180);
            leaves.moveHorizontal(20);
            leaves.moveVertical(-90);
            leaves.makeVisible();
            
            drawn = true;
        }
    }
}
