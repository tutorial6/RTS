/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.*;

/**
 *
 * @author Modulo
 */
public class Terrain {
    private String type = "default";
    private Color color = new Color(0, 200, 0);
    private Image texture = null;
    
    public Terrain () throws SlickException{
        texture = new Image("resources/img/grass-texture.jpg");
    }
    
    public Terrain (String path) throws SlickException{
        texture = new Image(path);
    }
    
    public Color getColor () {
        return color;
    };
    
    public Image getTexture () {
        return texture;
    }
    
    public void setColor (Color c) {
        color = c;
    };
    
    public void setTexture (String path) throws SlickException{
        texture = new Image(path);
    }
    
}
