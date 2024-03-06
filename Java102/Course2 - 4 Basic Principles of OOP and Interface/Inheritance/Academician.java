
public class Academician extends Worker{

    private String section;
    private String degree;

    public Academician(String nameSurname, String phoneNumber, String eMail, String section, String degree) {
        super(nameSurname, phoneNumber, eMail);
        this.section = section;
        this.degree = degree;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void enterLesson(){
        System.out.println(this.getNameSurname() + " entered the class.");
    }
}
