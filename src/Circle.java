public class Circle {
    public static final double PI = 3.14;
    double radius;


    public static void area(double radius){
        System.out.println("Area of the circle = " + PI*(radius*radius));
    }
    public static void circumference(double radius){
        System.out.println("Circumference of the circle = " + PI*( radius * 2));
    }



}
