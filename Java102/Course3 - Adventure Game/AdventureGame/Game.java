package AdventureGame;

import java.util.Scanner;

public class Game {

    private Player player;
    private Location location;
    private final SafeHouse safeHouse;
    private final ToolStore toolStore;
    private final Forest forest;
    private final Mine mine;
    private final Cave cave;
    private final River river;

    Scanner input = new Scanner(System.in);

    public Game(Player player, SafeHouse safeHouse, ToolStore toolStore, Forest forest, Mine mine, Cave cave, River river) {
        this.player = player;
        this.safeHouse = safeHouse;
        this.toolStore = toolStore;
        this.forest = forest;
        this.mine = mine;
        this.cave = cave;
        this.river = river;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void startGame() {

        System.out.println("TURKISH LANGUAGE:");
        System.out.println("********** Lastvenus'un Düşler Macerası'na HOŞGELDİN ! **********");
        System.out.println("Lastvenus'un Düşler Macerası: Bu oyunun amacı, tüm savaş bölgelerindeki rakipleri yenmek ve oyunu kazanmaktır.");
        System.out.println("4 savaş bölgesi bulunmaktadır(Mağara,Nehir,Maden,Orman). Her bir bölgenin kendine özel düşmanları vardır.");
        System.out.println("Amacın, maden zorunlu olmamak koşuluyla, tüm bölgelerdeki düşmanları öldürerek özel kurtuluş eşyalarını almaktır.");
        System.out.println("Maden yalnızca rastgele para,zırh veya silah düşürecektir. Diğer 3 bölgede ise ateş,su ve odun özel eşyaları düşecektir.");
        System.out.println("Her bölgeye kazandığın sürece yalnızca bir kez girebilir ve 3 özel eşyayıda alarak Güvenli Eve dönersen oyunu kazanırsın.");
        System.out.println("Eğer tüm özel eşyaları almış ve oyunu bitirmişsen, tekrar tüm bölgeler tekrar açılır ve oynamaya devam edebilirsin.");
        System.out.println("Bir bölgede kaybettiğinde canının yenilenmesi için Güvenli Eve gitmelisin. Kazanana kadar bölgeye girebilirsin.");
        System.out.println("Oyunun başında hasara, sağlığa ve paraya göre bir karakter seçersin. Bunlar okçu,samuray,şövalye ve vikingtir.");
        System.out.println("Ayrıca bir eşya dükkanı bulunmaktadır ve buradan silah, zırh veya savaş esnasında kullanabileceğin iksirler alabilirsin.");
        System.out.println("Her saldırıda kritik vurma(x2 hasar) şansın bulunmaktadır (%5,88).");
        System.out.println("Düşmanlardan küçük bir ihtimalle ekstra zırh,silah veya para düşürme ihtimalin var. (Yılanlar için bu oran daha yüksektir.)");
        System.out.println("Güvenli eve her döndüğünde canın otomatik yenilenir.");
        System.out.println("\n~~~~~~~~~~~~~~~~~~İyi Şanslar ve İyi Eğlenceler Maceracı!~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println();

        System.out.println("ENGLISH LANGUAGE:");
        System.out.println("********** WELCOME to Lastvenus's Dreams Adventure ! **********");
        System.out.println("Lastvenus's Dreams Adventure: This game's purpose is to defeat the enemy(monsters) in all war zones and win the game.");
        System.out.println("There are 4 war zones (Cave, River, Mine, Forest). Each area has its own special enemies.");
        System.out.println("Your purpose is to get special escape items by killing enemies in all areas, provided that mining is not required(mine is optional).");
        System.out.println("The mine will only randomly drop coins, armor or weapons. In the other 3 locations, fire, water and wood special escape items will drop.");
        System.out.println("You can only enter each zone once as long as you win, and if you return to the Safe House with all 3 special items, you win the game..");
        System.out.println("If you have received all the special items and finished the game, all regions will open again and you can continue playing.");
        System.out.println("When you lose in an area, you must go to the Safe House to regenerate your health. You can enter the zone until you win.");
        System.out.println("At the beginning of the game you choose a character based on damage, health and money. These are archer, samurai, knight and viking.");
        System.out.println("There is also an item shop where you can buy weapons, armor or potions that you can use during battle.");
        System.out.println("You have a critical hit (x2 damage) chance with each attack (5.88%).");
        System.out.println("There is a small chance that all enemies will drop extra armor, weapons or money. (This rate is higher for snakes)");
        System.out.println("Your health automatically regenerates every time you return to the safe house.");
        System.out.println("\n~~~~~~~~~~~~~~~~~~Good Luck and Have Fun Adventurer!~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println();

        System.out.print("When you want to start game, press any number:");
        int startGame = input.nextInt();
        System.out.println();
        System.out.println();

        System.out.println("*************************************************************************************************************************");
        System.out.println("TURKISH:");
        System.out.println("Bu soru yalnızca bir kez sorulacaktır.");
        System.out.println("Oyunda hiçbir yerde bahsedilmeyen bir easter egg var, nasıl elde edeceğini bilmek ister misin?");
        System.out.println("Bilmek istemiyorsanız 'yes' dışında bir şey yazın, oyunda bunu bulma şansınız çok çok düşük.");
        System.out.println("Sana sadece easter eggi nasıl elde edebileceğini söyleyeceğim. Ne olduğunu kendin bul :)");
        System.out.println("Bilmek istiyor musun? (istiyorsan 'yes' yaz.)");
        System.out.println();
        System.out.println("ENGLISH:");
        System.out.println("This question will only be asked once.");
        System.out.println("There is an easter egg that is not mentioned anywhere in the game, do you want to know how you will get easter egg?");
        System.out.println("If you don't want to know, write something other than 'yes', your chances of finding this in the game are very, very low.");
        System.out.println("I will just tell you how to get the easter egg. Find to yourself what it is :)");
        System.out.println("Do you wanna know that? (if u want type yes):");
        System.out.println("*************************************************************************************************************************");
        String easterEgg = input.next();
        System.out.println();

        if (easterEgg.equals("yes")){
            System.out.println();
            System.out.println("TURKISH:");
            System.out.println("Oyunda sadece düşmanlardan yüzde 0.08 şansla düşen(yılanlarda 0.24) bir şey var :)");
            System.out.println();
            System.out.println("ENGLISH:");
            System.out.println("There is something in the game that only drops from enemies with a 0.08 percent chance (0.24 for snakes).\n");
            System.out.println();
            System.out.println();
        }

        player.selectCharacter();

        endGame:
        while (true) {
            short locationID;
            if (getPlayer().getInventory().isGameFinish())
                System.out.println("0- QuitGame");

            System.out.println("""          
                    1- SafeHouse
                    2- ToolStore
                    3- Forest(Battle Area)
                    4- Cave(Battle Area)
                    5- River(Battle Area)
                    6- Mine(Optional Battle Area)""");
            System.out.println("\n" + player.getName() + ", where did you want to go?");
            locationID = input.nextShort();

            switch (locationID) {
                case 0:
                    if (getPlayer().getInventory().isGameFinish()) {
                        System.out.println("See you Adventurer!");
                        break endGame;
                    }
                    System.out.println("You entered wrong number. Try again.");
                    break;
                case 1:
                    safeHouse.enterLocation();
                    break;
                case 2:
                    toolStore.enterLocation();
                    break;
                case 3:
                    if (!getPlayer().getInventory().isWood() || getPlayer().getInventory().isGameFinish()) {
                        forest.enterBattleLocation();
                    } else {
                        System.out.println("You cannot re-enter an area where you earned the special item.");
                        System.out.println("Go enter another area.");
                    }
                    break;
                case 4:
                    if (!getPlayer().getInventory().isFood() || getPlayer().getInventory().isGameFinish()) {
                        cave.enterBattleLocation();
                    } else {
                        System.out.println("You cannot re-enter an area where you earned the special item.");
                        System.out.println("Go enter another area.");
                    }
                    break;
                case 5:
                    if (!getPlayer().getInventory().isWater() || getPlayer().getInventory().isGameFinish()) {
                        river.enterBattleLocation();
                    } else {
                        System.out.println("You cannot re-enter an area where you earned the special item.");
                        System.out.println("Go enter another area.");
                    }
                    break;
                case 6:
                    if (!getPlayer().getInventory().isMineEnter() || getPlayer().getInventory().isGameFinish()) {
                        mine.enterBattleLocation();
                    } else {
                        System.out.println("You cannot re-enter an area where you earned the special item.");
                        System.out.println("Go enter another area.");
                    }
                    break;
                default:
                    System.out.println("You entered wrong number. Try again.");
                    break;
            }
        }
    }
}
