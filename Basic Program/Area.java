import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        //Area of Circle
        System.out.print("Enter radius of circle: ");
        float r = in.nextFloat();
        double pie = 3.14;
        double area_circle = pie*r*r;
        System.out.println("Area of circle: "+area_circle);

        //Area of Triangle
        System.out.print("Enter height of triangle: ");
        float h = in.nextFloat();
        System.out.print("Enter base of triangle: ");
        float b = in.nextFloat();
        double area_triangle = (0.5)*(b*h);
        System.out.println("Are of triangle: "+area_triangle);


        //Area of Rectangle
        System.out.print("Enter length of rectangle: ");
        float length = in.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float breadth = in.nextFloat();
        double area_rectangle = length*breadth;
        System.out.println("Area of rectangle: "+area_rectangle);


        //Area of Isosceles Triangle
        System.out.print("Enter base of triangle: ");
        float base = in.nextFloat();
        System.out.print("Enter height of triangle: ");
        float height = in.nextFloat();
        double area_itriangle = (1.73205080757/4)*base*height;
        System.out.println("Area of an isosceles Triangle: "+area_itriangle);


        //Area of Parallelogram
        System.out.print("Enter base of parallelogram: ");
        float pb = in.nextFloat();
        System.out.print("Enter height of parallelogram: ");
        float ph = in.nextFloat();
        double area_parallelogram = pb*ph;
        System.out.println("Area of parallelogram: "+area_parallelogram);


        //Area of Rhombus
        System.out.print("Enter the value of first diagonal: ");
        float d1 = in.nextFloat();
        System.out.print("Enter the value of second diagonal: ");
        float d2 = in.nextFloat();
        double area_rhombus = (0.5)*d1*d2;
        System.out.println("Area of Rhombus: "+area_rhombus);
    }
}
