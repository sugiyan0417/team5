import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Actor
{
    /**
     * Act - do whatever the bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bat(){
        int[] scale = MyWorld.getImageScale();
        getImage().scale(scale[0], scale[1]);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
