public class Point {
    protected float x = 0.0f, y = 0.0f;
    Point(){}
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x, y};
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
