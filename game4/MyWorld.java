import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class MyWorld extends World
{
    public GreenfootImage Sgmap = null;

    public GreenfootImage Meter = null;
    public GreenfootImage MeterBox = null;
    public GreenfootImage img1 = null;
    public GreenfootImage img2 = null;
    public GreenfootImage img3 = null;
    public GreenfootImage img4 = null;
    static int status=0;

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
        if(status==0 || Greenfoot.isKeyDown("space")){
            status = 1;
            int end = 1;
            String inp = Greenfoot.ask("プレイヤー人数を入力してください。\n2~5人を選択してください。");
            input(inp);

            /*****サイコロ*****/
            boolean koro = true;
            while(koro){
                img1 = new GreenfootImage("dice-01.png");
                img1.scale( 140, 138 );
                Greenfoot.delay(1);
                img2 = new GreenfootImage("dice-02.png");
                img2.scale( 140, 138 );
                Greenfoot.delay(1);
                img3 = new GreenfootImage("dice-03.png");
                img3.scale( 140, 138 );
                Greenfoot.delay(1);
                img4 = new GreenfootImage("dice-04.png");
                img4.scale( 140, 138 );
                Greenfoot.delay(1);
                if(Greenfoot.isKeyDown("enter")){
                    Random rand = new Random();
                    int ran = rand.nextInt(4) + 1;
                    if(ran == 1){
                        img1 = new GreenfootImage("dice-01.png");
                        img1.scale( 140, 138 );
                        showText("サイコロの目は1です",200,200);
                        koro = false;
                    }else if(ran == 2){
                        img2 = new GreenfootImage("dice-02.png");
                        img2.scale( 140, 138 );
                        showText("サイコロの目は2です",200,200);
                        koro = false;
                    }else if(ran == 3){
                        img3 = new GreenfootImage("dice-03.png");
                        img3.scale( 140, 138 );
                        showText("サイコロの目は3です",200,200);
                        koro = false;
                    }else if(ran == 4){
                        img4 = new GreenfootImage("dice-04.png");
                        img4.scale( 140, 138 );
                        showText("サイコロの目は4です",200,200);
                        koro = false;
                    }else{
                        showText("サイコロを振れませんでした",200,200);
                        koro = false;
                    }
                }
                
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
    }
    //public static  void  start (JSample1_1)
}

