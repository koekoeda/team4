
/**
 * Write a description of class DIce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
public class DIce extends Actor
{
    private GreenfootImage img1;
    private GreenfootImage img2;
    private GreenfootImage img3;
    private GreenfootImage img4;
    public int diceValue=0;
    private char player;
    private static int numTurns;
    
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

    public void player3Turn() 
    { 
        Marker3 marker3 = (Marker3)getWorld().getObjects(Marker3.class).get(0); 
        marker3.playerTurn(diceValue); 
    }

    public void player4Turn() 
    { 
        Marker4 marker4 = (Marker4)getWorld().getObjects(Marker4.class).get(0); 
        marker4.playerTurn(diceValue); 
    }

    public void player5Turn() 
    { 
        Marker5 marker5 = (Marker5)getWorld().getObjects(Marker5.class).get(0); 
        marker5.playerTurn(diceValue); 
    }

    public void act() 
    {
        rollDice();
    }

    public void changeImage()
    {
        diceValue=Greenfoot.getRandomNumber(6)+1;
        if(diceValue==1)
            setImage(img1);
        if(diceValue==2)
            setImage(img2);
        if(diceValue==3)
            setImage(img3);
        if(diceValue==4)
            setImage(img4);
 
    }

    public void rollDice()
    {
        if(Greenfoot.mouseClicked(this))
        {
            numTurns++;
            if(getX()==0 && getY()==3)
            {
                if(player =='1')
                {
                    for(int spin=0; spin< 20; spin ++)
                    {
                        turn(Greenfoot.getRandomNumber(360));
                        Greenfoot.delay(10);
                    }
                    changeImage();
                    player1Turn();
                    player ='2';
                }
                else if(player == '2')
                {
                    for(int spin=0; spin< 20; spin ++)
                    {
                        turn(Greenfoot.getRandomNumber(360));
                        Greenfoot.delay(10);
                    }
                    changeImage();
                    player2Turn();
                    player = '3';
                }
                else if(player == '3')
                {
                    for(int spin=0; spin< 20; spin ++)
                    {
                        turn(Greenfoot.getRandomNumber(360));
                        Greenfoot.delay(10);
                    }
                    changeImage();
                    player3Turn();
                    player = '4';
                }
                else if(player == '4')
                {
                    for(int spin=0; spin< 20; spin ++)
                    {
                        turn(Greenfoot.getRandomNumber(360));
                        Greenfoot.delay(10);
                    }
                    changeImage();
                    player4Turn();
                    player = '5';
                }
                else if(player == '5')
                {
                    for(int spin=0; spin< 20; spin ++)
                    {
                        turn(Greenfoot.getRandomNumber(360));
                        Greenfoot.delay(10);
                    }
                    changeImage();
                    player5Turn();
                    player = '1';
                }
            }
        }
    }

    public int getTurns() 
    {
        return numTurns;
    }

    public int getDiceValue()
    {
        return diceValue;
    }
}
*/
