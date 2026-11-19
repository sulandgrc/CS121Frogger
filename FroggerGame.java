import acm.program.*;
import acm.graphics.*;
import java.awt.event.KeyEvent;
import java.awt.Color;

/**
 * Name: <your name here>
 * 
 * CS 121
 * 
 *
 * Core Topics: Creating Arrays of Objects, Passing Arrays of Objects as Parameters, Returning Arrays of Ojbects
 * from Methods, Determining if an Array of Objects collides with another object
 */


public class FroggerGame extends GraphicsProgram {
    // constants for window size
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 400;
    
    // constants for where frog is originally positioned
    public static final int FROG_START_X = 200;
    public static final int FROG_START_Y = 300;
    
    // constants for where road is positioned
    public static final int ROAD_START_X = 0;
    public static final int ROAD_START_Y = 140;
    
    // constants for cars
    public static final int CAR_OFFSET = 125;
    public static final int CAR_Y = 175;
    public static final int CAR_WIDTH = 50;
    public static final int CAR_HEIGHT = 25;
    public static final int NUM_CARS = 5;
    
    // constant for how fast the frog moves
    public static final int FROG_SPEED = 20;

    // TODO declare frog variable here so the frog image can be seen in keyPressed method


    public void run() {
       // TODO add code here               
    }

    /**
     * Loads a frog image
     */
    public void drawFrog() {
        // TODO add code here
    }

    /**
     * Draws a large black rectangle to represent the road for frogger to cross
     */
    public void drawRoad() {
        // TODO add code here       
    }

    /**
     * Construct and return an array of rectangles (GRect) to simulate cars 
     */
    public GRect[] createCars() {
                
        return null;
    }
    
    /**
     * This method moves the frog up, left, and right based the keyboard arrow pressed
     * If the frog leaves the top of the window, set location back to the bottom
     * @param e KeyEvent for key pressed
     */
    public void keyPressed(KeyEvent e) {  
        // TODO add code here    
    }

    /**
     * This method animates the array of targets and checks if the frog has collided with
     * one of the cars.  If so, the frog's image is changed using the setImage("frogsplat.png")
     * method call, the cars stop moving, and an appropriate label is displayed
     * @param cars
     */
    public void animateCars(GRect[] cars) {
        // TODO: add code here
    }

    /**
     * Create a graphical window for the frogger game
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: add code here
    }
}
