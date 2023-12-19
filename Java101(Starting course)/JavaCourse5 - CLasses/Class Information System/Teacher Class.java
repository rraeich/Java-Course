
public class Teacher {

    String name,branch;

    Teacher(String name, String branch){
        this.name = name;
        this.branch = branch;
    }

    void tcp(){
        System.out.println("Teacher's Name: " + this.name);
        System.out.println("Teacher's branch: " + this.branch);
    }
}