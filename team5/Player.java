import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
import java.util.List;
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
    final int speed = 4;
    final int jumpPower = -100;
    final int gravity = -2;
    final int tET = -25;
    final int bET = 20;
    final int lET = -15;
    final int rET = 15;
    int halfSize = 0;
    GreenfootImage[] images = {
        new GreenfootImage("images/player.png"),
        new GreenfootImage("images/player(hanten).png")
    };
    
    greenfoot.World world = getWorld();
    boolean hasGottenKey = false;
    boolean isGround = false;
    //コンストラクタ
    public Player(){
        int[] scale = MyWorld.getImageScale();
        images[0].scale(scale[0], scale[1]);
        images[1].scale(scale[0], scale[1]);
        setImage(images[1]);
        halfSize = scale[0]/2;
        for(int i = 0; i < getKeysUp.length; ++i) getKeysUp[i] = true;
    }
    public void act() 
    {
        // Add your action code here.
        keyboard();
    }
    public boolean isOutOfBounds(int x, int y){
        List<Actor> actors = getIntersectingObjects(Actor.class);
        boolean isCollision = false;
        if( actors != null){
            for(int i = 0; i < actors.size(); ++i){
                Actor actor = actors.get(i);
                String imgStr = actor.getImage().toString();
            //getWorld().showText(imgStr,0,100);
                int _x = actor.getX();
                int _y = actor.getY();
            //getWorld().showText("_x:" + String.valueOf(_x) + "_y:" + String.valueOf(_y),300,100/*+i*100*/);
                if(imgStr.indexOf("block_seaground") != -1){
                    if(_x-halfSize <= x+35 && x-35 <= _x+halfSize){
                        if(y < _y) {if(y+60 > _y-halfSize) isCollision = true;}//上から
                        else { if(y-70 < _y+halfSize) isCollision = true;}//下から
                    }else if(_y-halfSize <= y+60 && y-70 <= _y+halfSize){
                        if(x < _x) {if(x+35 > _x-halfSize) isCollision = true;}//右から
                        else { if(x-35 < _x+halfSize) isCollision = true;}//左から
                    }
                }
            }
        }else{
            getWorld().showText( "", 300, 100 );
        }
        return isCollision;
    }
    public void moveSafely(int dx, int dy){
        if(this == null) return;
        int x = getX();
        int y = getY();
        int h = 0;
        int ajustY = 0;
        int numOfTimes = 1;
        if(dx < 0){
            Actor ltlc = getOneObjectAtOffset(dx + lET, tET, BlockSea.class);
            Actor lblc = getOneObjectAtOffset(dx + lET, bET, BlockSea.class);
            if(ltlc != null) x = ltlc.getX() + halfSize - lET + 1;
            else if(lblc != null) x = lblc.getX() + halfSize - lET + 1;
            else if(ltlc == null && lblc == null) x += dx; 
        }else if(dx > 0){
            Actor rtrc = getOneObjectAtOffset(dx + rET, tET, BlockSea.class);
            Actor rbrc = getOneObjectAtOffset(dx + rET, bET, BlockSea.class);
            if(rtrc != null) x = rtrc.getX() - halfSize - rET - 1;
            else if(rbrc != null) x = rbrc.getX() - halfSize - rET - 1;
            else if(rtrc == null && rbrc == null) x += dx;
        }
        if(getOneObjectAtOffset(0, bET + 5, BlockSea.class) == null) isGround = false;
        if(dy < 0){
            isGround = false;
            if(dy < -halfSize*2){
                h = dy + halfSize*2;
                dy = -halfSize*2;
                numOfTimes = 2;
                getWorld().showText("dy < -halfSize*2", 100, 600);
                getWorld().showText(String.valueOf(h), 100, 650);
            }
            for(int i = 0; i < numOfTimes; ++i){
            Actor ttlc = getOneObjectAtOffset(lET, dy + tET + ajustY, BlockSea.class);
            Actor ttrc = getOneObjectAtOffset(rET, dy + tET + ajustY , BlockSea.class);
            if(ttlc != null){y = ttlc.getY() + halfSize - tET;numOfTimes = 1;}
            else if(ttrc != null){y = ttrc.getY() + halfSize - tET;numOfTimes = 1;}
            else y += dy;
            ajustY = dy;
            dy = h;
            }
        }else if(dy > 0){
                Actor bblc = getOneObjectAtOffset(lET, dy + bET, BlockSea.class);
                Actor bbrc = getOneObjectAtOffset(rET, dy + bET, BlockSea.class);
                if(bblc != null){y = bblc.getY() - halfSize - bET - 1;isGround = true;}
                else if(bbrc != null) {y = bbrc.getY() - halfSize - bET - 1;isGround = true;}
                else y += dy;
                //getWorld().showText("", 100, 600);
        }
        setLocation(x, y);
    }
    public void keyboard(){
        int horizontalAxis = 0;
        int verticalAxis = 0;
        int dx = 0;
        int dy = 0;
        if(Greenfoot.isKeyDown("a")){
            getKeys[(int)'a'] = true;
            horizontalAxis = -1;
            //setLocation(x-speed, y);
        }
        if(Greenfoot.isKeyDown("d")){
            getKeys[(int)'d'] = true;
           horizontalAxis = 1;
            //setLocation(x+speed, y);
        }
        if(Greenfoot.isKeyDown("w")){
            getKeys[(int)'w'] = true;
            verticalAxis = -1;
            //setLocation(x, y-speed);
        }
        if(Greenfoot.isKeyDown("s")){
            getKeys[(int)'s'] = true;
            verticalAxis = 1;
            //setLocation(x, y+speed);
        }
        //getWorld().showText("x:" + String.valueOf(x) + "y:" + String.valueOf(y),300,50);
        if(!getKeysDown[(int)'w'] && getKeys[(int)'w'] && getKeysUp[(int)'w']){
            getKeysDown[(int)'w'] = true;
            getKeysUp[(int)'w'] = false;
            dy = jumpPower;
        }else{
            getKeysDown[(int)'w'] =false;
        }
        if(!getKeysDown[(int)'a'] && getKeys[(int)'a'] && getKeysUp[(int)'a']){
            getKeysDown[(int)'a'] = true;
            getKeysUp[(int)'a'] = false;
            setImage(images[0]);
        }else{
            getKeysDown[(int)'a'] = false;
        }
        if(!getKeysDown[(int)'d'] && getKeys[(int)'d'] && getKeysUp[(int)'d']){
            getKeysDown[(int)'d'] = true;
            getKeysUp[(int)'d'] = false;
            setImage(images[1]);
        }else{
            getKeysDown[(int)'d'] =false;
        }
        dx = speed*horizontalAxis;// - gravity;
        moveSafely(dx, dy);
        String keyUp = Greenfoot.getKey();
        if(keyUp != null){
            int key = (int)keyUp.toCharArray()[0];
            getKeysUp[key] = true;
            getKeys[key] = false;
        }
        
        Actor actor = getOneIntersectingObject( Key.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            getWorld().showText( "STATUS:GET!", 100, 50 );
            hasGottenKey = true;//鍵取得フラグ
        }
        
        /*    
         * Actor actor = getOneIntersectingObject( Player.class );
         * if(MyWorld.life==0)
         * {
         *     //ゲームオーバー処理
         *     getWorld().removeObject( actor );
         * }
         */    
    }
    public boolean getsKey(){
        return hasGottenKey;
    }
    public boolean getIsGround(){
        return isGround;
    }
}