import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record Student(String id, int room) {
}

public class Prb1004 {

    private static final Scanner in = new Scanner(System.in);

    private static List<Student> students = new ArrayList<>();
    private static List<Student> studentInRow = new ArrayList<>();

    public static int findRoom(String id) {
        return students.stream()
                .filter(student -> student.id().equals(id))
                .findFirst()
                .map(Student::room)
                .orElse(0);
    }

    public static void insertStudent(Student newStudent) {
        int insertPosition = getInsertPosition(newStudent, -1);

        if (insertPosition == -1) {
            studentInRow.add(newStudent);
        } else {
            studentInRow.add(insertPosition, newStudent);
        }
    }

    private static int getInsertPosition(Student newStudent, int insertPosition) {
        for (int i = 0; i < studentInRow.size(); i++) {
            if (studentInRow.get(i).room() == newStudent.room()) {
                insertPosition = i + 1;
            }
        }
        return insertPosition;
    }

    private static void addStudentInRow(String id) {
        if (studentInRow.isEmpty()) {
            studentInRow.add(new Student(id, findRoom(id)));
        } else {
            insertStudent(new Student(id, findRoom(id)));
        }
    }

    private static void removeStudentInRow() {
        if (studentInRow.isEmpty()) {
            System.out.println("empty");
            return;
        }
        System.out.println(studentInRow.get(0).id());
        studentInRow.remove(0);
    }

    private static void terminateProcedure() {
        System.out.println("0");
    }

    private static void programming1004Plate() {
        char command;
        do {
            command = in.next().charAt(0);
            switch (command) {
                case 'E' -> addStudentInRow(in.next());
                case 'D' -> removeStudentInRow();
                case 'X' -> terminateProcedure();
            }
        } while (command != 'X');
    }

    public static void main(String[] args) {

        int nc = in.nextInt();
        int ns = in.nextInt();
        in.nextLine(); // Consume the newline character

        for (int i = 0; i < ns; i++) {
            int room = in.nextInt();
            String id = in.next();
            students.add(new Student(id, room));
        }

        programming1004Plate();
    }
}