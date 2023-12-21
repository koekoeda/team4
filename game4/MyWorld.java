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
    static int[] K_x,K_y; //kaguya1の現在地
    static int[] jun = {1,2,3,4,5}; //順番
    static int jun_max = 0; //順番の最大値
    static int i = 0; // 順番に使う
    static int[] poi = {0,0,0,0,0};
    static int[] kaguya1 = {jun[0],K_x[0],K_y[0],poi[0]};
    static int[] kaguya2 = {jun[1],K_x[1],K_y[1],poi[1]};
    static int[] kaguya3 = {jun[2],K_x[2],K_y[2],poi[2]};
    static int[] kaguya4 = {jun[3],K_x[3],K_y[3],poi[3]};
    static int[] kaguya5 = {jun[4],K_x[4],K_y[4],poi[4]};
    
    public int sai = 0; //サイコロの合計値

    public void input(String inp){
        switch(inp){
            case "2":
            addObject(new kaguya5(),150,500);
            addObject(new kaguya4(),165,500);
            jun_max = 2;
            break;
            case "3":
            addObject(new kaguya5(),150,500);
            addObject(new kaguya4(),165,500);
            addObject(new kaguya3(),180,500);
            jun_max = 3;
            break;
            case "4":
            addObject(new kaguya5(),150,500);
            addObject(new kaguya4(),165,500);
            addObject(new kaguya3(),180,500);
            addObject(new kaguya2(),195,500);
            jun_max = 4;
            break;
            case "5":
            addObject(new kaguya5(),150,500);
            addObject(new kaguya4(),165,500);
            addObject(new kaguya3(),180,500);
            addObject(new kaguya2(),195,500);
            addObject(new kaguya1(),210,500);
            jun_max = 5;
            break;
            default:
            inp = Greenfoot.ask("プレイヤー人数を入力してください。\n2~5人を選択してください。");
            break;
        }
    }

    public void Saikoro(int poi){
        /*****サイコロ*****/
        boolean koro = true;
        while(koro){
            img1 = new GreenfootImage("images/dice-01.png");
            img1.scale( 140, 138 );

            img2 = new GreenfootImage("images/dice-02.png");
            img2.scale( 140, 138 );

            img3 = new GreenfootImage("images/dice-03.png");
            img3.scale( 140, 138 );

            img4 = new GreenfootImage("images/dice-04.png");
            img4.scale( 140, 138 );

            showText("Enterを押してください",200,200);
            if(Greenfoot.isKeyDown("enter")){
                Random rand = new Random();
                int ran = rand.nextInt(4) + 1;
                poi += ran;
                point(poi);
                if(ran == 1){
                    img1.scale( 140, 138 );
                    showText("サイコロの目は1です",200,200);
                    koro = false;
                }else if(ran == 2){
                    img2.scale( 140, 138 );
                    showText("サイコロの目は2です",200,200);
                    koro = false;
                }else if(ran == 3){
                    img3.scale( 140, 138 );
                    showText("サイコロの目は3です",200,200);
                    koro = false;
                }else if(ran == 4){
                    img4.scale( 140, 138 );
                    showText("サイコロの目は4です",200,200);
                    koro = false;
                }else{
                    showText("サイコロを振れませんでした",200,200);
                    koro = false;
                }
            }
        }
    }

    public void point(int sai){
        int[] migi = {1,3,5,7};
        int[] hida = {0,2,4,6};
        for(int j = 0;j < 5;j++){
            if(sai == migi[j]){
                K_x[i] += 20;
                K_y[i] -= 20;
            }else if(sai == hida[j]){
                K_x[i] += 20;
                K_y[i] += 20;
            }
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
            for(i = 0; jun[i] < jun_max; i++){
                    showText("player" + jun[i] + "の番です",200,200);
                    Saikoro(poi[i]);
                    showText("player" + jun[i] + "は" + sai + "にいます",200,200);
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

