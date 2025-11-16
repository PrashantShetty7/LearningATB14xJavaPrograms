package Test;


/*Create a class "Person" with attributes "name" and "age". Create two instances and print their details.Create a class "Person" with attributes "name" and "age". Create two instances and print their details.

Create Person objects with names "John" (25) and "Alice" (30)
*/

class Person
{
    String name;
    int age;


    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name + ",Age: " +age);
    }
}

public class Problem1{
    public static void main(String[] args){
        Person p1= new Person("John",25);
        Person p2= new Person("Alice",38);

        p1.display();
        p2.display();


    }
}