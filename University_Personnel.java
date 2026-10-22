class UniversityPersonnel {
    String name;
    int age;
    String gender;

    UniversityPersonnel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends UniversityPersonnel {
    String degreeProgram;
    double cgpa;
    int semester;

    Student(String name, int age, String gender,
            String degreeProgram, double cgpa, int semester) {
        super(name, age, gender);
        this.degreeProgram = degreeProgram;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    void displayStudentInfo() {
        super.displayInfo();
        System.out.println("Degree Program: " + degreeProgram);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Semester: " + semester);
    }
}

class Teacher extends UniversityPersonnel {
    String designation;
    double salary;
    String department;

    Teacher(String name, int age, String gender,
            String designation, double salary, String department) {
        super(name, age, gender);
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    void displayTeacherInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
                "ALI", 20, "Male", "CS", 3.8, 4
        );

        System.out.println("===== STUDENT INFORMATION =====");
        student.displayStudentInfo();

        System.out.println();

        Teacher teacher = new Teacher(
                "Dr Iqbal", 42, "Male",
                "Professor", 150000, "CS"
        );

        System.out.println("===== TEACHER INFORMATION =====");
        teacher.displayTeacherInfo();
    }
}
