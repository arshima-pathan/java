import java.util.*;
class Student
{
     String name;
    int age;
    char gender;
   Student() 
    {
        name = "Unknown";
        age = 0;
        gender = 'F';
    }
   Student(String nm, int ag, char gn)
    {
        name = nm;
        age = ag;
        gender = gn;
    }
      void show()
      {
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Gender       : " + gender);
      }
}
public class StudDemo
{
        public static void main(String[] args)
        {
        Student s1 = new Student();
        Student s2 = new Student("Arshima", 20, 'F');
        System.out.println("Default Constructor Output:");
        s1.show();
        System.out.println("Parameterized Constructor Output:");
        s2.show();
        }
}    



