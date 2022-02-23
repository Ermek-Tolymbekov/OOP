public class MovablePoint extends Point{
    private float xSpeed = 0.0f, ySpeed = 0.0f;
    MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(){}
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void set(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }
    @Override
    public String toString(){
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
