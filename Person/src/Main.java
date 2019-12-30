import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write here the main programpublic class Main 
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        boolean ask = true;
        while (ask) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if ("".equals(name)) {
                
                ask = false;
                break;
                
            }

            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();

            Student student = new Student(name, studentNumber);
            list.add(student);
            
        }
        

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("Give search term: ");
        String find = reader.nextLine();
        for (Student student : list) {
            
            if (student.getName().contains(find)) {
                System.out.println("Result: ");
                System.out.println(student);
                
                
            }
        }
    }
}