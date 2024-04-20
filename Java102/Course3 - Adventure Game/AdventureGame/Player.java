package AdventureGame;

import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);

    private String name;
    private String type;
    private short playerID;
    private int damage;
    private int health;
    private int maxHealth;
    private int money;
    private int howManyKill;
    private Inventory inventory;
    private String[] equipments = new String[10]; // bow, sword, crossbow, hammer, lightArmor, mediumArmor, heavyArmor, healthPotion, weaknessPotion, powerPotion
    private String[] showEquipments = new String[10];
    private String[] wearEquipments = new String[2]; // gun,armor

    public Player(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getPlayerID() {
        return this.playerID;
    }

    public void setPlayerID(short playerID) {
        this.playerID = playerID;
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

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String[] getEquipments() {
        return this.equipments;
    }

    public void setEquipments(String[] equipments) {
        this.equipments = equipments;
    }

    public String[] getShowEquipments() {
        return this.showEquipments;
    }

    public void setShowEquipments(String[] showEquipments) {
        this.showEquipments = showEquipments;
    }

    public String[] getWearEquipments() {
        return this.wearEquipments;
    }

    public void setWearEquipments(String[] wearEquipments) {
        this.wearEquipments = wearEquipments;
    }

    public int getHowManyKill() {
        return this.howManyKill;
    }

    public void setHowManyKill(int howManyKill) {
        this.howManyKill = howManyKill;
    }

    public void infoChar() {
        System.out.println("Your characters stats:");
        System.out.println("Char type: " + this.type);
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage);
        System.out.println("Money: " + this.money);
    }

    public void selectCharacter() {

        System.out.print("First, enter your character's name: ");
        this.name = input.nextLine();

        System.out.println("\n\n<<------------------------------------------------------>>");
        System.out.println(" 1- Samurai / Health: 47 / Damage: 5 / Money: 29");
        System.out.println(" 2- Archer / Health: 38 / Damage: 7 / Money: 17");
        System.out.println(" 3- Knight / Health: 60 / Damage: 8 / Money: 0");
        System.out.println(" 4- Viking / Health: 51 / Damage: 9 / Money: 4");
        System.out.println("<<------------------------------------------------------>>");
        this.howManyKill = 0;
        choosingCharacter:
        while (true){
            System.out.println("Choose your character type from ID(1,2,3,4): ");
            short id = input.nextShort();

            switch (id) {
                case 1:
                    this.type = "Samurai";
                    this.playerID = 1;
                    this.money = 29;
                    this.health = 1000;
                    this.maxHealth = this.health;
                    this.damage = 100;
                    for (int i = 0; i < 10; i++) {
                        this.equipments[i] = "null";
                    }
                    for (int i = 0; i < 2; i++) {
                        this.wearEquipments[i] = "null";
                    }
                    for (int i=0; i < 10; i++){
                        this.showEquipments[i] = "null";
                    }
                    break choosingCharacter;

                case 2:
                    this.type = "Archer";
                    this.playerID = 2;
                    this.money = 17;
                    this.health = 38;
                    this.maxHealth = this.health;
                    this.damage = 7;
                    for (int i = 0; i < 10; i++) {
                        this.equipments[i] = "null";
                    }
                    for (int i = 0; i < 2; i++) {
                        this.wearEquipments[i] = "null";
                    }
                    for (int i=0; i < 10; i++){
                        this.showEquipments[i] = "null";
                    }
                    break choosingCharacter;

                case 3:
                    this.type = "Knight";
                    this.playerID = 3;
                    this.money = 0;
                    this.health = 60;
                    this.maxHealth = this.health;
                    this.damage = 8;
                    for (int i = 0; i < 10; i++) {
                        this.equipments[i] = "null";
                    }
                    for (int i = 0; i < 2; i++) {
                        this.wearEquipments[i] = "null";
                    }
                    for (int i=0; i < 10; i++){
                        this.showEquipments[i] = "null";
                    }
                    break choosingCharacter;

                case 4:
                    this.type = "Viking";
                    this.playerID = 4;
                    this.money = 4;
                    this.health = 51;
                    this.maxHealth = this.health;
                    this.damage = 9;
                    for (int i = 0; i < 10; i++) {
                        this.equipments[i] = "null";
                    }
                    for (int i = 0; i < 2; i++) {
                        this.wearEquipments[i] = "null";
                    }
                    for (int i=0; i < 10; i++){
                        this.showEquipments[i] = "null";
                    }
                    break choosingCharacter;
                default:
                    System.out.println("You have to choose a character. Try again.");
                    break;
            }
        }
    }
}
