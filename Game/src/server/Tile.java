/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Modulo
 */

public class Tile {
    private int x, y;
    private Terrain terrain;
    private Unit unit;
    
    // get/set functions
    public Terrain getTerrain() {
        return this.terrain;
    }
    
    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
    
    public Unit getUnit() {
        return this.unit;
    }
    
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
