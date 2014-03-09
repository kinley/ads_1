import java.util.Scanner;

public class tp_proj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter data for two sessions:");

        // String TeacherName, int GroupNumber, String SubjectAndTime, String Location
        EducationSession session1 = new EducationSession(sc.next(), sc.nextInt(), sc.next(), sc.next());
        EducationSession session2 = new EducationSession(sc.next(), sc.nextInt(), sc.next(), sc.next());

        // если эти два занятия совместимы, то «Объединить» их
        // иначе заменить преподавателя Занятия1
        if (!session1.merge(session2)) {
            System.out.println("Please enter teacher's name:");
            session1.changeTeacher(sc.next());
        }

        System.out.println("Please enter subject&time and location: ");

        // session2.TeacherName, session1.GroupNumber, String SubjectAndTime, String Location
        EducationSession session3 = session1.createNewSession(session2.getTeacherName(), sc.next(), sc.next());
    }
}