import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DIce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DIce extends Actor
{
    private GreenfootImage img1;
    private GreenfootImage img2;
    private GreenfootImage img3;
    private GreenfootImage img4;
    private char player;
    private static int numTurns;
    /**
     * Act - do whatever the DIce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //ダイスに値を振り分ける
    public void act() 
    {
       img1 = new GreenfootImage("dice-01.png");
       img2 = new GreenfootImage("dice-02.png");
       img3 = new GreenfootImage("dice-03.png");
       img4 = new GreenfootImage("dice-04.png");
       player= '1';
       numTurns = 0;
        // Add your action code here.
    }
    
    //サイコロをマーカー1(プレーヤー1)クラスに接続
    //->拡張forを使うらしいが接続にどう影響してくるかはわからん
    public void player1Turn()
    {
        Marker1 marker1 = (Marker1)getWorld().getObjects(Marker1.class).get(0); 
        marker1.playerTurn(diceValue); 
    }
    
    //マーカー2以降も上と同じ悩みあり
    public void player2Turn() 
    { 
        Marker2 marker2 = (Marker2)getWorld().getObjects(Marker2.class).get(0); 
        marker2.playerTurn(diceValue); 
    }
    
