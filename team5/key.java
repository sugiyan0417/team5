import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class key extends Actor
{
    static public boolean getkey=false;
    /**
     * Act - do whatever the key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        //主人公にぶつかられたとき自身を削除
        Actor actor = getOneIntersectingObject( key.class );//player
        Actor key = getOneIntersectingObject( key.class );
        if( actor != null ){
    getWorld().removeObject( key ); // getWorld() は World オブジェクトの getter
    getkey = true;//鍵取得フラグ
}    
    }    
}
