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
    private GreenfootImage Meter = null;
    private GreenfootImage MeterBox = null;
    public MyWorld()
    {
        super(1000,655,1);
        Sgmap = new GreenfootImage( "images/Sgmap.png" );
        Sgmap.scale(800, 500);
        getBackground().drawImage( Sgmap, 100, 50 );
        MeterBox = new GreenfootImage( "images/好感度メータ.png" );
        MeterBox.scale( 200, 40 );
        Meter = new GreenfootImage( "images/好感度.png" );
        Meter.scale( 22, 40 );
        getBackground().drawImage( MeterBox, 50, 50 );
        getBackground().drawImage( Meter, 50, 50 );//好感度1
        getBackground().drawImage( Meter, 70, 50 );//好感度2
        getBackground().drawImage( Meter, 90, 50 );//好感度3
        getBackground().drawImage( Meter, 110, 50 );//好感度4
        getBackground().drawImage( Meter, 130, 50 );//好感度5
        getBackground().drawImage( Meter, 150, 50 );//好感度6
        getBackground().drawImage( Meter, 170, 50 );//好感度7
        getBackground().drawImage( Meter, 190, 50 );//好感度8
        getBackground().drawImage( Meter, 210, 50 );//好感度9
        getBackground().drawImage( Meter, 230, 50 );//好感度10
    }
}
