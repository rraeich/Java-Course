
public class Match {

    Fighter f1,f2;
    int maxW,minW;

    Match(Fighter f1,Fighter f2, int maxW,int minW){

        this.f1 = f1;
        this.f2 = f2;
        this.maxW = maxW;
        this.minW = minW;
    }

    boolean check(){

        return (this.f1.weight <= maxW && this.f1.weight >= minW) && (this.f2.weight <= maxW && this.f2.weight >= minW);
    }

    void fight(){

        if (check()){

            System.out.println("------------------------------------------");
            System.out.println("Stats: ");
            System.out.println(f1.name + "/" + f1.health);
            System.out.println(f2.name + "/" + f2.health);
            System.out.println("------------------------------------------");

            if (fStart()){

                System.out.println(f2.name + " starting the match! ");
                while (this.f1.health >0 && this.f2.health > 0){

                    f1.hit(f2,f2.damage);
                    if (this.f1.health == 0){
                        System.out.println(f2.name + " won this match. Congratulations!");
                        break;
                    }

                    f2.hit(f1,f1.damage);
                    if (this.f2.health == 0){
                        System.out.println(f1.name + " won this match. Congratulations!");
                        break;
                    }
                }
            }

            else {

                System.out.println(f1.name + " starting the match! ");
                while (this.f1.health >0 && this.f2.health > 0){

                    f2.hit(f1,f1.damage);
                    if (this.f2.health == 0){
                        System.out.println(f1.name + " won this match. Congratulations!");
                        break;
                    }

                    f1.hit(f2,f2.damage);
                    if (this.f1.health == 0){
                        System.out.println(f2.name + " won this match. Congratulations!");
                        break;
                    }
                }
            }
        }

        else {
            System.out.println("Weights are not matching.");
        }
    }

    boolean fStart(){

        double r = Math.random() * 10;

        return (r < 5);
    }
}