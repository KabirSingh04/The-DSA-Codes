public class Studentuse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        s1.Name = "Ankush";
        s1.setRollnumber(001);

        Student s2 = new Student();
        s2.Name = "Amit";
        s2.setRollnumber(002);
        System.out.println(s1.Name + " " + s1.getRollnumber());
        System.out.println(s2.Name + " " + s2.getRollnumber());
    }
}
