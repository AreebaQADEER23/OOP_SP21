import java.util.ArrayList;

public class Lab12_Runner { public static void main(String[] args)
{
    Student s1 = new Student("Ayesha", "001");
    Student s2 = new Student("Areeba", "013");
    Student s3 = new Student("Amna", "002");

    Teacher t1 = new Teacher("Mukhtar Azeem", "1");
    Teacher t2 = new Teacher("Isma-ul-Hasan", "2");
    Teacher t3 = new Teacher("Aimal Khan", "3");

        /*HumanResource r1 = new HumanResource();
        r1.add(s1);
        r1.add(s2);
        r1.add(s3);13

        r1.add(t1);
        r1.add(t2);
        r1.add(t3);

        r1.delete(3);

        System.out.println(r1);*/

    ArrayList<Association> r2 = new ArrayList<>();

    r2.add(s1);
    r2.add(s2);
    r2.add(s3);
    r2.add(t1);
    r2.add(t2);
    r2.add(t3);
    r2.remove(1);
    System.out.println(r2);

}

}
