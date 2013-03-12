/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Art
 */
public class Ranged extends Unit{
    private double speed;
    private double range;
    private Image img1;
    private Image img2;
    public Ranged () throws SlickException {
        speed = 1;
        range = 10;
        img1 = new Image("resources/img/sq310x10.png");
        img2 = new Image("resources/img/sq410x10.png");

        updateAnimImgs(img1, img2); //this passes new imgs to Unit so we could use draw from it
        
    }
}
