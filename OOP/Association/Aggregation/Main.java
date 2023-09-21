
class Employee {
    int id;
    String name;
    String dept;

    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        System.out.println("\nEmployee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee dept is : " + dept);
    }
}

class Department {
    String deptName;
    int noOfEmployees;

    Department(String name, int noOfEmployees) {
        this.deptName = name;
        this.noOfEmployees = noOfEmployees;
    }
}

class University {
    String universityName;
    int noOfDepartments;

    University(String name, int noOfDept) {
        this.universityName = name;
        this.noOfDepartments = noOfDept;
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Siddhesh", "Engineering");
        Employee e2 = new Employee(102, "Sarvesh", "Management");
        Employee e3 = new Employee(103, "Varad", "Arts");
    }
}
