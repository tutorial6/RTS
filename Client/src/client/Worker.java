/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;
import org.newdawn.slick.*;

/**
 *
 * @author Art
 */
public class Worker extends Unit {
    private double speed;
    private double range;
    private Image img1;
    private Image img2;
    public Worker () throws SlickException {
        speed = 2;
        range = 1;
        img1 = new Image("resources/img/sq110x10.png");
        img2 = new Image("resources/img/sq210x10.png");

        updateAnimImgs(img1, img2); //this passes new imgs to Unit so we could use draw from it
        
    }
    
    
}
