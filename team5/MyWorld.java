import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //List<Actor> actors = new ArrayList<Actor>();
    //List<Player> players = new ArrayList<Player>();
    Player player = new Player();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        addObject(player, 500, 650);
        //players = getObjects(Player.class);
    }
    public void act(){
       //showText(String.valueOf(players.get(0).getX()),100,100);
       showText(String.valueOf(player.getX()),100,100);
       showText(String.valueOf(player.getY()),200,200);
       int x = player.getX();
       int y = player.getY();
       player.setLocation(x,y+4);
    }

}
