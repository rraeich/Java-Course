import java.util.Scanner;

public class JavaKurs{
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int oralhis,oralmat,oralphy;
        int examhis,exammat,examphy;

        System.out.println("Enter History exam note and oral note: ");
        examhis = inp.nextInt(); oralhis = inp.nextInt();

        System.out.println("Enter Math exam note and oral note: ");
        exammat = inp.nextInt(); oralmat = inp.nextInt();

        System.out.println("Enter Physic exam note and oral note: ");
        examphy = inp.nextInt(); oralphy = inp.nextInt();

        Course history = new Course("History");
        Teacher histc = new Teacher("Haluk","History");
        history.addTeacher(histc);

        Course math = new Course("Math");
        Teacher mathtc = new Teacher("Pelin","Math");
        math.addTeacher(mathtc);

        Course physic = new Course("Physic");
        Teacher phytc = new Teacher("Tuğba","Physic");
        physic.addTeacher(phytc);

        Student student = new Student("Poyraz","1803",history,math,physic);

        student.examnote(examhis,exammat,examphy);
        student.oralnote(oralhis,oralmat,oralphy);

        history.printTeacher();
        System.out.println();

        math.printTeacher();
        System.out.println();

        physic.printTeacher();
        System.out.println();

        student.printNote();

        student.isPass();
    }
}