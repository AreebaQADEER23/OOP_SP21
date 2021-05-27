public class Circle implements Shape {
    private double radius;
   public Circle(double rad)
   {
       radius=rad;
   }
    public double area()
    {
        return radius * radius* 3.14;
    }
}
