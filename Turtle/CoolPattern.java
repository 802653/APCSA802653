
/**
 * Write a description of class TurtleRunner here.
 *
 * @author (Pblankenberg)
 * @version (82819)
 */
import java.awt.Color;
import java.util.Random;
public class CoolPattern{
    private static Random rand = new Random();
    private static int i;
    private static Turtle   t = new Turtle(Turtle.NO_DEFAULT_WINDOW);//  create a Turtle object;
    private static TurtleDrawingWindow win = new TurtleDrawingWindow();//  create a TurtleDrawingWindow object;
    public static void main(){
        
        int      size, turn;
        r = 0;
        g = 0;
        b = 0;
        t.jumpTo(0, 0);
        win.add(t);// add the turtle object to ayour window object
        win.setVisible(true);
        t.hide();
        t.penSize(15);
        size     = 15;    //logical units
        turn     = 5;    //in degrees
        t.penColor(Color.red); //import java.awt.Color to make this wor
        for(int e=5;e<300;e=e+2)
        {
            circle(150-(e*2),100-(e));
        }
        

    }
    private static int r;
    private static int g;
    private static int b;
    public static void circle(int turnRadius,int sideLength){
        for(int i=1;i<90;i++)
        {
            Color colore = new Color(r,g,b);
            t.penColor(colore);
            t.turn(sideLength);
            t.move(turnRadius);
            r += 2;
            g += 1;
            b += 3;
            if(r>255){r= r- 2;}
            if(g>255){g= g- 1;}
            if(b>255){b= b- 3;}
            
            
        }       
    }
    public static Color randomColor() {
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Color colore = new Color(r,g,b);
        return colore;
    }
    
    
}

