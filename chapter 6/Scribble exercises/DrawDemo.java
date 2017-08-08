import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);
        random = new Random();
    }
    
    /**
     * Ex 6.67
     * draws a picture on the canvas
     */
    public void drawPicture(){
    myCanvas.setForegroundColor(Color.YELLOW);
    myCanvas.fillCircle(200,50,120);
    myCanvas.setForegroundColor(Color.BLACK);
    myCanvas.fillCircle(230,90,15);
    myCanvas.fillCircle(278,90,15);
    myCanvas.fillRectangle(254,135,13,20);
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }
    
    /**
     * Ex 6.62
     * Draw a triangle on the screen.
     */
    public void drawTriangle()
    {
        Pen pen = new Pen(280, 250, myCanvas);
        pen.setColor(Color.GREEN);

        pen.move(100);
        pen.turn(120);
        pen.move(100);
        pen.turn(120);
        pen.move(100);
    }
    
     /**
      * Ex 6.63
     * Draw a Pentagon on the screen.
     */
    public void drawPentagon()
    {
        Pen pen = new Pen(280, 250, myCanvas);
        pen.setColor(Color.CYAN);
        
        pentagon(pen);
    }
    
    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**

     * draw a pentagon in the pen's color at the pen's location
     */
    private void pentagon(Pen pen){
        for(int i = 0; i<5;i++){
            pen.move(42);
            pen.turn(72);
        }
    }
    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }
    
      /**
      * Ex 6.64
     * Draw a Polygon on the screen.
     */
    public void drawPolygon(int n)
    {
        Pen pen = new Pen(200, 200, myCanvas);
        pen.setColor(Color.ORANGE);
        
        polygon(pen, n);
    }
    
    /**
     * Ex 6.64
     * draw a polygon the pen's color at the pen's location
     */
    private void polygon(Pen pen, int n){
        for(int i = 0; i<n;i++){
            pen.move(117);
            pen.turn(360/n);
        }
    }
    
    /**
     * Ex 6.65
     * Draw a spiral
     */
    public void drawSpiral(){
        Pen pen = new Pen( 250,200, myCanvas);
        pen.setColor(Color.MAGENTA);
        spiral(pen);
    }
    
    /**
     * Ex 6.65
     * Draw a spiral in the pen's color at the pens location.
     */
   private void spiral(Pen pen){
       int length = 5;
       for(int i = 0; i <50; i++){
           pen.move(length);
           pen.turn(90);
           length = length + 5;
        }
    }
    
    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));
            
            pen.randomSquiggle();
        }
    }
    
    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
}
