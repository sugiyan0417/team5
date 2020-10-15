import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class siba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class siba extends Actor
{
    /**
     * Act - do whatever the siba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //public static boolean Greenfoot.isKeyDown( "down" );
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
}
        // Add your action code here.
    }    
}
