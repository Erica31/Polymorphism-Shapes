
/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Shape
{
    private double side;
    public Pentagon(String c, boolean fill, double s){
        super(c, fill);
        side = s;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side = s;
    }
    @Override
    public double calculateArea(){
        return Math.sqrt(5*(5+(2*Math.sqrt(5))))*(side*side)*(1/4);
    }
    public double calculatePerimeter(){
        return (side*5);
    }
}
