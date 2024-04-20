package AdventureGame;

public class ToolStore extends SafeLocations {

    int shopSelection;

    // 1- bow 2- sword 3- crossbow 4- hammer
    // 5- lightArmor 6- mediumArmor 7- heavyArmor
    // 8- healthPotion 9- weaknessPotion 10- powerPotion
    String[] controlList = {"bow", "sword", "crossbow", "hammer", "lightArmor", "mediumArmor", "heavyArmor", "healthPotion", "weaknessPotion", "powerPotion"};

    public ToolStore(Player player) {
        super(player);
    }

    @Override
    public void enterLocation() {

        do {
            System.out.println("You entered the Tool Store. You have " + getPlayer().getMoney() + "€ golds.");
            System.out.println();
            System.out.println("1-) Weapons \n2-) Armors \n3-) Potions");
            System.out.println();
            System.out.println("What kind of equipment would you like to buy?");
            System.out.println("If you are not going to buy a equipment, type '0' to return to menu.");
            shopSelection = input.nextInt();

            goShop:
            switch (shopSelection) {
                case 0:
                    break;
                case 1:
                    System.out.println("--INFO--");
                    System.out.println("Weapons increase the damage you deal.");
                    System.out.println("Also, you can only equip one weapon.");
                    System.out.println("You can equip your weapons in the Safe House.");
                    System.out.println();
                    System.out.println("1-) Elf's Bow: +3 Damage <---> Money: 17€");
                    System.out.println("2-) Ruby Sword: +5 Damage <---> Money: 28€");
                    System.out.println("3-) Wooden Light Crossbow: +2 Damage <---> Money: 12€");
                    System.out.println("4-) Infinity Hammer: +8 Damage <---> Money: 43€");
                    System.out.println();
                    System.out.println("What would you like to buy?");
                    System.out.println("If you are not going to buy a weapon, type '0' to return.");
                    int weaponSelection = input.nextInt();

                    if (weaponSelection == 0) {
                        break;
                    }

                    while (weaponSelection != 1 && weaponSelection != 2 && weaponSelection != 3 && weaponSelection != 4) {
                        System.out.println("You cannot type a number expect 1,2,3,4. Try again:");
                        weaponSelection = input.nextInt();

                        if (weaponSelection == 0) {
                            break goShop;
                        }
                    }

                    while (getPlayer().getEquipments()[weaponSelection - 1].equals(controlList[weaponSelection - 1])) {
                        System.out.println("You already bought this item. Reselect:");
                        weaponSelection = input.nextInt();

                        if (weaponSelection == 0) {
                            break goShop;
                        }

                        while (weaponSelection != 1 && weaponSelection != 2 && weaponSelection != 3 && weaponSelection != 4) {
                            System.out.println("You cannot type a number expect 1,2,3,4. Try again:");
                            weaponSelection = input.nextInt();

                            if (weaponSelection == 0) {
                                break goShop;
                            }
                        }
                    }

                    if (getPlayer().getMoney() >= 17 && weaponSelection == 1) {
                        getPlayer().getShowEquipments()[0] = "Elf's Bow";
                        getPlayer().getEquipments()[0] = "bow";
                        getPlayer().setMoney(getPlayer().getMoney() - 17);
                        System.out.println("You bought Elf's bow.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 28 && weaponSelection == 2) {
                        getPlayer().getShowEquipments()[1] = "Ruby Sword";
                        getPlayer().getEquipments()[1] = "sword";
                        getPlayer().setMoney(getPlayer().getMoney() - 28);
                        System.out.println("You bought Ruby's sword.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 12 && weaponSelection == 3) {
                        getPlayer().getShowEquipments()[2] = "Wooden Light Crossbow";
                        getPlayer().getEquipments()[2] = "crossbow";
                        getPlayer().setMoney(getPlayer().getMoney() - 12);
                        System.out.println("You bought Wooden Light Crossbow.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 43 && weaponSelection == 4) {
                        getPlayer().getShowEquipments()[3] = "Infinity Hammer";
                        getPlayer().getEquipments()[3] = "hammer";
                        getPlayer().setMoney(getPlayer().getMoney() - 43);
                        System.out.println("You bought Infinity Hammer.");
                        System.out.println();
                    } else {
                        System.out.println("You don't have money enough.");
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("--INFO--");
                    System.out.println("Armors reduces the damage you take.");
                    System.out.println("Also, you can only equip one armor.");
                    System.out.println("You can equip your armors in the Safe House.");
                    System.out.println();
                    System.out.println("1-) Light Armor: +5 Armor(Health) <---> Money: 14€");
                    System.out.println("2-) Medium Armor: +8 Armor(Health) <---> Money: 27€");
                    System.out.println("3-) Heavy Armor: +12 Armor(Health) <---> Money: 41€");
                    System.out.println();
                    System.out.println("What would you like to buy?");
                    System.out.println("If you are not going to buy a weapon, type '0' to return.");
                    int armorSelection = input.nextInt();

                    if (armorSelection == 0) {
                        break;
                    }

                    while (armorSelection != 1 && armorSelection != 2 && armorSelection != 3) {
                        System.out.println("You cannot type a number expect 1,2,3. Try again:");
                        armorSelection = input.nextInt();

                        if (armorSelection == 0) {
                            break goShop;
                        }
                    }

                    while (getPlayer().getEquipments()[armorSelection + 3].equals(controlList[armorSelection + 3])) {
                        System.out.println("You already bought this armor. Reselect:");
                        armorSelection = input.nextInt();

                        if (armorSelection == 0) {
                            break goShop;
                        }

                        while (armorSelection != 1 && armorSelection != 2 && armorSelection != 3) {
                            System.out.println("You cannot type a number expect 0,1,2,3. Try again:");
                            armorSelection = input.nextInt();

                            if (armorSelection == 0) {
                                break goShop;
                            }
                        }
                    }

                    if (getPlayer().getMoney() >= 14 && armorSelection == 1) {
                        getPlayer().getShowEquipments()[4] = "Light Armor";
                        getPlayer().getEquipments()[4] = "lightArmor";
                        getPlayer().setMoney(getPlayer().getMoney() - 14);
                        System.out.println("You bought Light Armor.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 27 && armorSelection == 2) {
                        getPlayer().getShowEquipments()[5] = "Medium Armor";
                        getPlayer().getEquipments()[5] = "mediumArmor";
                        getPlayer().setMoney(getPlayer().getMoney() - 27);
                        System.out.println("You bought Medium Armor.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 41 && armorSelection == 3) {
                        getPlayer().getShowEquipments()[6] = "Heavy Armor";
                        getPlayer().getEquipments()[6] = "heavyArmor";
                        getPlayer().setMoney(getPlayer().getMoney() - 41);
                        System.out.println("You bought Heavy Armor.");
                        System.out.println();
                    } else {
                        System.out.println("You don't have money enough.");
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("--INFO--");
                    System.out.println("Potions have properties that will be useful in battle and they are disposable.");
                    System.out.println("You can only have 1 of each type of potion.");
                    System.out.println("You can use your potions during battle.");
                    System.out.println("Health potion increases your health.");
                    System.out.println("Weakness potion halves the enemy's damage.");
                    System.out.println("Power potion increases your damage.");
                    System.out.println();
                    System.out.println("1-) Health Potion: +8 Health <---> Money: 8€");
                    System.out.println("2-) Weakness Potion: (for Enemy) 1/2 Damage <---> Money: 10€");
                    System.out.println("3-) Power Potion: +3 Damage <---> Money: 11€");
                    System.out.println();
                    System.out.println("What would you like to buy?");
                    System.out.println("If you are not going to buy a weapon, type '0' to return.");
                    int potionSelection = input.nextInt();

                    if (potionSelection == 0) {
                        break;
                    }

                    while (potionSelection != 1 && potionSelection != 2 && potionSelection != 3) {
                        System.out.println("You cannot type a number expect 1,2,3. Try again:");
                        potionSelection = input.nextInt();

                        if (potionSelection == 0) {
                            break goShop;
                        }
                    }

                    while (getPlayer().getEquipments()[potionSelection + 6].equals(controlList[potionSelection + 6])) {
                        System.out.println("You already have this potion. Reselect:");
                        potionSelection = input.nextInt();

                        if (potionSelection == 0) {
                            break goShop;
                        }

                        while (potionSelection != 1 && potionSelection != 2 && potionSelection != 3) {
                            System.out.println("You cannot type a number expect 1,2,3,. Try again:");
                            potionSelection = input.nextInt();

                            if (potionSelection == 0) {
                                break goShop;
                            }
                        }
                    }

                    if (getPlayer().getMoney() >=8 && potionSelection == 1) {
                        getPlayer().getShowEquipments()[7] = "Health Potion";
                        getPlayer().getEquipments()[7] = "healthPotion";
                        getPlayer().getInventory().setHPotion(true);
                        getPlayer().setMoney(getPlayer().getMoney() - 8);
                        System.out.println("You bought Health Potion.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 10 && potionSelection == 2) {
                        getPlayer().getShowEquipments()[8] = "Weakness Potion";
                        getPlayer().getEquipments()[8] = "weaknessPotion";
                        getPlayer().getInventory().setWPotion(true);
                        getPlayer().setMoney(getPlayer().getMoney() - 10);
                        System.out.println("You bought Weakness Potion.");
                        System.out.println();
                    } else if (getPlayer().getMoney() >= 11 && potionSelection == 3) {
                        getPlayer().getShowEquipments()[9] = "Power Potion";
                        getPlayer().getEquipments()[9] = "powerPotion";
                        getPlayer().getInventory().setPPotion(true);
                        getPlayer().setMoney(getPlayer().getMoney() - 11);
                        System.out.println("You bought Power Potion.");
                        System.out.println();
                    } else {
                        System.out.println("You don't have money enough.");
                        System.out.println();
                    }
                    break;
            }
        } while (shopSelection != 0);
    }
}

