import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        addObject( new key(), 100, 250 );
        addObject( new door(), 700, 169 );
        addObject( new player(), 100, 680 );
        
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
    }
}
