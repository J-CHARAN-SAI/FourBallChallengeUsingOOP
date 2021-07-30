public class Ball {
    public final int diameter=10;
    public int heightOfBallFromTop;
    public int speedOfBall;
    public int positionOfBall;
    public Ball(int speedOfBall, int heightOfBallFromTop) {
        setHeight(heightOfBallFromTop);
        setSpeed(speedOfBall);
    }

    private void setSpeed(int speedOfBall) {
        this.speedOfBall= speedOfBall;
    }

    private void setHeight(int heightOfBallFromTop) {
        this.heightOfBallFromTop= heightOfBallFromTop;
    }
    public void getPosition(){
        this.positionOfBall+=this.speedOfBall;
    }
    public int getHeight() {
        return heightOfBallFromTop;
    }
}
