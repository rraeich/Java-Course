package AdventureGame;

public class Cave extends BattleLocations {

    private Zombie zombie;

    public Cave(Player player, Zombie zombie) {
        super(player, zombie);
    }

    @Override
    public void enterBattleLocation() {
        int mainOldMonsterHealth = getMonster().getHealth();
        System.out.println(getPlayer().getName() + ", you entered the Cave. You will fight with horrible bone zombies.");

        System.out.println("IMPORTANT: Once you roll the dice, you have to fight.");
        System.out.println("If you think you are not ready, type '0' and go back, otherwise type any number.");
        int notReady = input.nextInt();

        if (notReady == 0) {
            System.out.println("You going back..");
        } else {
            System.out.println("------INFO------");
            System.out.println("Dont forget, You must defeat all the zombies to win the special reward (Food).");
            System.out.println("Also, you have chance to will guns,armors or potions.");
            System.out.println("You will fight a random number of enemies(4-6).");
            System.out.println("Who will start the war will be determined by rolling the dice (1-6).");
            System.out.println("""
                    1-) Odd numbers(1,3,5)
                    2-) Even numbers(2,4,6)
                    """);
            System.out.println("Will you choose even numbers or odd numbers?");
            int chooseDice = input.nextInt();

            while (chooseDice != 1 && chooseDice != 2) {
                System.out.println("You don't enter numbers except 1,2. Try again:");
                chooseDice = input.nextInt();
            }

            boolean isStartFirst;
            String chooseString;

            if (chooseDice == 1) {
                chooseString = "odd";
            } else {
                chooseString = "even";
            }
            System.out.println("**********************");
            System.out.println("Dice be throwing...");
            System.out.println("**********************");
            int startingRandomSide = random.nextInt(1, 7);

            if ((startingRandomSide % 2 == 0 && chooseDice == 2) || (startingRandomSide % 2 != 0 && chooseDice == 1)) {
                System.out.println("Dice: " + startingRandomSide);
                System.out.println("Your choice: " + chooseString);
                System.out.println(getPlayer().getName() + ", you will starting the fight.");
                System.out.println();
                isStartFirst = true;
            } else {
                System.out.println("Dice: " + startingRandomSide);
                System.out.println("Your choice: " + chooseString);
                System.out.println("You lost. " + getMonster().getName() + " will be start.");
                System.out.println();
                isStartFirst = false;
            }

            getMonster().monsterInfo();

            int enemyCount = random.nextInt(4, 6);
            System.out.println("You will fight " + enemyCount + " enemies.");
            System.out.println("Press 2 to see your stats.");

            if (isStartFirst)
                System.out.println("You will start to fight.");
            else
                System.out.println(getMonster().getName() + " will be start to fight.");

            System.out.println("When you are ready, type 1.");
            int readyToFight = input.nextInt();

            startFight:
            while (readyToFight != 1) {
                while (readyToFight != 2) {
                    System.out.println("You cannot enter a number except 1,2. Try again: ");

                    readyToFight = input.nextInt();

                    if (readyToFight == 1) {
                        break startFight;
                    }
                }

                getPlayer().infoChar();

                System.out.println("\nWell, when you are ready to fight press 1.");
                readyToFight = input.nextInt();
            }

            System.out.println("\n\n<><><><><><><><><><><><><><><>FIGHT STARTED<><><><><><><><><><><><><><><>");

            if (isStartFirst) {
                int criticAttackChancePlayer;
                int criticAttackChanceEnemy;
                int monsterCounter = 1;
                int tourCounter;
                int powerPotionCounter = 0;
                int weaknessPotionCounter = 0;
                int fightCount = 0;
                int continueFight;
                int usePotion;
                int oldHealth;
                int oldMonsterHealth = getMonster().getHealth();
                int oldMonsterDamage;
                int mainDamage;
                boolean useHP = false;
                boolean useWP = false;
                boolean usePP = false;

                defeatAllEnemy:
                diePlayer:
                defeatEnemy:
                while (monsterCounter <= enemyCount && getPlayer().getHealth() > 0) {
                    fightCount++;
                    getMonster().setHealth(oldMonsterHealth);
                    tourCounter = 0;

                    if (useHP && getPlayer().getHealth() > getPlayer().getMaxHealth())
                        getPlayer().setHealth(getPlayer().getMaxHealth());

                    if (usePP && powerPotionCounter == 0) {
                        getPlayer().setDamage(getPlayer().getDamage() - 3);
                        powerPotionCounter++;
                    }
                    if (useWP && weaknessPotionCounter == 0) {
                        getMonster().setDamage(getMonster().getDamage() * 2);
                        weaknessPotionCounter++;
                    }

                    while (getPlayer().getHealth() > 0 && getMonster().getHealth() > 0) {
                        tourCounter++;
                        System.out.println("    - " + fightCount + ". ENEMY -");
                        System.out.println("//**- " + tourCounter + ". ROUND -**\\\\");
                        System.out.println();
                        System.out.println(getPlayer().getName() + "'s turn.");
                        System.out.println("You will gonna attack.");
                        System.out.println();

                        if (getPlayer().getInventory().ispPotion()) {
                            System.out.println("---INFO---");
                            System.out.println("Potions are 1 each and can be used during battle.");
                            System.out.println("You can only use the power potion during the attack round.");
                            System.out.println("The power potion will increase your damage by 3 for this battle.");
                            System.out.println("\nDo you wanna use your power potion? (1- Yes)(No: Any number except 1)");
                            usePotion = input.nextInt();

                            if (usePotion == 1) {
                                mainDamage = getPlayer().getDamage();
                                getPlayer().setDamage(getPlayer().getDamage() + 3);
                                getPlayer().getInventory().setPPotion(false);
                                getPlayer().getShowEquipments()[9] = "null";
                                getPlayer().getEquipments()[9] = "null";
                                usePP = true;
                                System.out.println("Your damage increased from " + mainDamage + " to " + getPlayer().getDamage());
                            } else {
                                System.out.println("No potions were used.");
                            }

                            System.out.print("Type any number to keep going:");
                            continueFight = input.nextInt();
                        }
                        System.out.println();

                        criticAttackChancePlayer = random.nextInt(1, 18);
                        if (getPlayer().getInventory().isUseGodGrace())
                            criticAttackChancePlayer = random.nextInt(1, 6);
                        if (criticAttackChancePlayer == 5) {
                            System.out.println(getPlayer().getName() + " --->>" + (getPlayer().getDamage() * 2) + "  " + getMonster().getName());
                            System.out.println("DAMN! " + getPlayer().getName() + " critically hits and his damage is doubled!!");
                            System.out.print(getMonster().getHealth() + " --> ");
                            getMonster().setHealth(getMonster().getHealth() - (getPlayer().getDamage() * 2));
                            System.out.println(getMonster().getHealth());
                        } else {
                            System.out.println(getPlayer().getName() + " --->>" + getPlayer().getDamage() + " " + getMonster().getName());
                            System.out.println(getPlayer().getName() + " attacked the " + getMonster().getName() + " and hit good damage.");
                            System.out.print(getMonster().getHealth() + " --> ");
                            getMonster().setHealth(getMonster().getHealth() - getPlayer().getDamage());
                            System.out.println(getMonster().getHealth());
                        }

                        if (getPlayer().getHealth() < 0)
                            getPlayer().setHealth(0);
                        if (getMonster().getHealth() < 0)
                            getMonster().setHealth(0);

                        System.out.println();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(getPlayer().getName() + "'s health: " + getPlayer().getHealth());
                        System.out.println(monsterCounter + ". " + getMonster().getName() + "'s health: " + getMonster().getHealth());
                        System.out.println("----------------------------------------------------------------");
                        System.out.println();

                        if (getPlayer().getHealth() <= 0) {
                            break diePlayer;
                        }

                        if (getMonster().getHealth() <= 0) {
                            beatEnemy(monsterCounter);

                            monsterCounter++;

                            if (monsterCounter > enemyCount && getPlayer().getHealth() > 0) {
                                getPlayer().getInventory().setFood(true);
                                break defeatAllEnemy;
                            }

                            continue defeatEnemy;
                        }

                        System.out.print("Type any number to keep going:");
                        continueFight = input.nextInt();

                        System.out.println();

                        System.out.println(getMonster().getName() + "'s turn.");
                        System.out.println("You will gonna defense.");
                        System.out.println();

                        if (getPlayer().getInventory().ishPotion() || getPlayer().getInventory().iswPotion()) {
                            System.out.println("Health Potion: " + getPlayer().getInventory().ishPotion());
                            System.out.println("Weakness Potion: " + getPlayer().getInventory().iswPotion());

                            System.out.println("1- Health Potion // 2-) Weakness Potion");
                            System.out.println("Weakness potion halves the enemy's damage.");
                            System.out.println("If the damage is an odd number, only the integer part is taken.");
                            System.out.println("Health potion increases your health.");
                            System.out.println("To use potions you have to have them.");
                            System.out.println("You can only use one elixir per turn.");
                            System.out.println("Do you want to use any potions? Which one would you like this to be?");
                            int potionUseSelection = input.nextInt();

                            if (!getPlayer().getInventory().ishPotion() && potionUseSelection == 1) {
                                while (potionUseSelection == 1) {
                                    System.out.println("You don't have a health potion. If you don't want to use elixir, type any number except 1,2.");
                                    potionUseSelection = input.nextInt();
                                }
                            }

                            if (!getPlayer().getInventory().iswPotion() && potionUseSelection == 2) {
                                while (potionUseSelection == 2) {
                                    System.out.println("You don't have a weakness potion. If you don't want to use elixir, type any number except 1,2.");
                                    potionUseSelection = input.nextInt();
                                }
                            }

                            if (potionUseSelection == 1 && getPlayer().getInventory().ishPotion()) {
                                oldHealth = getPlayer().getHealth();
                                getPlayer().setHealth(getPlayer().getHealth() + 8);
                                getPlayer().getInventory().setHPotion(false);
                                getPlayer().getShowEquipments()[7] = "null";
                                getPlayer().getEquipments()[7] = "null";
                                useHP = true;
                                System.out.println("Your health increased from " + oldHealth + " to " + getPlayer().getHealth() + ".");
                            } else if (potionUseSelection == 2 && getPlayer().getInventory().iswPotion()) {
                                oldMonsterDamage = getMonster().getDamage();
                                getMonster().setDamage(getMonster().getDamage() / 2);
                                getPlayer().getInventory().setWPotion(false);
                                getPlayer().getShowEquipments()[8] = "null";
                                getPlayer().getEquipments()[8] = "null";
                                useWP = true;
                                System.out.println(monsterCounter + ". " + getMonster().getName() + "'s damage halved. (" + oldMonsterDamage + " --> " + getMonster().getDamage() + ")");
                                System.out.println();
                            } else {
                                System.out.println("You didn't use to your potions.");
                            }
                        }

                        criticAttackChanceEnemy = random.nextInt(10, 28);
                        if (criticAttackChanceEnemy == 17) {
                            System.out.println(getMonster().getName() + " --->>" + (getMonster().getDamage() * 2) + "  " + getPlayer().getName());
                            System.out.println("Oh no! " + getMonster().getName() + " critically hits and its damage is doubled!!");
                            System.out.print(getPlayer().getHealth() + " --> ");
                            getPlayer().setHealth(getPlayer().getHealth() - (getMonster().getDamage() * 2));
                            System.out.println(getPlayer().getHealth());
                        } else {
                            System.out.println(getMonster().getName() + " --->>" + getMonster().getDamage() + "  " + getPlayer().getName());
                            System.out.println(getMonster().getName() + " attacked the " + getPlayer().getName() + " and hit good damage.");
                            System.out.print(getPlayer().getHealth() + " --> ");
                            getPlayer().setHealth(getPlayer().getHealth() - getMonster().getDamage());
                            System.out.println(getPlayer().getHealth());
                        }
                        System.out.println();

                        if (getPlayer().getHealth() < 0)
                            getPlayer().setHealth(0);
                        if (getMonster().getHealth() < 0)
                            getMonster().setHealth(0);

                        System.out.println();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(monsterCounter + ". " + getMonster().getName() + "'s health: " + getMonster().getHealth());
                        System.out.println(getPlayer().getName() + "'s health: " + getPlayer().getHealth());
                        System.out.println("----------------------------------------------------------------");
                        System.out.println();

                        if (getPlayer().getHealth() <= 0) {
                            break diePlayer;
                        }

                        System.out.print("Type any number to keep going:");
                        continueFight = input.nextInt();
                        System.out.println();
                    }

                    if (getPlayer().getHealth() <= 0) {
                        break diePlayer;
                    }

                    if (getMonster().getHealth() <= 0) {
                        beatEnemy(monsterCounter);
                    }

                    monsterCounter++;

                    if (monsterCounter > enemyCount && getPlayer().getHealth() > 0) {
                        getPlayer().getInventory().setFood(true);
                        break defeatAllEnemy;
                    }
                }

            } else {
                int criticAttackChancePlayer;
                int criticAttackChanceEnemy;
                int monsterCounter = 1;
                int fightCount = 0;
                int tourCounter;
                int continueFight;
                int powerPotionCounter = 0;
                int weaknessPotionCounter = 0;
                int usePotion;
                int oldHealth;
                int oldMonsterHealth = getMonster().getHealth();
                int oldMonsterDamage;
                int mainDamage;
                boolean useHP = false;
                boolean useWP = false;
                boolean usePP = false;

                defeatAllEnemy:
                diePlayer:
                defeatEnemy:
                while (monsterCounter <= enemyCount && getPlayer().getHealth() > 0) {
                    getMonster().setHealth(oldMonsterHealth);
                    fightCount++;
                    tourCounter = 0;

                    if (useHP && getPlayer().getHealth() > getPlayer().getMaxHealth())
                        getPlayer().setHealth(getPlayer().getMaxHealth());

                    if (usePP && powerPotionCounter == 0) {
                        getPlayer().setDamage(getPlayer().getDamage() - 3);
                        powerPotionCounter++;
                    }
                    if (useWP && weaknessPotionCounter == 0) {
                        getMonster().setDamage(getMonster().getDamage() * 2);
                        weaknessPotionCounter++;
                    }

                    while (getPlayer().getHealth() > 0 && getMonster().getHealth() > 0) {
                        tourCounter++;
                        System.out.println("    - " + fightCount + ". ENEMY -");
                        System.out.println("//**- " + tourCounter + ". ROUND -**\\\\");
                        System.out.println();
                        System.out.println(getMonster().getName() + "'s turn.");
                        System.out.println("You will gonna defense.");
                        System.out.println();

                        if (getPlayer().getInventory().ishPotion() || getPlayer().getInventory().iswPotion()) {
                            System.out.println("Health Potion: " + getPlayer().getInventory().ishPotion());
                            System.out.println("Weakness Potion: " + getPlayer().getInventory().iswPotion());

                            System.out.println("1- Health Potion // 2-) Weakness Potion");
                            System.out.println("Weakness potion halves the enemy's damage.");
                            System.out.println("If the damage is an odd number, only the integer part is taken.");
                            System.out.println("Health potion increases your health.");
                            System.out.println("To use potions you have to have them.");
                            System.out.println("You can only use one elixir per turn.");
                            System.out.println("Do you want to use any potions? Which one would you like this to be?");
                            int potionUseSelection = input.nextInt();

                            if (!getPlayer().getInventory().ishPotion() && potionUseSelection == 1) {
                                while (potionUseSelection == 1) {
                                    System.out.println("You don't have a health potion. If you don't want to use elixir, type any number except 1,2.");
                                    potionUseSelection = input.nextInt();
                                }
                            }

                            if (!getPlayer().getInventory().iswPotion() && potionUseSelection == 2) {
                                while (potionUseSelection == 2) {
                                    System.out.println("You don't have a weakness potion. If you don't want to use elixir, type any number except 1,2.");
                                    potionUseSelection = input.nextInt();
                                }
                            }

                            if (potionUseSelection == 1 && getPlayer().getInventory().ishPotion()) {
                                oldHealth = getPlayer().getHealth();
                                getPlayer().setHealth(getPlayer().getHealth() + 8);
                                getPlayer().getInventory().setHPotion(false);
                                getPlayer().getShowEquipments()[7] = "null";
                                getPlayer().getEquipments()[7] = "null";
                                useHP = true;
                                System.out.println("Your health increased from " + oldHealth + " to " + getPlayer().getHealth() + ".");
                            } else if (potionUseSelection == 2 && getPlayer().getInventory().iswPotion()) {
                                oldMonsterDamage = getMonster().getDamage();
                                getMonster().setDamage(getMonster().getDamage() / 2);
                                getPlayer().getInventory().setWPotion(false);
                                getPlayer().getShowEquipments()[8] = "null";
                                getPlayer().getEquipments()[8] = "null";
                                useWP = true;
                                System.out.println(monsterCounter + ". " + getMonster().getName() + "'s damage halved. (" + oldMonsterDamage + " --> " + getMonster().getDamage() + ")");
                                System.out.println();
                            } else {
                                System.out.println("You didn't use to your potions.");
                            }
                        }
                        System.out.println();

                        criticAttackChanceEnemy = random.nextInt(10, 28);
                        if (criticAttackChanceEnemy == 17) {
                            System.out.println(getMonster().getName() + " --->>" + (getMonster().getDamage() * 2) + "  " + getPlayer().getName());
                            System.out.println("Oh no! " + getMonster().getName() + " critically hits and its damage is doubled!!");
                            System.out.print(getPlayer().getHealth() + " --> ");
                            getPlayer().setHealth(getPlayer().getHealth() - (getMonster().getDamage() * 2));
                            System.out.println(getPlayer().getHealth());
                        } else {
                            System.out.println(getMonster().getName() + " --->>" + getMonster().getDamage() + "  " + getPlayer().getName());
                            System.out.println(getMonster().getName() + " attacked the " + getPlayer().getName() + " and hit good damage.");
                            System.out.print(getPlayer().getHealth() + " --> ");
                            getPlayer().setHealth(getPlayer().getHealth() - getMonster().getDamage());
                            System.out.println(getPlayer().getHealth());
                        }

                        if (getPlayer().getHealth() < 0)
                            getPlayer().setHealth(0);
                        if (getMonster().getHealth() < 0)
                            getMonster().setHealth(0);

                        System.out.println();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(monsterCounter + ". " + getMonster().getName() + "'s health: " + getMonster().getHealth());
                        System.out.println(getPlayer().getName() + "'s health: " + getPlayer().getHealth());
                        System.out.println("----------------------------------------------------------------");
                        System.out.println();

                        if (getPlayer().getHealth() <= 0) {
                            break diePlayer;
                        }

                        System.out.print("Type any number to keep going:");
                        continueFight = input.nextInt();
                        System.out.println();

                        System.out.println(getPlayer().getName() + "'s turn.");
                        System.out.println("You will gonna attack.");
                        System.out.println();

                        if (getPlayer().getInventory().ispPotion()) {
                            System.out.println("---INFO---");
                            System.out.println("Potions are 1 each and can be used during battle.");
                            System.out.println("You can only use the power potion during the attack round.");
                            System.out.println("The power potion will increase your damage by 3 for this battle.");
                            System.out.println("\nDo you wanna use your power potion? (1- Yes)(No: Any number except 1)");
                            usePotion = input.nextInt();

                            if (usePotion == 1) {
                                mainDamage = getPlayer().getDamage();
                                getPlayer().setDamage(getPlayer().getDamage() + 3);
                                getPlayer().getInventory().setPPotion(false);
                                getPlayer().getShowEquipments()[9] = "null";
                                getPlayer().getEquipments()[9] = "null";
                                usePP = true;
                                System.out.println("Your damage increased from " + mainDamage + " to " + getPlayer().getDamage());
                            } else {
                                System.out.println("No potions were used.");
                            }

                            System.out.print("Type any number to keep going:");
                            continueFight = input.nextInt();
                        }
                        System.out.println();

                        criticAttackChancePlayer = random.nextInt(1, 18);
                        if (getPlayer().getInventory().isUseGodGrace())
                            criticAttackChancePlayer = random.nextInt(1, 6);
                        if (criticAttackChancePlayer == 5) {
                            System.out.println(getPlayer().getName() + " --->>" + (getPlayer().getDamage() * 2) + "  " + getMonster().getName());
                            System.out.println("DAMN! " + getPlayer().getName() + " critically hits and his damage is doubled!!");
                            System.out.print(getMonster().getHealth() + " --> ");
                            getMonster().setHealth(getMonster().getHealth() - (getPlayer().getDamage() * 2));
                            System.out.println(getMonster().getHealth());
                        } else {
                            System.out.println(getPlayer().getName() + " --->>" + getPlayer().getDamage() + " " + getMonster().getName());
                            System.out.println(getPlayer().getName() + " attacked the " + getMonster().getName() + " and hit good damage.");
                            System.out.print(getMonster().getHealth() + " --> ");
                            getMonster().setHealth(getMonster().getHealth() - getPlayer().getDamage());
                            System.out.println(getMonster().getHealth());
                        }

                        if (getPlayer().getHealth() < 0)
                            getPlayer().setHealth(0);
                        if (getMonster().getHealth() < 0)
                            getMonster().setHealth(0);

                        System.out.println();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(getPlayer().getName() + "'s health: " + getPlayer().getHealth());
                        System.out.println(monsterCounter + ". " + getMonster().getName() + "'s health: " + getMonster().getHealth());
                        System.out.println("----------------------------------------------------------------");
                        System.out.println();

                        if (getPlayer().getHealth() <= 0) {
                            break diePlayer;
                        }

                        if (getMonster().getHealth() <= 0) {
                            beatEnemy(monsterCounter);

                            monsterCounter++;

                            if (monsterCounter > enemyCount && getPlayer().getHealth() > 0) {
                                getPlayer().getInventory().setFood(true);
                                break defeatAllEnemy;
                            }

                            continue defeatEnemy;
                        }

                        System.out.print("Type any number to keep going:");
                        continueFight = input.nextInt();

                        System.out.println();
                    }

                    if (getPlayer().getHealth() <= 0) {
                        break diePlayer;
                    }

                    if (getMonster().getHealth() <= 0) {
                        beatEnemy(monsterCounter);
                    }

                    monsterCounter++;

                    if (monsterCounter > enemyCount && getPlayer().getHealth() > 0) {
                        getPlayer().getInventory().setFood(true);
                        break defeatAllEnemy;
                    }
                }
            }

            if (getPlayer().getInventory().isFood()) {
                System.out.println("|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|");
                System.out.println("CONGRATULATIONS! YOU WON " + getPlayer().getName() + "!!!");
                System.out.println("The Food has been added to your inventory.");
                System.out.println("|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|*|");
                System.out.println();
            } else {
                System.out.println("You lost. You have to enter the cave again.");
                System.out.println("You will go back to menu.");
                System.out.println();
            }
        }
    }
}
