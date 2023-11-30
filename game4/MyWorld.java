import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private GreenfootImage Sgmap = null;
    
    public MyWorld()
    {
        super(1000,655,1);
        Sgmap = new GreenfootImage( "images/Sgmap.png" );
        Sgmap.scale(800, 500);
        getBackground().drawImage( Sgmap, 100, 50 );
        
        String input = Greenfoot.ask("プレイヤー人数を入力してください。");
        int players=Integer.parseInt(input);
        
        showText(input, 400, 200);
        
    }
    //public static  void  start (JSample1_1)
}



