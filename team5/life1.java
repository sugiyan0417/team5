import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class life1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class life1 extends Actor
{
    static public boolean life1=true;
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
        if(life1==false)
        {
            //減る順は3,2,1の順
            //灰色ハートに画像変更
            setImage(img);
        }
    }    
}
