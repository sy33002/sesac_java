package _05_class._abstract;

public abstract class Student {
    String name;
    String school;
    int age;
    int studentId;

    public Student(String name, String school, int age, int studentId) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    abstract void todo();
}
