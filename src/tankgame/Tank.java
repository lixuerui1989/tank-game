package tankgame;

public class Tank {


    private int x;
    private int y;
    private int direct;// 0: up, 1: right, 2: down, 3: left
    private int speed = 3;
    boolean isLive = true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // up, right, down, left movement method
    public void moveUp() {



        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }


    public void moveDown() {
        y += speed;
    }


    public void moveLeft() {
        x -= speed;
    }




    public int getDirect() {
        return direct;
    }


    public void setDirect(int direct) {
        this.direct = direct;
    }


    public Tank(int x, int y) {

        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}