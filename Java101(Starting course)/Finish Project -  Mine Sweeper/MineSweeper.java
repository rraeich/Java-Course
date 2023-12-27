import java.util.Scanner;
import java.util.Random;

public class MineSweeper {

    Scanner inp = new Scanner(System.in);
    Random r = new Random();

    int line, column;
    int mineNumber;
    int counter = 0;
    int finishCounter = 0;
    int randomLine, randomColumn;
    int selectLine, selectColumn;
    int controlNumber = 0;

    String nick;
    String strCounter;
    String[][] gamerArea;
    String[][] mineArea;
    String[][] controlArea;
    String[][] finishArea;
    String[][] controlMine;

    MineSweeper(int line, int column,String nick) {
        this.nick = nick;
        this.line = line;
        this.column = column;
        gamerArea = new String[this.line][this.column];
        mineArea = new String[this.line][this.column];
        controlArea = new String[this.line][this.column];
        finishArea = new String[this.line][this.column];
        controlMine = new String[this.line][this.column];
    }

    void mineAreaSizeCheck() {

        if (this.line < 2 || this.column < 2) {
            while (true) {
                System.out.println("MineSweeper Area's should bigger than or equal to 2x2.");
                System.out.print("Write in how many rows and columns Minesweeper will be played(First enter line):");
                this.line = inp.nextInt();
                this.column = inp.nextInt();

                if (this.line >= 2 && this.column >= 2) {
                    break;
                }
            }
        }
    }

    void mineAreaFill() {

        for (int i = 0; i < this.line; i++) {
            for (int j = 0; j < this.column; j++) {
                this.gamerArea[i][j] = "-";
                this.mineArea[i][j] = "-";
                this.controlArea[i][j] = "-";
                this.finishArea[i][j] = "-";
                this.controlMine[i][j] = "-";
            }
        }
    }

    void minePlacement() {

        this.mineNumber = (this.line * this.column) / 4;

        for (int i = 0; i < mineNumber; i++) {
            randomLine = r.nextInt(this.line);
            randomColumn = r.nextInt(this.column);

            if (this.controlMine[randomLine][randomColumn].equals("*")) {
                i--;
                continue;
            }

            this.controlMine[randomLine][randomColumn] = "*";

            mineArea[randomLine][randomColumn] = "*";
            finishArea[randomLine][randomColumn] = "*";
        }
    }

    void gameStart() {

        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<WELCOME TO MİNE SWEEPER!>>>>>>>>>>>>>>>>>>>>>");

        while (true) {

            System.out.println("--------------------------------------------------------------------");
            for (String[] i : gamerArea) {
                for (String j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------");

            System.out.print("Please enter a line: ");
            selectLine = inp.nextInt();

            System.out.print("Please enter a column: ");
            selectColumn = inp.nextInt();

            if ((selectLine > this.line || selectLine < 0) || (selectColumn > this.column || selectColumn < 0)) { // Point without area
                while (true) {

                    System.out.println("!!Please select a point within the area. Try again.");

                    System.out.print("Please enter a line: ");
                    selectLine = inp.nextInt();

                    System.out.print("Please enter a column: ");
                    selectColumn = inp.nextInt();

                    if ((selectLine <= this.line && selectLine >= 0) && (selectColumn <= this.column && selectColumn >= 0)) {
                        break;
                    }
                }
            }

            if (mineArea[selectLine - 1][selectColumn - 1].equals("*")) {  // Game Over

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Mine locations:");
                for (String[] i : mineArea) {
                    for (String j : i) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("GAME OVER! You lose " + this.nick + "!");
                break;
            }

            counter = 0;                                                   // Writing number

            for (int i = 0, y = -1; i < 3; i++, y++) {

                if ((selectLine - 1 + y) < 0 || (selectLine - 1 + y) > this.line - 1) {
                    continue;
                }

                for (int j = 0, x = -1; j < 3; j++, x++) {
                    if (y == 0 && x == 0) {
                        continue;
                    }

                    if ((selectColumn - 1 + x) < 0 || (selectColumn - 1 + x) > this.column - 1) {
                        continue;
                    }

                    if (mineArea[selectLine - 1 + y][selectColumn - 1 + x].equals("*")) {
                        counter++;
                    }
                }
            }

            strCounter = counter + "";
            gamerArea[selectLine - 1][selectColumn - 1] = strCounter;
            finishArea[selectLine - 1][selectColumn - 1] = "*";

            controlNumber++;                                         // Same point selection control
            if (controlNumber == 1) {
                controlArea[selectLine - 1][selectColumn - 1] = "!";
                continue;
            }

            if (controlArea[selectLine - 1][selectColumn - 1].equals("!")) {
                System.out.println("!!You have already chosen this point. Try again.");
            }

            controlArea[selectLine - 1][selectColumn - 1] = "!";
            finishCounter = 0;
            for (String[] k : finishArea) {
                for (String l : k) {
                    if (l.equals("*")) {
                        finishCounter++;
                    }
                }
            }

            if (finishCounter == (this.line * this.column)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                for (String[] i : gamerArea) {
                    for (String j : i) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("CONGRATULATIONS! You Win " + this.nick + "!");
                System.out.println("Number of the mines: "+ this.mineNumber);
                break;
            }
        }
    }
}
