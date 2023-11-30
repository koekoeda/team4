import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private GreenfootImage Sgmap = null;
    public MyWorld()
    {
        super(1000,655,1);
        Sgmap = new GreenfootImage( "images/Sgmap.png" );
        Sgmap.scale(800, 500);
        getBackground().drawImage( Sgmap, 100, 50 );
        
        addObject(new kaguya5(),150,500);
        addObject(new kaguya4(),165,500);
        addObject(new kaguya3(),180,500);
        addObject(new kaguya2(),195,500);
        addObject(new kaguya1(),210,500);
    }
}
