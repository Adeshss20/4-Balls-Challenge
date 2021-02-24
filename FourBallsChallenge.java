import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int  DIAMETER= 20;
    int circle1=0;
    int circle2=0;
    int circle3=0;
    int circle4=0;

    @Override
    public void settings() {

        super.settings();
        size(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    @Override
    public void setup() {
        ellipse(0,HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(0,HEIGHT*2/5,DIAMETER,DIAMETER);
        ellipse(0,HEIGHT*3/5,DIAMETER,DIAMETER);
        ellipse(0,HEIGHT*4/5,DIAMETER,DIAMETER);
    }

    @Override
    public void draw() {
        ellipse(circle1,HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(circle2,HEIGHT*2/5,DIAMETER,DIAMETER);
        ellipse(circle3,HEIGHT*3/5,DIAMETER,DIAMETER);
        ellipse(circle4,HEIGHT*4/5,DIAMETER,DIAMETER);
        circle1++;
        circle2+=2;
        circle3+=3;
        circle4+=4;
    }
}
