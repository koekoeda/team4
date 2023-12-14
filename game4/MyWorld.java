import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private GreenfootImage Sgmap = null;

    private GreenfootImage Meter = null;
    private GreenfootImage MeterBox = null;

    public MyWorld()
    {
        super(1000,655,1);
        Sgmap = new GreenfootImage( "images/Sgmap.png" );
        Sgmap.scale(800, 500);
        getBackground().drawImage( Sgmap, 100, 50 );
        
        String input
        
        
        /* 好感度のパラメータ表示Sample */
        showText("koukando",60,20);
        MeterBox = new GreenfootImage( "images/好感度メータ.png" );
        MeterBox.scale( 200, 30 );
        getBackground().drawImage( MeterBox, 50, 50 );
        Meter = new GreenfootImage( "images/好感度.png" );
        Meter.scale( 22, 30 );
        int koukando=4;//koukando level
        int level = 50;
        for(int i=0; i < koukando; i++){
            getBackground().drawImage( Meter, level, 50 );
            level += 20;
        }

    }
    //public static  void  start (JSample1_1)
}



