import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static Ball balls[]=new Ball[4];
    public static void main(String[] args) {
        PApplet.main("FourBallChallenge",args);

    }

    @Override
    public void settings() {

        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ballNumber = 0; ballNumber < 4; ballNumber++) {
            balls[ballNumber]=new Ball(getSpeedOfBall(ballNumber),(getSpeedOfBall(ballNumber))*(HEIGHT/5));
        }
    }

    private int getSpeedOfBall(int ballNumber) {
        return ballNumber + 1;
    }

    @Override
    public void draw() {
        for (int ballNumber = 0; ballNumber < 4; ballNumber++) {
            ellipse(balls[ballNumber].positionOfBall,balls[ballNumber].getHeight(),balls[ballNumber].diameter,balls[ballNumber].diameter);
            balls[ballNumber].getPosition();
        }
    }
}
