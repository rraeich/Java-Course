
public class Course {

    String lesson;
    Teacher teacher;
    int oralNote,examNote;

    Course(String lesson)
    {
        this.lesson = lesson;
        oralNote = 0;
        examNote = 0;
    }

    void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    void printTeacher(){
        this.teacher.tcp();
    }
}