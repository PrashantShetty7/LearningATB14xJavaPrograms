package Test;

/*Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.

        Examples:
Input:
Create student with name="Bob", rollNo=101, section="A"
Output:
Student: Bob, Roll No: 101, Section: A*/

class Student {
    String name;
    int rollNo;
    String section;

    Student(String name,int rollNo,String section)
    {
        this.name =name;
        this.rollNo= rollNo;
        this.section = section;

    }

    void dispaly()
    {
        System.out.println("Student: " +name+"\t rollNo: " +rollNo+"\tsection: " +section);

    }
}
public class SMS_Problem {

    public static void main(String[] args) {
        Student s = new Student("Bob", 101, "A");

        s.dispaly();
    }
}
