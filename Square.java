public class Square extends Rectangle{
    Square(){}
    Square(double side){
        super(side, side);
    }
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
