
public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int health,int damage,int weight,int dodge){

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge = dodge;
    }

    void hit(Fighter of,int damage){

        double random = (Math.random()*100);
        System.out.println("------------------------------------------");
        if (random <= this.dodge){
            System.out.println(of.name + " " + damage +"=> "+ this.name);
            System.out.println("No! " + this.name + " dodged " + of.name + "'s attack.");
            System.out.println(this.name + " still have " + this.health + " health point.");
        }

        if (random > this.dodge){

            System.out.println(of.name + " " + damage +"=> "+ this.name);
            this.health = this.health - damage;

            if (this.health < 0){
                this.health = 0;
            }

            System.out.println(this.name + "'s new health: " + this.health);
            System.out.println(of.name + "'s health: " + of.health);
        }
        
        System.out.println("------------------------------------------");
        System.out.println("\n");
    }
}