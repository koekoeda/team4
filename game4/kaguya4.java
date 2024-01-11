import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kaguya4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kaguya4 extends Actor
{
    /**
     * Act - do whatever the kaguya4 wants to do. This method is called whenever
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
