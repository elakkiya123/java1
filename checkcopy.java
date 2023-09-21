class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        // Creating a Student object using the constructor
        Student originalStudent = new Student("Alice", 20);

        // Creating a copy of the Student object using the copy constructor
        Student copiedStudent = new Student(originalStudent);

        // Modifying the copied student
        copiedStudent.setName("Bob");
        copiedStudent.setAge(22);

        // Printing both the original and copied students
        System.out.println("Original Student: " + originalStudent);
        System.out.println("Copied Student: " + copiedStudent);
    }
}
