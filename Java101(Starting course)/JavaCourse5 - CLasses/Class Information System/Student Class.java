public class Student {

    String sname,stuNo;

    double hisa,mata,phya,average;

    Course his; // his oral = 0.35 / his exam = 0.65
    Course mat; // mat oral = 0.25 / mat exam = 0.75
    Course phy; // phy oral = 0.4 / phy exam = 0.6

    boolean inPass;

    Student(String sname,String stuNo, Course his,Course mat, Course phy){

        this.sname = sname;
        this.stuNo = stuNo;
        this.his = his;
        this.mat = mat;
        this.phy = phy;

    }

    void examnote(int hisn,int matn,int phyn){

        if(hisn >= 0 && hisn <= 100){
            his.examNote = hisn;
        }

        if(matn >= 0 && matn <= 100){
            mat.examNote = matn;
        }

        if(phyn >= 0 && phyn <= 100){
            phy.examNote = phyn;
        }
    }

    void oralnote(int hisx,int matx, int phyx){

        if (hisx >= 0 && hisx <= 100){
            his.oralNote = hisx;
        }

        if (matx >= 0 && matx <= 100){
            mat.oralNote = matx;
        }

        if (phyx >= 0 && phyx <= 100){
            phy.oralNote = phyx;
        }
    }

    double calcAverage(){

        this.hisa = (this.his.examNote * 0.65) + (this.his.oralNote * 0.35);
        this.mata = (this.mat.examNote * 0.65) + (this.mat.oralNote * 0.35);
        this.phya = (this.phy.examNote * 0.65) + (this.phy.oralNote * 0.35);

        this.average = (hisa + mata + phya) / 3.0;

        return this.average;
    }

    void printNote(){

        System.out.println("\nMath oral note: " + this.mat.oralNote);
        System.out.println("Math exam note: " + this.mat.examNote);
        System.out.println("\nHistory oral note: " + this.his.oralNote);
        System.out.println("History exam note: " + this.his.examNote);
        System.out.println("\nPhysic oral note: " + this.phy.oralNote);
        System.out.println("Physic exam note: " + this.phy.examNote);
    }

    void isPass(){

        System.out.println("\n\n---------------------------------------------");
        System.out.println("Your average: " + calcAverage());

        if (this.average >= 55){
            System.out.println("You passed the class.");
        }

        else {
            System.out.println("You failed the class.");
        }

        System.out.print("---------------------------------------------");
    }
}
