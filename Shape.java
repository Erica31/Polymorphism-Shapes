
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
    //instance variables
    private String color;
    private boolean filled;
    
    //constructor
    public Shape(String c, boolean fill){
         color = c;
         filled = fill;
    }
    public double calculateArea(){
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }
    public void displayInfo(){
        System.out.println("Color: "+color);
        System.out.println("Filled?: "+filled);
    }
    
    //accesors
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    
    //mutators
    public void setColor(String color){
        this.color = color;
    }
    public void changeFill(boolean filled){
        this.filled = filled;
    }
    
}
