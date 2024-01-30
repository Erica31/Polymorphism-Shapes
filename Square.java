
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    private double side;
    public Square(String c, boolean fill, double s){
        super(c, fill);
        side = s;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side = s;
    }
    public double calculateArea(){
        return side*side;
    }
    public double calculatePerimeter(){
        return (side*4);
    }
}
