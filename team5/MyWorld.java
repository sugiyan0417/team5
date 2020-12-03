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
        addObject( new key(), 100, 250 );
        addObject( new door(), 700, 169 );
        addObject( new key(), 200, 680 );
        ///addObject(new Player(), 100, 680);
        
        for(int x=50;x<1000;x+=150){
        addObject( new block_seaground(), x, 830 );
    }
    for(int x=50;x<500;x+=150){
        addObject( new block_seaground(), x, 400 );
    }
    for(int x=500;x<1000;x+=150){
        addObject( new block_seaground(), x, 700 );
    }
    for(int x=700;x<1500;x+=150){
        addObject( new block_seaground(), x, 300 );
    }
         
        addObject(player, 500, 650);
        //players = getObjects(Player.class);
        //addObject(new Player(), 500, 650);
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
