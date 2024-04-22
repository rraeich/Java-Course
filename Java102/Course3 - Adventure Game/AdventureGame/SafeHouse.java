package AdventureGame;

import java.util.Scanner;

public class SafeHouse extends SafeLocations {

    Scanner input = new Scanner(System.in);
    String[] controlList_two = {"bow", "sword", "crossbow", "hammer", "lightArmor", "mediumArmor", "heavyArmor", "healthPotion", "weaknessPotion", "powerPotion"};
    int x = 0, y = 0;

    public SafeHouse(Player player) {
        super(player);
    }

    @Override
    public void enterLocation() {
        getPlayer().setHealth(getPlayer().getMaxHealth());
        if (getPlayer().getInventory().isWater() && getPlayer().getInventory().isFood() && getPlayer().getInventory().isWood() && y == 0) {
            getPlayer().getInventory().setGameFinish(true);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~CONGRATULATIONS!!!~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("You finished the GAME " + getPlayer().getName() + "!!!");
            System.out.println("Your total kill: " + getPlayer().getHowManyKill());
            System.out.println("You collected all three special rewards.");
            System.out.println("Thanks for playing " + getPlayer().getName() + ".");
            System.out.println("I would like to thank my lover for supporting me <3. I love you MY DARLING. PELİNCİĞİM<3");
            System.out.println("Note from my lover: my lover is so talented man. (only man i ever know :) )");
            System.out.println("All sections has been opened because you finished the game.");
            System.out.println("If you want to quit game, go selection menu and choose 0.");
            System.out.println("If you want to continue playing, you can enter to all sections as you want.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            y++;
            System.out.println("When you want to go, press any number.");
            int go = input.nextInt();
        }

        int chooseOption;
        do {
            if (getPlayer().getInventory().isGodGrace() && x == 0) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("You have been rewarded with GOD'S GRACE.");
                getPlayer().setHealth(getPlayer().getMaxHealth() + 46);
                getPlayer().setMaxHealth(getPlayer().getHealth());
                getPlayer().setDamage(getPlayer().getDamage() + 19);
                System.out.println("Health increased by +46 with god's immortality.!");
                System.out.println("And your critical hit chance increased to %16,67! (+%10,78)");
                System.out.println("Damage increased by +19 with the power of the god's whip.!!");
                System.out.println();
                x++;
                getPlayer().getInventory().setUseGodGrace(true);
                System.out.println("When you want to go, press any number.");
                int go = input.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                x++;
            }

            System.out.println("You entered the SafeHouse. Your health is renewed to " + getPlayer().getHealth());
            System.out.println("Type '1' to see which special items you have.");
            System.out.println("Type '2' to look your character's info.");
            System.out.println("Type '3' if you wanna see your equipments and wear them.");
            System.out.println("If you don't want either of these, type '0' to return to the section selection.");
            chooseOption = input.nextInt();

            switch (chooseOption) {
                case 0:
                    break;
                case 1:
                    System.out.println("Here it says whether you have special items or not.");
                    getPlayer().getInventory().itemInfo();
                    System.out.println("When you want to go back, type 1.");
                    int goBack = input.nextInt();

                    while (goBack != 1) {
                        System.out.println("You cannot write any other number except 1. Try again:");
                        goBack = input.nextInt();
                    }
                    break;
                case 2:
                    getPlayer().infoChar();
                    System.out.println("When you want to go back, type 1.");
                    int goBack_two = input.nextInt();

                    while (goBack_two != 1) {
                        System.out.println("You cannot write any other number except 1. Try again:");
                        goBack_two = input.nextInt();
                    }
                    break;
                case 3:
                    int wearSelection;
                    int haveAnyEquipment = 0;
                    int a = 0;
                    String[] equipmentsList = getPlayer().getShowEquipments();

                    for (String x : equipmentsList) {
                        if (x.equals("null")) {
                            continue;
                        }
                        if (a == 0) {
                            System.out.print("That's your equipments: ");
                        }

                        a++;
                        System.out.print(x + ", ");
                        haveAnyEquipment++;
                    }
                    System.out.println("\n");

                    if (haveAnyEquipment > 0) {
                        System.out.println("If you want wear any equipment, type '1'; if you don't want wear, you can type every numbers except 1.");
                        System.out.println("Do you wanna wear any equipment?");
                        wearSelection = input.nextInt();
                    } else {
                        System.out.println("You don't have any equipments");
                        wearSelection = 0;
                    }

                    //EKİPMAN KUŞANMA
                    if (wearSelection == 1) {
                        System.out.println("1-) Gun \n2-) Armor");
                        System.out.println("What would you like to wear?");
                        int equip = input.nextInt();

                        //SİLAH KUŞANMA
                        if (equip == 1) {
                            if (getPlayer().getInventory().isGun()) {
                                System.out.println("You already have an equipment.");
                                System.out.println("If you wanna take off your gun, type '0'");
                                System.out.println("Otherwise, type any number to return.");
                                int takeOffGun = input.nextInt();

                                if (takeOffGun == 0) {
                                    System.out.print("The weapon you wear: ");
                                    if (getPlayer().getWearEquipments()[0].equals("bow"))
                                        System.out.println("Elf's Bow");
                                    if (getPlayer().getWearEquipments()[0].equals("sword"))
                                        System.out.println("Ruby Sword");
                                    if (getPlayer().getWearEquipments()[0].equals("crossbow"))
                                        System.out.println("Wooden Light Crossbow");
                                    if (getPlayer().getWearEquipments()[0].equals("hammer"))
                                        System.out.println("Infinity Hammer.");

                                    switch (getPlayer().getWearEquipments()[0]) {

                                        case "bow":
                                            getPlayer().getWearEquipments()[0] = "null";
                                            int oldDamage = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() - 3);
                                            getPlayer().getInventory().setGun(false);
                                            System.out.println("You took out the Elf's Bow.");
                                            System.out.println("Your damage decreased: " + oldDamage + " ---> " + getPlayer().getDamage() + ".");
                                            break;
                                        case "sword":
                                            getPlayer().getWearEquipments()[0] = "null";
                                            int oldDamage_2 = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() - 5);
                                            getPlayer().getInventory().setGun(false);
                                            System.out.println("You took out the Ruby Sword.");
                                            System.out.println("Your damage decreased: " + oldDamage_2 + " ---> " + getPlayer().getDamage() + ".");
                                            break;
                                        case "crossbow":
                                            getPlayer().getWearEquipments()[0] = "null";
                                            int oldDamage_3 = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() - 2);
                                            getPlayer().getInventory().setGun(false);
                                            System.out.println("You took out the Wooden Light Crossbow.");
                                            System.out.println("Your damage decreased: " + oldDamage_3 + " ---> " + getPlayer().getDamage() + ".");
                                            break;
                                        case "hammer":
                                            getPlayer().getWearEquipments()[0] = "null";
                                            int oldDamage_4 = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() - 8);
                                            getPlayer().getInventory().setGun(false);
                                            System.out.println("You took out the Infinity Hammer.");
                                            System.out.println("Your damage decreased: " + oldDamage_4 + " ---> " + getPlayer().getDamage() + ".");
                                            break;
                                        default:
                                            System.out.println("You will continue without took out any equipment.");
                                            break;
                                    }
                                } else {
                                    System.out.println("You will return to back.");
                                }
                            } else {
                                System.out.print("You have this guns: ");
                                String[] gunList = getPlayer().getShowEquipments();

                                for (int i = 0; i <= 3; i++) {
                                    if (gunList[i].equals("null")) {
                                        continue;
                                    }
                                    if (i == 3) {
                                        System.out.println(gunList[i]);
                                    } else {
                                        System.out.print(gunList[i] + ",");
                                    }
                                }
                                System.out.println("\n");
                                System.out.println("You must have the weapon in order to equip it.");

                                if (getPlayer().getEquipments()[0].equals("bow"))
                                    System.out.println("1-) Elf's Bow(+3 Damage)");
                                if (getPlayer().getEquipments()[1].equals("sword"))
                                    System.out.println("2-) Ruby Sword(+5 Damage)");
                                if (getPlayer().getEquipments()[2].equals("crossbow"))
                                    System.out.println("3-) Wooden Light Crossbow(+2 Damage)");
                                if (getPlayer().getEquipments()[3].equals("hammer"))
                                    System.out.println("4-) Infinity Hammer(+8 Damage)");

                                System.out.println("0-) Quit (Go back)");
                                System.out.println("Choose the weapon you want to equip:");
                                int chooseGun = input.nextInt();
                                int oldDamage;

                                while (chooseGun != 0 && chooseGun != 1 && chooseGun != 2 && chooseGun != 3 && chooseGun != 4) {
                                    System.out.println("You have to enter one of the numbers 0,1,2,3,4. Try again: ");
                                    chooseGun = input.nextInt();
                                }

                                if (chooseGun == 0)
                                    break;

                                if (getPlayer().getEquipments()[chooseGun - 1].equals(controlList_two[chooseGun - 1])) {
                                    switch (chooseGun) {
                                        case 1:
                                            getPlayer().getInventory().setGun(true);
                                            oldDamage = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() + 3);
                                            getPlayer().getWearEquipments()[0] = "bow";
                                            System.out.println("You are equipped Elf's Bow and your damage increased from " + oldDamage + " --> " + getPlayer().getDamage() + ".");
                                            break;
                                        case 2:
                                            getPlayer().getInventory().setGun(true);
                                            oldDamage = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() + 5);
                                            getPlayer().getWearEquipments()[0] = "sword";
                                            System.out.println("You are equipped Ruby Sword and your damage increased from " + oldDamage + " --> " + getPlayer().getDamage() + ".");
                                            break;
                                        case 3:
                                            getPlayer().getInventory().setGun(true);
                                            oldDamage = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() + 2);
                                            getPlayer().getWearEquipments()[0] = "crossbow";
                                            System.out.println("You are equipped Wooden Light Crossbow and your damage increased from " + oldDamage + " --> " + getPlayer().getDamage() + ".");
                                            break;
                                        case 4:
                                            getPlayer().getInventory().setGun(true);
                                            oldDamage = getPlayer().getDamage();
                                            getPlayer().setDamage(getPlayer().getDamage() + 8);
                                            getPlayer().getWearEquipments()[0] = "hammer";
                                            System.out.println("You are equipped Infinity Hammer and your damage increased from " + oldDamage + " --> " + getPlayer().getDamage() + ".");
                                            break;
                                    }
                                } else {
                                    System.out.println("You don't have this gun.");
                                }
                            }
                        }

                        //ZIRH KUŞANMA
                        if (equip == 2) {
                            if (getPlayer().getInventory().isArmor()) {
                                System.out.println("You already have an armor.");
                                System.out.println("If you wanna take off your armor, type '0'");
                                System.out.println("Otherwise, type any number to return back.");
                                int takeOffArmor = input.nextInt();

                                if (takeOffArmor == 0) {
                                    System.out.print("The armor you wear: ");
                                    if (getPlayer().getWearEquipments()[1].equals("lightArmor"))
                                        System.out.println("Light Armor");
                                    if (getPlayer().getWearEquipments()[1].equals("mediumArmor"))
                                        System.out.println("Medium Armor");
                                    if (getPlayer().getWearEquipments()[1].equals("heavyArmor"))
                                        System.out.println("Heavy Armor");

                                    switch (getPlayer().getWearEquipments()[1]) {
                                        case "lightArmor":
                                            getPlayer().getWearEquipments()[1] = "null";
                                            int oldHealth = getPlayer().getHealth();
                                            getPlayer().setHealth(getPlayer().getHealth() - 5);
                                            getPlayer().setMaxHealth(getPlayer().getHealth());
                                            getPlayer().getInventory().setArmor(false);
                                            System.out.println("You took out the Light Armor.");
                                            System.out.println("Your health decreased: " + oldHealth + " ---> " + getPlayer().getHealth() + ".");
                                            break;
                                        case "mediumArmor":
                                            getPlayer().getWearEquipments()[1] = "null";
                                            int oldHealth_2 = getPlayer().getHealth();
                                            getPlayer().setHealth(getPlayer().getHealth() - 8);
                                            getPlayer().setMaxHealth(getPlayer().getHealth());
                                            getPlayer().getInventory().setArmor(false);
                                            System.out.println("You took out the Medium Armor.");
                                            System.out.println("Your health decreased: " + oldHealth_2 + " ---> " + getPlayer().getHealth() + ".");
                                            break;
                                        case "heavyArmor":
                                            getPlayer().getWearEquipments()[1] = "null";
                                            int oldHealth_3 = getPlayer().getHealth();
                                            getPlayer().setHealth(getPlayer().getHealth() - 12);
                                            getPlayer().setMaxHealth(getPlayer().getHealth());
                                            getPlayer().getInventory().setArmor(false);
                                            System.out.println("You took out the Heavy Armor.");
                                            System.out.println("Your health decreased: " + oldHealth_3 + " ---> " + getPlayer().getHealth() + ".");
                                            break;
                                        default:
                                            System.out.println("You will continue without took out any armor.");
                                            break;
                                    }
                                } else {
                                    System.out.println("You will return to back.");
                                }
                            } else {
                                System.out.print("You have this armors: ");
                                String[] armorList = getPlayer().getShowEquipments();

                                for (int i = 0; i <= 2; i++) {
                                    if (armorList[i + 4].equals("null")) {
                                        continue;
                                    }
                                    if (i == 2) {
                                        System.out.println(armorList[i + 4]);
                                    } else {
                                        System.out.print(armorList[i + 4] + ",");
                                    }
                                }
                                System.out.println("\n");
                                System.out.println("You must have the armor in order to equip it.");

                                if (getPlayer().getEquipments()[4].equals("lightArmor"))
                                    System.out.println("1-) Light Armor(+5 Health)");
                                if (getPlayer().getEquipments()[5].equals("mediumArmor"))
                                    System.out.println("2-) Medium Armor(+8 Health)");
                                if (getPlayer().getEquipments()[6].equals("heavyArmor"))
                                    System.out.println("3-) Heavy Armor(+12 Health)");

                                System.out.println("0-) Quit (Go back)");
                                System.out.println("Choose the armor you want to equip:");
                                int chooseArmor = input.nextInt();
                                int oldHealth;

                                if (chooseArmor == 0)
                                    break;

                                while (chooseArmor != 0 && chooseArmor != 1 && chooseArmor != 2 && chooseArmor != 3) {
                                    System.out.println("You have to enter one of the numbers 0,1,2,3. Try again: ");
                                    chooseArmor = input.nextInt();
                                }

                                if (getPlayer().getEquipments()[chooseArmor + 3].equals(controlList_two[chooseArmor + 3])) {
                                    switch (chooseArmor) {
                                        case 0:
                                            break;
                                        case 1:
                                            getPlayer().getInventory().setArmor(true);
                                            oldHealth = getPlayer().getHealth();
                                            getPlayer().setHealth(getPlayer().getHealth() + 5);
                                            getPlayer().setMaxHealth(getPlayer().getHealth());
                                            getPlayer().getWearEquipments()[1] = "lightArmor";
                                            System.out.println("You are equipped Light Armor and your health increased from " + oldHealth + " --> " + getPlayer().getHealth() + ".");
                                            break;
                                        case 2:
                                            getPlayer().getInventory().setArmor(true);
                                            oldHealth = getPlayer().getHealth();
                                            getPlayer().setHealth(getPlayer().getHealth() + 8);
                                            getPlayer().setMaxHealth(getPlayer().getHealth());
                                            getPlayer().getWearEquipments()[1] = "mediumArmor";
                                            System.out.println("You are equipped Medium Armor and your health increased from " + oldHealth + " --> " + getPlayer().getHealth() + ".");
                                            break;
                                        case 3:
                                            getPlayer().getInventory().setArmor(true);
                                            oldHealth = getPlayer().getHealth();
                                            getPlayer().setHealth(getPlayer().getHealth() + 12);
                                            getPlayer().setMaxHealth(getPlayer().getHealth());
                                            getPlayer().getWearEquipments()[1] = "heavyArmor";
                                            System.out.println("You are equipped Heavy Armor and your health increased from " + oldHealth + " --> " + getPlayer().getHealth() + ".");
                                            break;
                                    }
                                } else {
                                    System.out.println("You don't have this armor.");
                                }
                            }
                        }
                    }

                    System.out.println("When you want to go back, type 1.");
                    int goBack_three = input.nextInt();

                    while (goBack_three != 1) {
                        System.out.println("You cannot write any other number except 1. Try again:");
                        goBack_three = input.nextInt();
                    }

                    break;
                default:
                    System.out.println("You entered wrong number. You will go back SafeHouse Menu.");
                    break;
            }
        } while (chooseOption != 0);
    }
}
