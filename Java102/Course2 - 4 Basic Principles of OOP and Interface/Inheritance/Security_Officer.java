
public class Security_Officer extends Officer{

    private String document;

    public Security_Officer(String nameSurname, String phoneNumber, String eMail, String department, String hours, String document) {
        super(nameSurname, phoneNumber, eMail, department, hours);
        this.document = document;
    }

    public String getdocument(){
        return this.document;
    }

    public void setdocument(){
        this.document = document;
    }

    public void guardDuty(){
        System.out.println(this.getNameSurname() + " Haluk is on evening duty.");
    }
}
