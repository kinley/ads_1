public class EducationSession {
    private String TeacherName;
    private int GroupNumber;
    private String SubjectAndTime;
    private String Location;

    // Конструктор
    public EducationSession(String TeacherName, int GroupNumber, String SubjectAndTime, String Location) {
        this.TeacherName = TeacherName;
        this.GroupNumber = GroupNumber;
        this.SubjectAndTime = SubjectAndTime;
        this.Location = Location;
    }

    // Получить преподавателя
    public String getTeacherName() {
        return TeacherName;
    }

    // Проверить совместимость двух занятий
    public boolean isCompatible(EducationSession es) {
        return SubjectAndTime.equals(es.SubjectAndTime);
    }

    // Объединить два совместимых занятия
    public boolean merge(EducationSession es) {
        if (this.isCompatible(es)) {
            System.out.println("Sessions are equal! Merging...");
            TeacherName = es.TeacherName;
            Location = es.Location;
            return true;
        }
        else {
            System.out.println("Sessions are not equal! Can't merge this sessions!");
            return false;
        }
    }

    // Заменить преподавателя
    public void changeTeacher(String TeacherName) {
        this.TeacherName = TeacherName;
    }

    // Создать новое занятие в группе имеющегося занятия
    public EducationSession createNewSession(String TeacherName, String SubjectAndTime, String Location) {
        return new EducationSession(TeacherName, this.GroupNumber, SubjectAndTime, Location);
    }
}