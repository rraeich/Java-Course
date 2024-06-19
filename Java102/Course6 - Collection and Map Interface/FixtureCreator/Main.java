package Fixture_Creator;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedHashSet<String> teams = new LinkedHashSet<>();

        System.out.println("If number of teams smaller than 4, will be 4; if bigger than 14, will be 14.");
        System.out.println("If the number of teams is greater than 14, it will take a very long time for the fixture to be created because it will cycle too many times.");
        System.out.println("How many teams will be in the fixture?(Min:4 - Max: 14)");
        int teamCount = input.nextInt();
        input.nextLine();

        if (teamCount < 4)
            teamCount = 4;

        if (teamCount > 14){
            teamCount = 14;
        }

        for (int i = 1; i <= teamCount; i++) {
            System.out.print(i + ". team name: ");
            String teamName = input.nextLine();
            teams.add(teamName);
            System.out.print("\n");
        }

        if (teamCount % 2 != 0)
            teams.add("Bay");

        Object[] teamsArray = teams.toArray();

        MatchFixture matchFixture = new MatchFixture();

        matchFixture.createFixture(teamsArray);
    }
}