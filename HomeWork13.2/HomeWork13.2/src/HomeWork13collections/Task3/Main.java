package HomeWork13collections.Task3;

import java.util.*;

public class Main {
    private static HashMap<Student, Object> hashMapVar;
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int operation = 0;
            System.out.println("menu:\n 1)add student\n 2)change student course/delete student\n 3) View list of students\n 4) exit");

            while (true) {
                try {
                    operation = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("enter number");
                    sc.next();
                }
            }

            switch (operation) {
                case 1 -> add();
                case 2 -> delete();
                case 3 -> {
                    System.out.println("enter course: ");
                    int course = sc.nextInt();
                    Student.printStudents(students, course);
                }
                case 4 ->{return;}
            }
        }
    }


    public static void add() {
        Student student;
        Scanner sc = new Scanner(System.in);
        String name;
        int group;
        int course;
        int operation;
        Map<String, Integer> subject = new HashMap<>();
        String subjectt;
        int mark;

        while (true) {
            System.out.print("name: ");
            name = sc.next();

            System.out.print("group: ");
            group = choice();

            System.out.print("course: ");
            while (true) {
                course = choice();
                if (course < 6 && course > 0)
                    break;
            }

            System.out.println("Enter grades in four disciplines");
            double average = 0;
            for (int i = 0; i < 4; i++) {
                System.out.print("disciplines: ");
                subjectt = sc.next();

                while (true) {
                    mark = choice();
                    if (mark > -1 && mark < 11){
                        average += mark;
                        break;
                    }
                }
                average/=4;
            }
            student = new Student(name, group, course, average);
            students.add(student);

            System.out.println("next?\n 1) Y\n 2)N");
            operation = choice();
            if(operation ==2)
                return;
        }
    }

    public static void delete(){
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getAverage() < 3)
                students.remove(students.get(i));
            else
                students.get(i).setCourse((students.get(i).getCourse() +1));
        }
        System.out.println("The operation was completed successfully!)");
    }

    public static int choice(){
        Scanner sc= new Scanner(System.in);
        int operation;
        while(true){
            System.out.println("Next?\n 1) Y\n 2)N");
            try{
                operation = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("enter number");
                sc.next();
            }
        }
        return operation;
    }
}
