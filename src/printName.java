import java.util.Scanner;

public class printName {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();

        printMyName(Name);
        sc.close();
        
    }
}
