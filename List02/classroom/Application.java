import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Class classroom = new Class();

        classroom.addStudent(new Student(2015032926, "Elton de Souza Vieira"));
        classroom.addStudent(new Student(2015036362, "Pedro Arthur Medeiros Fernandes"));
        classroom.addStudent(new Student(2015035848, "Johnnylee Bryan Marques da Rocha"));

        classroom.printStudents();
    }
}
