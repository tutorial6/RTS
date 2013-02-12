/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Modulo
 */
public class Server {
    Map map = new Map();

    /**
     * @param args the command line arguments
     */
    public void main() {
        this.setMap("basic");
    }
    
    public void setMap (String name) {
        map.initMap(name);
    }

}
