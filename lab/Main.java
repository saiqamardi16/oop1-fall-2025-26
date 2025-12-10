package lab;
class Contact{
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

class Student {
    private String name;
    private Contact contact;  // Student HAS-A Contact

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }
}

class School {
    private String schoolName;
    private Student[] students;  // School HAS-MANY Students
    private int studentCount = 0;

    public School(String schoolName, int capacity) {
        this.schoolName = schoolName;
        this.students = new Student[capacity];
    }

    public void addStudent(Student s) {
        if (studentCount < students.length) {
            students[studentCount++] = s;
        } else {
            System.out.println("No more space for new students!");
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students List:");
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            System.out.println(
                s.getName() + "Phone: " +
                s.getContact().getPhone() +
                "Email: " + s.getContact().getEmail()
            );
        }
    }
}
public class Main {
    public static void main(String[] args) {

        // Create School (capacity = 3)
        School school = new School("Green Valley School", 3);

        // Student 1
        Contact c1 = new Contact("01711-123456", "rahim@gmail.com");
        Student s1 = new Student("Rahim", c1);

        // Student 2
        Contact c2 = new Contact("01822-987654", "karim@yahoo.com");
        Student s2 = new Student("Karim", c2);

        // Add Students
        school.addStudent(s1);
        school.addStudent(s2);

        // Show Student List
        school.showStudents();
    }
}


    

