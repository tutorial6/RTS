/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.io.*;

/**
 *
 * @author Modulo
 */
public final class Map {
    
    // Basic variables
    private int width;
    private int height;
    private String name;
    private Tile[][] layout;

    //main
    /**
     *
     * @param args
     */
    public void main(String[] args) {
        System.out.printf("Map Initialization: %s (%d x %d)\n", name, width, height);
    }

    public Map initMap(String name) {
        Map cache;
        try {
            FileInputStream fileIn = new FileInputStream("../resources/maps/"+name);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cache = (Map) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException i) {
            i.printStackTrace();
            return null;
        } catch(ClassNotFoundException c) {
            System.out.println("class not found");
            c.printStackTrace();
            return null;
        }
        
        this.width  = cache.width;
        this.height = cache.height;
        this.name   = cache.name;
        this.layout = cache.layout;
        

        throw new UnsupportedOperationException("Not yet implemented");
    }
        
}
