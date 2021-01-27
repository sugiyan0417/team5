import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    /**
     * Act - do whatever the key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Key(){
        int[] scale = MyWorld.getImageScale();
        getImage().scale(scale[0], scale[1]);
    }
    public void act() 
    {
        
        //主人公にぶつかられたとき自身を削除
        
    }    
}
