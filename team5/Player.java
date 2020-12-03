import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean[] getKeys = new boolean[128];
    boolean[] getKeysDown = new boolean[128];
    boolean[] getKeysUp = new boolean[128];
    
    boolean isADown = false;
    boolean isDDown = false;
    boolean isSDown = false;
    boolean isWDown = false;
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
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("a")){
            setLocation(x-4,y);
            //move(-4);
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(x+4,y);
            //move(4);
        }
        if(Greenfoot.isKeyDown("w")&&!isWDown){
            isWDown = true;
            setLocation(x,y-200);
            //move(4);
        }
        String key = Greenfoot.getKey();
        if(key != null){
            if(key.equals("w")){
                isWDown = false;
            }
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
    }
}
