
public class JavaKurs{
    public static void main(String[] args){

        Fighter f1 = new Fighter("Haluk",1752,167, 84,17);
        Fighter f2 = new Fighter("Saffet",2893,97, 87,13);

        Match ring = new Match(f1,f2,90,80);

        ring.fight();
    }
}