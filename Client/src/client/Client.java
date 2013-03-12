package client;

import connector.Connector;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;

/**
 *
 * @author Arturas
 *  display
 * @author Modulo
 *  movement
 */
public class Client extends BasicGame
{
    Connector connector=null;
    
    Image grass = null;
    Animation square = null;
    Image sq1 = null;
    Image sq2 = null;
    Image base = null;
    Image gold = null;
    Worker worker;
    Ranged ranged;
    
    float mx = 100;
    float my = 300; //initial values
    float x,y;
    float d_x, d_y;
    double speed= 1;
	
	public String mouse = ""; //can't be null
 
  public Client()
  {
     super("rts alpha .000002");
  }
 
  @Override
  public void init(GameContainer gc) throws SlickException
  {
	grass = new Image("resources/img/grass800x600.png");
	sq1 = new Image("resources/img/sq120x20.png");
	sq2 = new Image("resources/img/sq220x20.png");
	square = new Animation(new Image[]{sq1,sq2}, 250);
	base = new Image("resources/img/base50x50.png");
        gold = new Image("resources/img/gold10x10.png");

        worker = new Worker();
        ranged = new Ranged();
  }
 
  @Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  //these are mainly for testing purposes now
	  //to check the behaviour (take a notice to Y pos)
	  int xpos = Mouse.getX();
	  int ypos = Math.abs(Mouse.getY()-600);
	  mouse = "x: " + xpos +" y: " + ypos;

            if(Math.abs(x-mx)<=d_x){
                mx=x;
                d_x=0;
            } else if ((x-mx)*d_x < 0){
                mx=x;
                d_x=0;
            } else {
                mx+=d_x;
            }

            if(Math.abs(y-my)<=d_y){
                my=y;
                d_y=0;
            } else if ((y-my)*d_y < 0){
                my=y;
                d_y=0;
            } else {
                my+=d_y;             
            }
            
        
        
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {     
     //works intuitively - draws on top
     grass.draw(0,0);
    
     if (Mouse.isButtonDown(0)) {
         x = Mouse.getX();
         y = Math.abs(Mouse.getY()-600);
         float ratio;
         if ((x-mx)==0&&(y-my)==0){
          ratio=0;
     }else {
         ratio=(float) (speed/Math.sqrt((x-mx)*(x-mx)+(y-my)*(y-my)));
         }
         d_x=(x-mx)*ratio;
         d_y=(y-my)*ratio;
     }
        
           gold.draw(50,275);
           gold.draw(50,295);
           gold.draw(50,315);
           
           
           worker.draw(300,300);
           ranged.draw(400,300);
           base.draw(100,275);
     
           square.draw(mx, my); //drawn before transp, can get under it
           
          
           g.drawString(mouse, 300, 100);
         
     
    // g.drawString("Hello World", 100, 100);
  }
 
    /**
     *
     * @param args
     * @throws SlickException
     */
    public void main(String[] args) throws SlickException
  {
     int maxFPS = 500;     
     
     AppGameContainer app = new AppGameContainer(new Client());
     app.setTargetFrameRate(maxFPS);
 
     app.setDisplayMode(800, 600, false);
     app.start();
  }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }
}
