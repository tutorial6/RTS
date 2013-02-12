/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import connector.Connector;
import org.newdawn.slick.SlickException;


/**
 *
 * @author Modulo
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {
        
        Connector connector = new Connector();
        Client client = new Client();
        
        client.setConnector(connector);
        
        String[] s = new String[] {"test"};
        
        client.main(s);
    }
}
