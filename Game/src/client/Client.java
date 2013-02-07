package client;

import org.newdawn.slick.*;
public class Client extends BasicGame
{
 
  public Client()
  {
     super("Client");
  }
 
  @Override
  public void init(GameContainer gc) throws SlickException
  {
 
  }
 
  @Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
 
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
     g.drawString("Client Initializing...", 100, 100);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new Client());
 
     app.setDisplayMode(800, 600, false);
     app.start();
  }
}