import java.util.Scanner;

public class JavaKurs {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String nick;
        int line, column;

        System.out.print("Please enter your game nick: ");
        nick = inp.nextLine();

        System.out.print("\nWrite in how many rows and columns Minesweeper will be played(First enter line):");
        line = inp.nextInt();
        column = inp.nextInt();

        MineSweeper mineGame = new MineSweeper(line, column,nick);

        mineGame.mineAreaSizeCheck();
        mineGame.mineAreaFill();
        mineGame.minePlacement();
        mineGame.gameStart();
    }
}