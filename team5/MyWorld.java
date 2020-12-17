import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static public int life=3;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1000, 900, 1); 
        addObject( new key(), 100, 250 );
        addObject( new door(), 700, 169 );
        //addObject( new door(), 350, 680 );//テスト用
        //addObject( new key(), 300, 680 );//テスト用
        addObject( new slime(), 300, 680 );//テスト用
        addObject(new slime(), 800, 580);
        addObject(new bat(), 80, 100);
        addObject(new player(), 50, 680);
        addObject(new life1(), 700, 800);
        addObject(new life2(), 800, 800);
        addObject(new life3(), 900, 800);
        
        
        for(int x=50;x<1000;x+=150){
        addObject( new block_seaground(), x, 830 );
    }
    for(int x=50;x<500;x+=150){
        addObject( new block_seaground(), x, 400 );
    }
    for(int x=500;x<1000;x+=150){
        addObject( new block_seaground(), x, 700 );
    }
    for(int x=700;x<1500;x+=150){
        addObject( new block_seaground(), x, 300 );
    }
    
      

    }
    public void act(){
        setActOrder(block_seaground.class,life1.class, life2.class, life3.class);
      
    }

}
