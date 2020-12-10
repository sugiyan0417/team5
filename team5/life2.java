import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class life2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class life2 extends Actor
{
    static public boolean life2=true;
    public GreenfootImage img  = null; 
    /**
     * Act - do whatever the life1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void hoge()
    {        
        img = new GreenfootImage( "images/nolife.png" ); 
    }
    
    public void act() 
    {
        if(life2==false)
        {
            //減る順は3,2,1の順
            //灰色ハートに画像変更
            setImage(img);
        }
    }    
}