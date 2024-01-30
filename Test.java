
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        Shape[] shapes = new Shape[6];
        
        shapes[0] = new Circle("pink", true, 5);
        shapes[1] = new Rectangle("purple", false, 3, 4);
        shapes[2] = new Triangle("blue", true, 3, 4, 5);
        shapes[3] = new Square("black", true, 3);
        shapes[4] = new Pentagon("white", false, 5);
        shapes[5] = new House("green", true, 6);
        
        System.out.println("PERIMETER:");
        for(Shape s: shapes){
            System.out.println(s.calculatePerimeter());
        }
        
        System.out.println("AREA:");
        for(Shape s: shapes){
            System.out.println(s.calculateArea());
        }
        
        System.out.println("INFO:");
        for(Shape s: shapes){
            s.displayInfo();
        }
    }
}
