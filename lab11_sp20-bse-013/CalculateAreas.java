public class CalculateAreas {
    double[] areaOfObjects(Object[] arr)
    {
        double[] arr1 = new double[arr.length];
        for (int i =0;i < arr.length;i++)
        {
            if (arr[i] instanceof Rectangle)
                arr1[i] = (((Rectangle) arr[i]).area());
            else if (arr[i] instanceof  Triangle)
                arr1[i]= (((Triangle) arr[i]).area());
            else if (arr[i] instanceof  Circle)
                arr1[i]= (((Circle) arr[i]).area());
        }
        return arr1;
    }

}
