import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public GreenfootImage Sgmap = null;

    public GreenfootImage Meter = null;
    public GreenfootImage MeterBox = null;

    public void input(String inp){
        switch(inp){
                case "2":
                addObject(new kaguya5(),150,500);
                addObject(new kaguya4(),165,500);
                break;
                case "3":
                addObject(new kaguya5(),150,500);
                addObject(new kaguya4(),165,500);
                addObject(new kaguya3(),180,500);
                break;
                case "4":
                addObject(new kaguya5(),150,500);
                addObject(new kaguya4(),165,500);
                addObject(new kaguya3(),180,500);
                addObject(new kaguya2(),195,500);
                break;
                case "5":
                addObject(new kaguya5(),150,500);
                addObject(new kaguya4(),165,500);
                addObject(new kaguya3(),180,500);
                addObject(new kaguya2(),195,500);
                addObject(new kaguya1(),210,500);
                break;
                default:
                inp = Greenfoot.ask("プレイヤー人数を入力してください。\n2~5人を選択してください。");
                break;
        }
    }
    public MyWorld()
    {
        super(1000,655,1);
        Sgmap = new GreenfootImage( "images/Sgmap.png" );
        Sgmap.scale(800, 500);
        getBackground().drawImage( Sgmap, 100, 50 );
    }

    public void act()
    {
        int status=0;
        if(status==0 && Greenfoot.isKeyDown("space")){
            status=1;
            int end = 1;
            String inp = Greenfoot.ask("プレイヤー人数を入力してください。\n2~5人を選択してください。");
            input(inp);
                
            
        
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
    }
        //public static  void  start (JSample1_1)
}


