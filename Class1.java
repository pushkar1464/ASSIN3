import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Student st = new Student();
        
        st.getdata();
        st.display();
    }
}

class Student extends Marks {
    String name;
    int id;
    
    int number;
    Scanner sc = new Scanner(System.in);
    
    
    public void getdata() {
    	System.out.println("Enter the number of students: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("the ID of student is " + (i + 1) + ":");
            id = i;

            System.out.println("Enter the name of student " + (i + 1) + ":");
            name = sc.next();

            // Calling the marks
            physics();
            chemistry();
            math();
        }
        
    }

    public void display() {
        System.out.println("ID : " + id + "\t\tName: " + name);
        System.out.println("Physics marks: " + p);
        System.out.println("Chemistry marks: " + c);
        System.out.println("Math marks: " + m);
        
        
        sc.close();
    }
    
}

class Marks {
    int p = 0;
    int c = 0;
    int m = 0;
    int result;
    Scanner sc = new Scanner(System.in);

    public void physics() {
        System.out.println("Enter the marks of physics:");
        int physics = sc.nextInt();
        p += physics;
    }

    public void chemistry() {
        System.out.println("Enter the marks of chemistry:");
        int chemistry = sc.nextInt();
        c += chemistry;
    }

    public void math() {
        System.out.println("Enter the marks of math:");
        int math = sc.nextInt();
        m += math;
    }
    
    public void average()
    {
    	System.out.println("The average of the marks of the phy are");
        result = p / 3;
        System.out.println("The average of the marks of the che is");
        result = c / 3;
        System.out.println("The average of the marks of the math is");
        result = m / 3;
}
}