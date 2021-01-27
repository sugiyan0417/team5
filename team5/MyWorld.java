import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static public int life=3;

    
    final int NULL = 0;
    final int PLAYER = 1;
    final int SLIME = 2;
    final int BAT = 3;
    final int BLOCKSEA = 4;
    final int BLOCKCLOUD = 5;
    final int DOOR = 6;
    final int KEY = 7;
    final int MAX = 8;
    
    ///***1050×900***/
    /*int map[] = {
        3, 0, 0, 0, 6, 0, 0,
        7, 0, 1, 0, 4, 4, 4,
        4, 4, 4, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 2, 0,
        0, 0, 2, 0, 4, 4, 4,
        4, 4, 4, 4, 4, 4, 4
    };*/
    ///***800×600image(50,50)***/
    int map[] = {
        0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        7, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0,
        0, 0, 0, 0, 0, 2, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0,
        0, 0, 2, 0, 4, 4, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0,
        4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 4, 4, 4, 0, 0,
        0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 1, 0, 0, 4, 4, 0, 4, 0, 0, 0, 3, 0, 0, 0, 0,
        4, 4, 4, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 4, 4,
        0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, 0, 4, 4, 4,
        0, 0, 2, 0, 4, 4, 4, 4, 0, 0, 4, 4, 4, 4, 4, 4,
        4, 4, 4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 4
    };
    
    List<Actor> actors = new ArrayList<Actor>();
    final int gravity = 1;
    double time = 1;
    Player player = new Player();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,600,1);
        for(int i = 0; i < map.length; ++i){
            int x = (i % 16) * 50 + 25;
            int y = (i / 16) * 50 + 25;
            switch(map[i]){
                case PLAYER:
                    addObject(player, x, y);
                    break;
                case SLIME:
                    actors.add(new Slime());
                    break;
                case BAT:
                    actors.add(new Bat());
                    break;
                case BLOCKSEA:
                    actors.add(new BlockSea());
                    break;
                case BLOCKCLOUD:
                    actors.add(new BlockCloud());
                    break;
                case DOOR:
                    actors.add(new Door());
                    break;
                case KEY:
                    actors.add(new Key());
                    break;
                default: break;
            }
            if(map[i] != NULL && map[i] != PLAYER) addObject( actors.get(actors.size()-1), x, y);
        }
        //showText(String.valueOf(map.length) + ":" + String.valueOf(actors.size()), 100, 100);
        /*addObject( new Key(), 100, 250 );
        addObject( new Door(), 700, 169 );
        //addObject( new door(), 350, 680 );//テスト用
        //addObject( new key(), 300, 680 );//テスト用
        addObject( new Slime(), 300, 680 );//テスト用
        addObject(new Slime(), 800, 580);
        addObject(new Bat(), 80, 100);
        addObject(new Player(), 50, 680);
        addObject(new life1(), 700, 800);
        addObject(new life2(), 800, 800);
        addObject(new life3(), 900, 800);
        
        
        for(int x=50;x<1000;x+=150){
        addObject( new BlockSea(), x, 830 );
    }
    for(int x=50;x<500;x+=150){
        addObject( new BlockSea(), x, 400 );
    }
    for(int x=500;x<1000;x+=150){
        addObject( new BlockSea(), x, 700 );
    }
    for(int x=700;x<1500;x+=150){
        addObject( new BlockSea(), x, 300 );
    }*/
   
    }
    public void act(){
        //setActOrder(BlockSea.class,life1.class, life2.class, life3.class);
        if(player != null){
            if(!player.getIsGround()) time += 0.3;
            else time = 0;
            player.moveSafely(0, (int)(gravity * time));
        }
        /*int playerX = player.getX();
        int playerY = player.getY();*/
    }
    static public int[] getImageScale(){
        int[] scale = {50, 50};
        return scale;
    }

}
