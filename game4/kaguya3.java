import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kaguya3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kaguya3 extends Actor
{
    /**
     * Act - do whatever the kaguya3 wants to do. This method is called whenever
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
