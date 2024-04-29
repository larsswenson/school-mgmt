import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Department> departments;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}

class Student {
    private String name;
    private int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Department scienceDept = new Department("Science");
        Department mathDept = new Department("Mathematics");

        school.addDepartment(scienceDept);
        school.addDepartment(mathDept);

        Teacher mrSmith = new Teacher("Mr. Smith", "Biology");
        Teacher mrsJones = new Teacher("Mrs. Jones", "Chemistry");
        Teacher mrWhite = new Teacher("Mr. White", "Calculus");
        Teacher msBlack = new Teacher("Ms. Black", "Algebra");

        scienceDept.addTeacher(mrSmith);
        scienceDept.addTeacher(mrsJones);
        mathDept.addTeacher(mrWhite);
        mathDept.addTeacher(msBlack);

        Student johnDoe = new Student("John Doe", 10);
        Student janeDoe = new Student("Jane Doe", 12);
        Student jimBeam = new Student("Jim Beam", 11);
        Student timCook = new Student("Tim Cook", 10);
        Student annTaylor = new Student("Ann Taylor", 11);
        Student garyOak = new Student("Gary Oak", 12);

        scienceDept.addStudent(johnDoe);
        scienceDept.addStudent(janeDoe);
        scienceDept.addStudent(jimBeam);
        mathDept.addStudent(timCook);
        mathDept.addStudent(annTaylor);
        mathDept.addStudent(garyOak);

        System.out.println("School: " + school.getName());
        for (Department department : school.getDepartments()) {
            System.out.println("Department: " + department.getName());
            System.out.println("- Teachers:");
            for (Teacher teacher : department.getTeachers()) {
                System.out.println("  " + teacher.getName() + " (" + teacher.getSubject() + ")");
            }
            System.out.println("- Students:");
            for (Student student : department.getStudents()) {
                System.out.println("  " + student.getName() + " (Grade " + student.getGradeLevel() + ")");
            }
            System.out.println();
        }
    }
}




