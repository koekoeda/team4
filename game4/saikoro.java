import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class saikoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saikoro extends Actor
{
    private GifImage img;
    /**
     * Act - do whatever the saikoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        img = new GifImage("images/Saikoro.gif");
        //if(img != null)
        //{
            setImage(img.getCurrentImage());
        //}
    }
}
