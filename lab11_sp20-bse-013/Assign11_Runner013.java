import java.util.Arrays;

public class Assign11_Runner013 {
    public static void main(String[] args)
    {
        Object[] o = new Object[5];
        o[0] = new Rectangle(3, 4);
        o[1] = new Triangle(6 ,8);
        o[3] = new Circle(6);
        o[4] = new Triangle(4 ,5);
        CalculateAreas cal = new CalculateAreas();
        double[] area = cal.areaOfObjects(o);
        System.out.println(Arrays.toString(cal.areaOfObjects(o)));

    }
}
