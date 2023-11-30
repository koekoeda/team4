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
        

        String input = Greenfoot.ask("プレイヤー人数を入力してください。");
        int players=Integer.parseInt(input);
        
        showText(input, 400, 200);
        
        switch(players){
            case 1:
            input = Greenfoot.ask("2人以上を入力してください。\nプレイヤー人数を入力してください。");
            players=Integer.parseInt(input);
            break;
            case 2:
             addObject(new kaguya5(),150,500);
             addObject(new kaguya4(),165,500);
             break;
            case 3:
             addObject(new kaguya5(),150,500);
             addObject(new kaguya4(),165,500);
             addObject(new kaguya3(),180,500);
             break;
            case 4:
             addObject(new kaguya5(),150,500);
             addObject(new kaguya4(),165,500);
             addObject(new kaguya3(),180,500);
             addObject(new kaguya2(),195,500);
             break;
            case 5:
             addObject(new kaguya5(),150,500);
             addObject(new kaguya4(),165,500);
             addObject(new kaguya3(),180,500);
             addObject(new kaguya2(),195,500);
             addObject(new kaguya1(),210,500);
             break;
            default:
             input = Greenfoot.ask("5人以下」を入力してください。\nプレイヤー人数を入力してください。");
             players=Integer.parseInt(input);
             break;
            
        }
        
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



