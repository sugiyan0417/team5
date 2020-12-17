import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slime extends Actor
{
    /**
     * Act - do whatever the slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor actor = getOneIntersectingObject( player.class );
        if( actor != null ){
            //getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            //Player衝突時はPlayerを赤く光らせるorほかの処理する
            
            getWorld().showText( "STATUS:ITAI!", 100, 50 );
            MyWorld.life--;//鍵取得フラグ
            /*ぶつかったときにライフが減る　しかし同時に何個も減るので、無敵時間を設定*/
            if(MyWorld.life==2)
            {
                life3.life3=false;
            }
            if(MyWorld.life==1)
            {
                life2.life2=false;
            }if(MyWorld.life==0)
            {
                life1.life1=false;
            }
            else
            {
                //なにもしない
            }
}    
    }    
}
