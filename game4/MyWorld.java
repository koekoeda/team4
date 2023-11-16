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
    public MyWorld()
    {
        super(1000,667,1);
        GreenfootImage Sgmap = new GreenfootImage( "images/Sgmap.png" );
        getBackground().drawImage( Sgmap, 100, 100 );
        Sgmap.scale( 400, 700 );
    }
}
