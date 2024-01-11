import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class MyWorld extends World{
    public GreenfootImage Sgmap = null;
    public GreenfootImage Meter = null;
    public GreenfootImage MeterBox = null;
    public int count = 0;
    public int kesi = 0;

    public int poi = 0;
    public int[] K_x = {200,185,175,165,150};
    public int[] K_y = {500,500,500,500,500}; //kaguyaの現在地
    public int[] jun = {1,2,3,4,5}; //順番
    public int jun_max = 2; //順番の最大値
    public int i = 0; // 順番に使う
    public int status=0;
    public int[] sai = {0,0,0,0,0}; //サイコロの合計値
    public int[] mae = {0,0,0,0,0};
    public String inp = null;
    public boolean seigyo = true;
    public static boolean koro = true;    

    public void input(){
        while(seigyo){
            inp = Greenfoot.ask("プレイヤー人数を入力してください。\n2~5人を選択してください。");
            switch(inp){
                case "2":
                    addObject(new kaguya1(),K_x[0],K_y[0]);
                    addObject(new kaguya2(),K_x[1],K_y[1]);
                    jun_max = 2;
                    seigyo=false;
                    break;
                case "3":
                    addObject(new kaguya1(),K_x[0],K_y[0]);
                    addObject(new kaguya2(),K_x[1],K_y[1]);
                    addObject(new kaguya3(),K_x[2],K_y[2]);
                    jun_max = 3;
                    seigyo=false;
                    break;
                case "4":
                    addObject(new kaguya1(),K_x[0],K_y[0]);
                    addObject(new kaguya2(),K_x[1],K_y[1]);
                    addObject(new kaguya3(),K_x[2],K_y[2]);
                    addObject(new kaguya4(),K_x[3],K_y[3]);
                    jun_max = 4;
                    seigyo=false;
                    break;
                case "5":
                    addObject(new kaguya1(),K_x[0],K_y[0]);
                    addObject(new kaguya2(),K_x[1],K_y[1]);
                    addObject(new kaguya3(),K_x[2],K_y[2]);
                    addObject(new kaguya4(),K_x[3],K_y[3]);
                    addObject(new kaguya5(),K_x[4],K_y[4]);
                    jun_max = 5;
                    seigyo=false;
                    break;
            }
        }
    }

    public void Saikoro(){
        while(koro){
            if(Greenfoot.isKeyDown("space")){
                Greenfoot.delay(5);
                Random rand = new Random();
                int ran = rand.nextInt(4) + 1;
                poi = ran;
                sai[i] += poi;
                if(ran == 1){
                    addObject(new dice1(),300,300);
                    showText("サイコロの目は1です",200,200);
                    koro = false;
                }else if(ran == 2){
                    addObject(new dice2(),300,300);
                    showText("サイコロの目は2です",200,200);
                    koro = false;
                }else if(ran == 3){
                    addObject(new dice3(),300,300);
                    showText("サイコロの目は3です",200,200);
                    koro = false;
                }else if(ran == 4){
                    addObject(new dice4(),300,300);
                    showText("サイコロの目は4です",200,200);
                    koro = false;
                }
            }
        }
        if(koro == false){
            showText("spaceを押してください",200,250);
            if(Greenfoot.isKeyDown("space")){
                showText("",200,250);
                status = 3;
            }
        }
    }

    public void point(){
        if(sai[i] >= 50){
            sai[i] = 49;
        }
        int A1 = 1;
        int[] A2 = {3,5,7,9,21,23,25,27,29,41,43,45,47,49};//→上 14
        int[] A3 = {2,4,6,8,22,24,26,28,42,44,46,48};//→下 12
        int[] A4 = {12,14,16,18,32,34,36,38};//←上 8
        int[] A5 = {11,13,15,17,19,31,33,35,37,39};//←下 10
        int[] A_up = {10,20,30,40};
        int Goal = 50;
        if(mae[i] <= sai[i]){
            showText("前 :"+mae[i]+", 最大 :"+sai[i],400,400);
            Greenfoot.delay(15);
            if(mae[i] == A1){
                K_x[i] += 60;
                K_y[i] = 460;
            }
            for(int j=0;j < 14;j++){
                if(mae[i] == A2[j]){
                    K_x[i] += 75;
                    K_y[i] -= 40;
                }
            }
            for(int j=0;j < 12;j++){
                if(mae[i]==A3[j]){
                    K_x[i] += 75;
                    K_y[i] += 40;
                }
            }
            for(int j=0;j < 8;j++){
                if(mae[i]==A4[j]){
                    K_x[i] -= 75;
                    K_y[i] -= 40;
                }
            }
            for(int j=0;j < 10;j++){
                if(mae[i]==A5[j]){
                    K_x[i] -= 75;
                    K_y[i] += 40;
                }
            }
            for(int j=0;j < 4;j++){
                if(mae[i] == A_up[j]){
                    K_y[i] -= 100;
                }
            }
            if(mae[i] == Goal){
                K_x[i] += 75;
                K_y[i] -= 40;
            }
            showText("x :"+ K_x[i] +" , y :"+ K_y[i],300,500);
            mae[i]++;
        }
        if(mae[i]>sai[i]){
            status = 4;
        }
    }

    public void iti(){
        if(jun_max == 2){
            addObject(new kaguya1(),K_x[0],K_y[0]);
            addObject(new kaguya2(),K_x[1],K_y[1]);
            status = 5;
        }else if(jun_max == 3){
            addObject(new kaguya1(),K_x[0],K_y[0]);
            addObject(new kaguya2(),K_x[1],K_y[1]);
            addObject(new kaguya3(),K_x[2],K_y[2]);
            status = 5;
        }else if(jun_max == 4){
            addObject(new kaguya1(),K_x[0],K_y[0]);
            addObject(new kaguya2(),K_x[1],K_y[1]);
            addObject(new kaguya3(),K_x[2],K_y[2]);
            addObject(new kaguya4(),K_x[3],K_y[3]);
            status = 5;
        }else if(jun_max == 5){
            addObject(new kaguya1(),K_x[0],K_y[0]);
            addObject(new kaguya2(),K_x[1],K_y[1]);
            addObject(new kaguya3(),K_x[2],K_y[2]);
            addObject(new kaguya4(),K_x[3],K_y[3]);
            addObject(new kaguya5(),K_x[4],K_y[4]);
            status = 5;
        }
    }

    public void Kesi(){

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
        if(status==0){
            if(count == jun_max){
                Greenfoot.stop();
            }
            input();
            status = 1;
        }
        else if(status == 1){
            if(sai[i] == 49){
                i++;
            }
            showText("player" + jun[i] + "の番です",200,100);
            showText("Enterを押してください",200,250);
            if(Greenfoot.isKeyDown("enter")){
                showText("Spaceを押してください",200,250);
                //addObject(new saikoro(),300,300);
                koro = true;
                status = 2;
            }
        }
        else if(status == 2){
            Saikoro();
        }
        else if(status == 3){
            point();
        }else if(status == 4){
            iti();
        }
        else if(status == 5){
            showText("player" + jun[i] + "は" + sai[i] + "にいます",200,200);
            showText("Enterを押してください",200,250);
            if(Greenfoot.isKeyDown("enter")){
                showText("",200,200);
                status = 6;
            }
        }
        else if(status == 6){
            if(i < jun_max){
                i++;
                if(i >= jun_max ){
                    for(i = 0; i < jun_max ;i++){
                        if(sai[i] == 49){
                            count++;
                            showText(""+count,500,500 );
                            if(count == jun_max){
                                Greenfoot.stop();
                                status = 0;
                            }
                        }
                    }
                    count = 0;
                    i = 0;
                }
                status = 1;
            }
        }
        /* 好感度のパラメータ表示Sample *//*
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
         */
    }
}

