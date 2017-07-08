
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
     * Draw a tree
     */
    public void draw()
    {
        if(!drawn) {
            trunk.changeColor( "black" );
            trunk.moveHorizontal(-140);
            trunk.moveVertical(20);
            trunk.changeSize(120);
            trunk.makeVisible();
            
            leaves.changeSize(60, 180);
            leaves.moveHorizontal(20);
            leaves.moveVertical(-60);
            leaves.makeVisible();
            
            drawn = true;
        }
    }
}
