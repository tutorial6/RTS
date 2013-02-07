/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;


/**
 *
 * @author Modulo
 */
import client.Client;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.SlickException;
import server.Server;

public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Server b_end = new Server();
        Client f_end = new Client();
        
        String[] s = new String[] {"test"};
        
        try {
            b_end.setMap("default");
            Client.main(s);
        } catch (SlickException ex) {
            Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
