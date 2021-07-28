import java.util.Scanner;

public class StrudentUse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        s1.Name = "Ankush";
        s1.RollNo = 001;

        Student s2 = new Student();
        s2.Name = "Amit";
        s2.RollNo = 001;
        System.out.println(s1.Name + " " + s1.RollNo);
        System.out.println(s2.Name + " " + s2.RollNo);
        // System.out.println(s1);
    }
}
