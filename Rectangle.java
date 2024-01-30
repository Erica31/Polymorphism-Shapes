
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private double width;
    private double length;
    public Rectangle(String c, boolean fill, double w, double l){
        super(c, fill);
        length = l;
        width = w;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }
}
