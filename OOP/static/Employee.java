
public class Employee {
    int empid;
    String name;
    static String company = "Google";

    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    void display() {
        System.out.println(empid + " " + name + " " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Siddhesh");
        Employee e2 = new Employee(102, "Sarvesh");
        e1.display();
        e2.display();
    }
}
