public class Array{
    public static void main(String[] args){

        Student[] students = new Student[3];

        // Initialize each element
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 21);
        students[2] = new Student("Charlie", 22);

        // Enhanced for loop to display each student's info
        for (Student s : students) {
            s.display();
        }


    }
}


class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}