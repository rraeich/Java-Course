package AdventureGame;

import java.util.Random;

public abstract class BattleLocations extends Location {

    private Monsters monster;
    Random random = new Random();

    public BattleLocations(Player player, Monsters monster) {
        super(player);
        this.monster = monster;
    }

    public void enterBattleLocation() {

    }

    public Monsters getMonster() {
        return this.monster;
    }

    public void setMonster(Monsters monster) {
        this.monster = monster;
    }

    public void beatEnemyMine(int monsterCounter) {
        int continueFight;
        System.out.println("Nice! You beat " + monsterCounter + ". " + getMonster().getName());
        System.out.println("You won " + getMonster().getMoney() + "€.");
        getPlayer().setHowManyKill(getPlayer().getHowManyKill() + 1);
        getPlayer().setMoney(getPlayer().getMoney() + getMonster().getMoney());
        System.out.println();

        int awardDropChance = random.nextInt(1, 1138);
        int gunDropChance = random.nextInt(1, 100);
        int armorDropChance = random.nextInt(1, 100);
        int moneyDropChance = random.nextInt(1, 100);

        if ((awardDropChance <= 125) && awardDropChance != 17) {
            if (gunDropChance <= 30) {

                if (getPlayer().getEquipments()[2].equals("crossbow")) {
                    System.out.println("You dropped Wooden Light crossbow but you already have.");
                    System.out.println("You sold the bow in the dwarf shop.");
                    System.out.println("So, you earned " + 6 + "€ as the crossbow.");
                    getPlayer().setMoney(getPlayer().getMoney() + 6);
                } else if (!getPlayer().getEquipments()[2].equals("crossbow")) {
                    System.out.println("Lucky!, You dropped Wooden Light crossbow.");
                    System.out.println("Wooden Light crossbow added to inventory.");
                    getPlayer().getEquipments()[2] = "crossbow";
                    getPlayer().getShowEquipments()[2] = "Wooden Light crossbow";
                }

            } else if (gunDropChance <= 55) {
                if (getPlayer().getEquipments()[0].equals("bow")) {
                    System.out.println("You dropped Elf's bow but you already have.");
                    System.out.println("You sold the bow in the dwarf shop.");
                    System.out.println("So, you earned " + 8 + "€ as the bow.");
                    getPlayer().setMoney(getPlayer().getMoney() + 8);
                } else if (!getPlayer().getEquipments()[0].equals("bow")) {
                    System.out.println("Lucky!, You dropped Elf's bow.");
                    System.out.println("Elf's bow added to inventory.");
                    getPlayer().getEquipments()[0] = "bow";
                    getPlayer().getShowEquipments()[0] = "Elf's Bow";
                }

            } else if (gunDropChance <= 79) {

                if (getPlayer().getEquipments()[1].equals("sword")) {
                    System.out.println("You dropped Ruby sword but you already have.");
                    System.out.println("You sold the sword in the dwarf shop.");
                    System.out.println("So, you earned " + 14 + "€ as the sword.");
                    getPlayer().setMoney(getPlayer().getMoney() + 14);
                } else if (!getPlayer().getEquipments()[1].equals("sword")) {
                    System.out.println("Lucky!, You dropped Ruby sword.");
                    System.out.println("Ruby sword added to inventory.");
                    getPlayer().getEquipments()[1] = "sword";
                    getPlayer().getShowEquipments()[1] = "Ruby sword";
                }

            } else if (gunDropChance <= 100) {

                if (getPlayer().getEquipments()[3].equals("hammer")) {
                    System.out.println("You dropped Infinity Hammer but you already have.");
                    System.out.println("You sold the hammer in the dwarf shop.");
                    System.out.println("So, you earned " + 21 + "€ as the hammer.");
                    getPlayer().setMoney(getPlayer().getMoney() + 21);
                } else if (!getPlayer().getEquipments()[3].equals("hammer")) {
                    System.out.println("Lucky!, You dropped Infinity Hammer.");
                    System.out.println("Infinity Hammer added to inventory.");
                    getPlayer().getEquipments()[3] = "hammer";
                    getPlayer().getShowEquipments()[3] = "Infinity Hammer";
                }
            }
        }

        if ((awardDropChance > 125 && awardDropChance <= 311) && awardDropChance != 142) {
            if (armorDropChance <= 58) {
                if (getPlayer().getEquipments()[4].equals("lightArmor")) {
                    System.out.println("You dropped Light Armor but you already have.");
                    System.out.println("You sold the armor in the dwarf shop.");
                    System.out.println("So, you earned " + 7 + "€ as the armor.");
                    getPlayer().setMoney(getPlayer().getMoney() + 7);
                } else if (!getPlayer().getEquipments()[4].equals("lightArmor")) {
                    System.out.println("Lucky!, You dropped Light Armor.");
                    System.out.println("Light Armor added to inventory.");
                    getPlayer().getEquipments()[4] = "lightArmor";
                    getPlayer().getShowEquipments()[4] = "Light Armor";
                }
            } else if (armorDropChance <= 80) {
                if (getPlayer().getEquipments()[5].equals("mediumArmor")) {
                    System.out.println("You dropped Medium Armor but you already have.");
                    System.out.println("You sold the armor in the dwarf shop.");
                    System.out.println("So, you earned " + 13 + "€ as the armor.");
                    getPlayer().setMoney(getPlayer().getMoney() + 13);
                } else if (!getPlayer().getEquipments()[5].equals("mediumArmor")) {
                    System.out.println("Lucky!, You dropped Medium Armor.");
                    System.out.println("Medium Armor added to inventory.");
                    getPlayer().getEquipments()[5] = "mediumArmor";
                    getPlayer().getShowEquipments()[5] = "Medium Armor";
                }
            } else if (armorDropChance <= 100) {
                if (getPlayer().getEquipments()[6].equals("heavyArmor")) {
                    System.out.println("You dropped Heavy Armor but you already have.");
                    System.out.println("You sold the armor in the dwarf shop.");
                    System.out.println("So, you earned " + 20 + "€ as the armor.");
                    getPlayer().setMoney(getPlayer().getMoney() + 20);
                } else if (!getPlayer().getEquipments()[6].equals("heavyArmor")) {
                    System.out.println("Lucky!, You dropped Heavy Armor.");
                    System.out.println("Heavy Armor added to inventory.");
                    getPlayer().getEquipments()[6] = "heavyArmor";
                    getPlayer().getShowEquipments()[6] = "Heavy Armor";
                }
            }
        }

        if (awardDropChance > 311 && awardDropChance <= 687) {
            if (moneyDropChance <= 40) {
                System.out.println("Lucky! You dropped bag of gold.");
                System.out.println("You earned 10€.");
                getPlayer().setMoney(getPlayer().getMoney() + 10);
            } else if (moneyDropChance <= 66) {
                System.out.println("Lucky! You dropped a box of gold.");
                System.out.println("You earned 25€.");
                getPlayer().setMoney(getPlayer().getMoney() + 25);
            } else if (moneyDropChance <= 87) {
                System.out.println("Lucky! You dropped a sack of gold.");
                System.out.println("You earned 45€.");
                getPlayer().setMoney(getPlayer().getMoney() + 45);
            } else if (moneyDropChance <= 100) {
                System.out.println("LUCKY! You dropped a chest full of gold.");
                System.out.println("You earned 60€.");
                getPlayer().setMoney(getPlayer().getMoney() + 60);
            }
        }

        if ((awardDropChance > 687 && awardDropChance <= 1137) && awardDropChance != 911) {
            System.out.println("Unfortunately, you didn't get the drop from the monster.");
        }

        if ((awardDropChance == 911 && !getPlayer().getInventory().isGodGrace()) || (awardDropChance == 142 && !getPlayer().getInventory().isGodGrace()) || (awardDropChance == 17 && !getPlayer().getInventory().isGodGrace())) {
            System.out.println("<><><><><><><><><><>|||||||**************|||||||<><><><><><><><><><>");
            System.out.println("SOOOO LUCKY!! You won ~~GOD'S GRACE~~ with %0,0879 CHANCE!!");
            System.out.println("GOD'S GRACE can only be achieved with this chance and this way.");
            System.out.println("Return to the safe house to obtain GOD'S GRACE.");
            System.out.println("<><><><><><><><><><>|||||||**************|||||||<><><><><><><><><><>");
            getPlayer().getInventory().setGodGrace(true);
        }

        System.out.println();
        System.out.print("Type any number to keep going:");
        continueFight = input.nextInt();
        System.out.println();
        System.out.println();
    }

    public void beatEnemy(int monsterCounter) {
        int continueFight;
        System.out.println("Nice! You beat " + monsterCounter + ". " + getMonster().getName());
        System.out.println("You won " + getMonster().getMoney() + "€.");
        getPlayer().setHowManyKill(getPlayer().getHowManyKill() + 1);
        getPlayer().setMoney(getPlayer().getMoney() + getMonster().getMoney());
        System.out.println();

        int awardDropChance = random.nextInt(1, 1138);
        int gunDropChance = random.nextInt(1, 100);
        int armorDropChance = random.nextInt(1, 100);
        int moneyDropChance = random.nextInt(1, 100);

        if (awardDropChance <= 75) {
            if (gunDropChance <= 47) {

                if (getPlayer().getEquipments()[2].equals("crossbow")) {
                    System.out.println("You dropped Wooden Light crossbow but you already have.");
                    System.out.println("You sold the bow in the dwarf shop.");
                    System.out.println("So, you earned " + 6 + "€ as the crossbow.");
                    getPlayer().setMoney(getPlayer().getMoney() + 6);
                } else if (!getPlayer().getEquipments()[2].equals("crossbow")) {
                    System.out.println("Lucky!, You dropped Wooden Light crossbow.");
                    System.out.println("Wooden Light crossbow added to inventory.");
                    getPlayer().getEquipments()[2] = "crossbow";
                    getPlayer().getShowEquipments()[2] = "Wooden Light crossbow";
                }

            } else if (gunDropChance <= 70) {
                if (getPlayer().getEquipments()[0].equals("bow")) {
                    System.out.println("You dropped Elf's bow but you already have.");
                    System.out.println("You sold the bow in the dwarf shop.");
                    System.out.println("So, you earned " + 8 + "€ as the bow.");
                    getPlayer().setMoney(getPlayer().getMoney() + 8);
                } else if (!getPlayer().getEquipments()[0].equals("bow")) {
                    System.out.println("Lucky!, You dropped Elf's bow.");
                    System.out.println("Elf's bow added to inventory.");
                    getPlayer().getEquipments()[0] = "bow";
                    getPlayer().getShowEquipments()[0] = "Elf's Bow";
                }

            } else if (gunDropChance <= 88) {

                if (getPlayer().getEquipments()[1].equals("sword")) {
                    System.out.println("You dropped Ruby sword but you already have.");
                    System.out.println("You sold the sword in the dwarf shop.");
                    System.out.println("So, you earned " + 14 + "€ as the sword.");
                    getPlayer().setMoney(getPlayer().getMoney() + 14);
                } else if (!getPlayer().getEquipments()[1].equals("sword")) {
                    System.out.println("Lucky!, You dropped Ruby sword.");
                    System.out.println("Ruby sword added to inventory.");
                    getPlayer().getEquipments()[1] = "sword";
                    getPlayer().getShowEquipments()[1] = "Ruby sword";
                }

            } else if (gunDropChance <= 100) {

                if (getPlayer().getEquipments()[3].equals("hammer")) {
                    System.out.println("You dropped Infinity Hammer but you already have.");
                    System.out.println("You sold the hammer in the dwarf shop.");
                    System.out.println("So, you earned " + 21 + "€ as the hammer.");
                    getPlayer().setMoney(getPlayer().getMoney() + 21);
                } else if (!getPlayer().getEquipments()[3].equals("hammer")) {
                    System.out.println("Lucky!, You dropped Infinity Hammer.");
                    System.out.println("Infinity Hammer added to inventory.");
                    getPlayer().getEquipments()[3] = "hammer";
                    getPlayer().getShowEquipments()[3] = "Infinity Hammer";
                }
            }
        }

        if (awardDropChance > 75 && awardDropChance <= 197) {
            if (armorDropChance <= 66) {
                if (getPlayer().getEquipments()[4].equals("lightArmor")) {
                    System.out.println("You dropped Light Armor but you already have.");
                    System.out.println("You sold the armor in the dwarf shop.");
                    System.out.println("So, you earned " + 7 + "€ as the armor.");
                    getPlayer().setMoney(getPlayer().getMoney() + 7);
                } else if (!getPlayer().getEquipments()[4].equals("lightArmor")) {
                    System.out.println("Lucky!, You dropped Light Armor.");
                    System.out.println("Light Armor added to inventory.");
                    getPlayer().getEquipments()[4] = "lightArmor";
                    getPlayer().getShowEquipments()[4] = "Light Armor";
                }
            } else if (armorDropChance <= 86) {
                if (getPlayer().getEquipments()[5].equals("mediumArmor")) {
                    System.out.println("You dropped Medium Armor but you already have.");
                    System.out.println("You sold the armor in the dwarf shop.");
                    System.out.println("So, you earned " + 13 + "€ as the armor.");
                    getPlayer().setMoney(getPlayer().getMoney() + 13);
                } else if (!getPlayer().getEquipments()[5].equals("mediumArmor")) {
                    System.out.println("Lucky!, You dropped Medium Armor.");
                    System.out.println("Medium Armor added to inventory.");
                    getPlayer().getEquipments()[5] = "mediumArmor";
                    getPlayer().getShowEquipments()[5] = "Medium Armor";
                }
            } else if (armorDropChance <= 100) {
                if (getPlayer().getEquipments()[6].equals("heavyArmor")) {
                    System.out.println("You dropped Heavy Armor but you already have.");
                    System.out.println("You sold the armor in the dwarf shop.");
                    System.out.println("So, you earned " + 20 + "€ as the armor.");
                    getPlayer().setMoney(getPlayer().getMoney() + 20);
                } else if (!getPlayer().getEquipments()[6].equals("heavyArmor")) {
                    System.out.println("Lucky!, You dropped Heavy Armor.");
                    System.out.println("Heavy Armor added to inventory.");
                    getPlayer().getEquipments()[6] = "heavyArmor";
                    getPlayer().getShowEquipments()[6] = "Heavy Armor";
                }
            }
        }

        if (awardDropChance > 197 && awardDropChance <= 390) {
            if (moneyDropChance <= 58) {
                System.out.println("Lucky! You dropped bag of gold.");
                System.out.println("You earned 10€.");
                getPlayer().setMoney(getPlayer().getMoney() + 10);
            } else if (moneyDropChance <= 93) {
                System.out.println("Lucky! You dropped a box of gold.");
                System.out.println("You earned 25€.");
                getPlayer().setMoney(getPlayer().getMoney() + 25);
            } else if (moneyDropChance <= 100) {
                System.out.println("LUCKY! You dropped a chest full of gold.");
                System.out.println("You earned 60€.");
                getPlayer().setMoney(getPlayer().getMoney() + 60);
            }
        }

        if ((awardDropChance > 390 && awardDropChance <= 1137) && awardDropChance != 911) {
            System.out.println("Unfortunately, you didn't get the drop from the monster.");
        }

        if (awardDropChance == 911 && !getPlayer().getInventory().isGodGrace()) {
            System.out.println("<><><><><><><><><><>|||||||**************|||||||<><><><><><><><><><>");
            System.out.println("SOOOO LUCKY!! You won ~~GOD'S GRACE~~ with %0,0879 CHANCE!!");
            System.out.println("GOD'S GRACE can only be achieved with this chance and this way.");
            System.out.println("Return to the safe house to obtain GOD'S GRACE.");
            getPlayer().getInventory().setGodGrace(true);
        }

        System.out.println();
        System.out.print("Type any number to keep going:");
        continueFight = input.nextInt();
        System.out.println();
        System.out.println();
    }
}
