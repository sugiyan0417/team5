import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hoge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hoge extends Actor
{
    /**
     * Act - do whatever the Hoge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("Up")){
            setRotation(-90);
            move(1);
        }

    }
}
