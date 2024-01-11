import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kaguya2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kaguya2 extends Actor
{
    /**
     * Act - do whatever the kaguya2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World world = getWorld();
        if( Greenfoot.isKeyDown("space")){
            getWorld().removeObject( this );
        }
    }    
}
