package AdventureGame;

public abstract class Monsters {

    private String name;
    private int damage;
    private int health;
    private int money;

    public Monsters(String name, int damage, int health, int money) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void monsterInfoSnake(){
        System.out.println("Your enemy is " + this.name + ".");
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage + "-" + (this.damage + 2));
        System.out.println("Prize money: " + this.money + "€");
        System.out.println();
    }

    public void monsterInfo(){
        System.out.println("Your enemy is " + this.name + ".");
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage);
        System.out.println("Prize money: " + this.money + "€");
        System.out.println();
    }
}
