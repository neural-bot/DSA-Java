
import java.util.*;
public class inputDemo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int ID = sc.nextInt();
        float gpa = sc.nextFloat();

        System.out.println("inputed values are: "+name +" " +ID +" " +gpa);

        sc.close();
    }
}
