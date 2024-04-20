package AdventureGame;

public class Inventory {

    private boolean food;
    private boolean wood;
    private boolean water;
    private boolean mineEnter;
    private boolean gun;
    private boolean armor;
    private boolean hPotion;
    private boolean wPotion;
    private boolean pPotion;
    private boolean godGrace;
    private boolean useGodGrace;
    private boolean gameFinish;

    public Inventory(boolean food, boolean wood, boolean water,boolean gun, boolean armor, boolean hPotion, boolean wPotion, boolean pPotion,boolean mineEnter,boolean godGrace,boolean useGodGrace,boolean gameFinish) {
        this.food = food;
        this.wood = wood;
        this.water = water;
        this.gun = gun;
        this.armor = armor;
        this.hPotion = hPotion;
        this.wPotion = wPotion;
        this.pPotion = pPotion;
        this.mineEnter = mineEnter;
        this.godGrace = godGrace;
        this.useGodGrace = useGodGrace;
        this.gameFinish = gameFinish;
    }

    public boolean isFood() {
        return this.food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWood() {
        return this.wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public boolean isWater() {
        return this.water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isGun() {
        return this.gun;
    }

    public void setGun(boolean gun) {
        this.gun = gun;
    }

    public boolean isArmor() {
        return this.armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    public boolean ishPotion() {
        return this.hPotion;
    }

    public void setHPotion(boolean hPotion) {
        this.hPotion = hPotion;
    }

    public boolean iswPotion() {
        return this.wPotion;
    }

    public void setWPotion(boolean wPotion) {
        this.wPotion = wPotion;
    }

    public boolean ispPotion() {
        return this.pPotion;
    }

    public void setPPotion(boolean pPotion) {
        this.pPotion = pPotion;
    }

    public boolean isMineEnter() {
        return this.mineEnter;
    }

    public void setMineEnter(boolean mineEnter) {
        this.mineEnter = mineEnter;
    }

    public boolean isGodGrace() {
        return this.godGrace;
    }

    public void setGodGrace(boolean godGrace) {
        this.godGrace = godGrace;
    }

    public boolean isUseGodGrace() {
        return this.useGodGrace;
    }

    public void setUseGodGrace(boolean useGodGrace) {
        this.useGodGrace = useGodGrace;
    }

    public boolean isGameFinish() {
        return this.gameFinish;
    }

    public void setGameFinish(boolean gameFinish) {
        this.gameFinish = gameFinish;
    }

    public void itemInfo(){
        System.out.println("Food: " + this.food);
        System.out.println("Water: " + this.water);
        System.out.println("Wood: " + this.wood);
    }
}
