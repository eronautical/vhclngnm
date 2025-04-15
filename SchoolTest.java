public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 16, "10th Grade");
        Teacher teacher = new Teacher("Ms. Smith", "Mathematics", 5);
        Staff staff = new Staff("Mr. Brown", "Janitor", 10);

        student.displayInfo();
        teacher.displayInfo();
        staff.displayInfo();
    }
}

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public void displayInfo() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject + ", Experience: " + experience + " years");
    }
}

class Staff {
    private String name;
    private String role;
    private int yearsOfService;

    public Staff(String name, String role, int yearsOfService) {
        this.name = name;
        this.role = role;
        this.yearsOfService = yearsOfService;
    }

    public void displayInfo() {
        System.out.println("Staff Name: " + name + ", Role: " + role + ", Years of Service: " + yearsOfService);
    }
}