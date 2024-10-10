/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square suelo;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        suelo = new Square();
        suelo.makeVisible();
        suelo.changeColor("green");
        suelo.moveHorizontal(-310);
        suelo.moveVertical(130);
        suelo.changeSize(500);
        
        sun = new Circle();
        sun.changeSize(80);
        sun.changeColor("yellow");
        sun.moveHorizontal(150);
        sun.moveVertical(-100);
        sun.makeVisible();
        sun.slowMoveVertical(70);
        
        moon = new Circle();
        moon.changeSize(50);
        moon.changeColor("magenta");
        moon.moveHorizontal(-250);
        moon.makeVisible();
        moon.slowMoveHorizontal(50);
    }
    
    public void amanecer(){
        moon.makeInvisible();
        sun.moveVertical(250);
        sun.slowMoveVertical(-230);
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
