
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Square
{
    private double side;
    public House(String c, boolean fill, double s){
        super(c, fill, s);
        side = s;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side = s;
    }
    public double calculateArea(){
        double trigA = ((Math.sqrt(3))/4)*side*side;
        return super.calculateArea() + trigA;
    }
    public double calculatePerimeter(){
        return (side*5);
    }
}
