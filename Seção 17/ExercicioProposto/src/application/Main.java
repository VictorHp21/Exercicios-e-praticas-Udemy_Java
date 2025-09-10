package application;

import entities.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Set<Student> students = new HashSet<>();

        List<Student> cursoA = new ArrayList<>();
        List<Student> cursoB = new ArrayList<>();
        List<Student> cursoC = new ArrayList<>();

        System.out.println("How many students for course A? ");
        int optionA = s.nextInt();
            for (int i = 0; i < optionA; i++) {
                System.out.println("Enter student code: ");
                int code = s.nextInt();

                students.add(new Student(code));

                cursoA.add(new Student(code));
            }
        System.out.println("How many students for course B? ");
        int optionB = s.nextInt();
            for (int i = 0; i < optionB; i++) {
                System.out.println("Enter student code: ");
                int code = s.nextInt();
                students.add(new Student(code));

                cursoB.add(new Student(code));
            }

        System.out.println("How many students for course C? ");
        int optionC = s.nextInt();

            for (int i = 0; i < optionC; i++) {
                System.out.println("Enter student code: ");
                int code = s.nextInt();
                students.add(new Student(code));

                cursoC.add(new Student(code));
            }

        System.out.println("Total students: " + students.size());


        System.out.println("Students of course A: " + cursoA);
        System.out.println("Students of course B: " + cursoB);
        System.out.println("Students of course C: " + cursoC);





        s.close();
    }
}
