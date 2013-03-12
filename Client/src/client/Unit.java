/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Art
 */
public abstract class Unit {
    //template for abstract unit:
    private double speed;
    private double range;
    private Image img1;
    private Image img2;
    private Animation anim;
    
    public Unit() throws SlickException {
        //constructor for abstract unit
        speed = 1;
        range = 1;
        img1 = new Image("resources/img/abstr110x10.png");
        img2 = new Image("resources/img/abstr210x10.png");
        anim = new Animation(new Image[]{img1, img2}, 250);
    }
    
    public void setImg1(String s) throws SlickException {
        img1 = new Image(s);
        updateAnimImgs(img1, img2);
    } 
    
    public void setImg2(String s) throws SlickException {
        img2 = new Image(s);
        updateAnimImgs(img1, img2);
    } 
    
    public void updateAnimImgs(Image i1, Image i2) {
        anim = new Animation(new Image[]{i1, i2}, 250);
    }
    
    public void draw(float x, float y) {
        anim.draw(x,y);
    }
}
