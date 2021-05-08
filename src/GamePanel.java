import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {


    //screen width
    static final int SCREEN_WIDTH=400;
    static final int SCREEN_HEIGHT=400;
    static final int UNIT_SIZE=20;
    static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY=75;

    //arrays to hold the co ordinates of snake including head
    final int x[]=new int[GAME_UNITS];
    final int y[]=new int[GAME_UNITS];
    int bodyParts=5;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running= false;
    Timer timer;
    Random random;


    GamePanel(){
        //constructor for this class
        random= new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();



    }
    public void startGame(){
        newApple();
        running= true;
        timer=new Timer(DELAY,this);
        timer.start();


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g){
        for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++)
        {

            g.drawLine(i*UNIT_SIZE,0,i*UNIT_SIZE,SCREEN_HEIGHT);
            g.drawLine(0,i*UNIT_SIZE,SCREEN_HEIGHT,i*UNIT_SIZE);
        }

    }
    public void newApple(){
        //generate co ordinates of a new apple
        appleX = random.nextInt((int)SCREEN_WIDTH/UNIT_SIZE);
        appleY=random.nextInt(int(SCREEN_HEIGHT))


    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollision(){

    }
    public void gameOver(Graphics g){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }


}
