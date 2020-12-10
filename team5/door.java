import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door extends Actor
{
    /**
     * Act - do whatever the door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
        {
            
        Actor actor = getOneIntersectingObject( Player.class );
        if( actor != null ){//もし主人公が触れて、キーがある場合
              
        if(Player.getkey == true){
            //ゴール時の処理　別のステージに遷移orクリア画面表示
            getWorld().removeObject( actor );
            getWorld().showText( "STATUS:GOAL!!", 100, 50 );
        }    
            }  
    }    
}
