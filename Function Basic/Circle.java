import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float r = in.nextFloat();
        Circum(r);
        Area(r);
    }

    static void Circum(float radius){
        double circumference =(2*(3.14)*radius);
        System.out.println("Circumference of circle = "+circumference);
    }

    static void Area(float radius){
        double area = (3.14)*(radius*radius);
        System.out.println("Area of circle = "+area);
    }
}
