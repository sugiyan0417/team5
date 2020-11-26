import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int gravity=0;
    public void act() 
    {
        gravity--;
        setLocation(getX(), getY() - gravity);
        if(gravity==0)
        {
            gravity=0;
        }
        
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(3);
    }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-3);
}
if( Greenfoot.isKeyDown( "up" ) ){
        gravity = 3;
}

    }    
}

