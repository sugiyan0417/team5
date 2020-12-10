import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
static public boolean getkey=false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean[] getKeys = new boolean[128];
    boolean[] getKeysDown = new boolean[128];
    boolean[] getKeysUp = new boolean[128];
    //コンストラクタ
    public Player(){
        getImage().scale(150,150);
    }
    public void act() 
    {
        // Add your action code here.
        
        keyboard();
    }
    public void keyboard(){
        if(Greenfoot.isKeyDown("a")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("d")){
            move(4);
        }
        
        /*if(Greenfoot.isKeyDown("w")){
            getKeys["w"] = true;
        }
        if(!getKeysDown["w"] && getKeys["w"]){
            getKeysDown["w"] = true;
        }else{
            
        }
        char keyUp = getKey();
        if(keyUp){
            getKeysUp[keyUp] = true;
        }*/
        Actor actor = getOneIntersectingObject( key.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            getWorld().showText( "STATUS:GET!", 100, 50 );
            getkey = true;//鍵取得フラグ
}    
    /*    
    Actor actor = getOneIntersectingObject( Player.class );
    if(MyWorld.life==0)
        {
            //ゲームオーバー処理
            getWorld().removeObject( actor );
        }
    }
    */
    
    
}
}
