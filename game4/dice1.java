import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dice1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class dice1 extends Actor
{
    /**
     * Act - do whatever the dice1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor Dice2;
        Dice2 = getOneObjectAtOffset(0,0,dice2.class);
        World world = getWorld();
        if( Greenfoot.isKeyDown("enter")){
            getWorld().removeObject( this );
        }
    }
    public void dice1(){
        /*
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
        */
       
       
    }
}

