import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kesi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kesi extends Actor
{
    /**
     * Act - do whatever the kesi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor Dice1;
        Dice1 = getOneObjectAtOffset(0,0,dice1.class);
        if( Dice1 != null ){
            getWorld().removeObject( Dice1 );
        } 
        Actor Dice2;
        Dice2 = getOneObjectAtOffset(0,0,dice2.class);
        if( Dice2 != null ){
            getWorld().removeObject( Dice2 );
        } 
        Actor Dice3;
        Dice3 = getOneObjectAtOffset(0,0,dice3.class);
        if( Dice3 != null ){
            getWorld().removeObject( Dice3 );
        } 
        Actor Dice4;
        Dice4 = getOneObjectAtOffset(0,0,dice4.class);
        if( Dice4 != null ){
            getWorld().removeObject( Dice4 );
        } 
    }
}
