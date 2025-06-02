package studentdata;

import java.util.ArrayList;

public class CSC372CriticalThinking6Option1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "Alice", "New York"));
        students.add(new Student(2, "Charlie", "California"));
        students.add(new Student(5, "Bob", "Texas"));
        students.add(new Student(8, "Eve", "Florida"));
        students.add(new Student(1, "Dave", "Nevada"));
        students.add(new Student(7, "Frank", "Arizona"));
        students.add(new Student(3, "Grace", "Oregon"));
        students.add(new Student(6, "Heidi", "Colorado"));
        students.add(new Student(4, "Ivan", "Utah"));
        students.add(new Student(9, "Judy", "Washington"));

        System.out.println("Original List:");
        printStudents(students);

        // Sort by name
        SelectionSorter.selectionSort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        printStudents(students);

        // Sort by roll number
        SelectionSorter.selectionSort(students, new SortByRollNo());
        System.out.println("\nSorted by Roll Number:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
