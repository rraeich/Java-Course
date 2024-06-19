package Fixture_Creator;

import java.util.Arrays;
import java.util.Random;

public class MatchFixture {

    public void createFixture(Object[] arrayOfTeams) {
        Random r = new Random();
        Integer[] controlList = new Integer[arrayOfTeams.length];
        boolean[][] matchControl = new boolean[arrayOfTeams.length][arrayOfTeams.length];
        int randomNumber_two, randomNumber_one, fixtureMatchCounter, countOfMatch = arrayOfTeams.length / 2;
        int teamCount = arrayOfTeams.length, h = 0, loopCounter = 0;
        boolean isFixtureCreated;

        Integer[] matchList = new Integer[4 * countOfMatch * (arrayOfTeams.length - 1)];
        Arrays.fill(matchList, null);

        Integer[] lastNumbers = new Integer[2];

        reSelect:
        for (int i = 0; i < (arrayOfTeams.length - 1); i++) {
            loopCounter = 0;
            isFixtureCreated = false;
            fixtureMatchCounter = 0;
            Arrays.fill(controlList, null);
            Arrays.fill(lastNumbers, null);
            int u = 0;

            soManyError:
            while (!isFixtureCreated) {
                loopCounter++;
                if (loopCounter == 15000) {
                    for (int c = 0; c < arrayOfTeams.length; c++) {
                        for (int q = 0; q < arrayOfTeams.length; q++) {
                            matchControl[c][q] = false;
                        }
                    }
                    Arrays.fill(matchList, null);
                    h = 0;
                    i = -1;
                    continue reSelect;
                }
                randomNumber_two = r.nextInt(0, arrayOfTeams.length);
                randomNumber_one = r.nextInt(0, arrayOfTeams.length);

                if (randomNumber_two == randomNumber_one)
                    continue;

                if ((fixtureMatchCounter == countOfMatch - 1) && i > 0 && u == 0) {
                    int x = 0;
                    for (int b = 0; b < arrayOfTeams.length; b++) {
                        if (controlList[b] == null) {
                            lastNumbers[x] = b;
                            x++;
                        }
                    }
                    u++;

                    if (matchControl[lastNumbers[0]][lastNumbers[1]] || matchControl[lastNumbers[1]][lastNumbers[0]]) {
                        for (int c = 0; c < arrayOfTeams.length; c++) {
                            for (int q = 0; q < arrayOfTeams.length; q++) {
                                matchControl[c][q] = false;
                            }
                        }
                        Arrays.fill(matchList, null);
                        h = 0;
                        i = -1;
                        continue reSelect;
                    }
                }

                if ((controlList[randomNumber_one] == null && controlList[randomNumber_two] == null) && !matchControl[randomNumber_one][randomNumber_two] && !matchControl[randomNumber_two][randomNumber_one]) {

                    matchList[h * 2] = randomNumber_one;
                    matchList[(h * 2) + 1] = randomNumber_two;
                    matchList[(h * 2) + (2 * countOfMatch * (teamCount - 1))] = randomNumber_two;
                    matchList[((h * 2) + 1) + (2 * countOfMatch * (teamCount - 1))] = randomNumber_one;

                    matchControl[randomNumber_one][randomNumber_two] = true;

                    controlList[randomNumber_one] = randomNumber_one;
                    controlList[randomNumber_two] = randomNumber_two;
                    fixtureMatchCounter++;
                    h++;
                }

                if (fixtureMatchCounter == countOfMatch) {
                    int z = 0;
                    for (Integer integer : controlList) {
                        if (integer == null) {
                            z++;
                        }
                    }
                    if (z == 0) {
                        isFixtureCreated = true;
                    }
                }
            }
        }
        printFixture(arrayOfTeams, matchList, teamCount, countOfMatch);
    }

    public void printFixture(Object[] arrayOfTeams, Integer[] matchList, int teamCount, int countOfMatch) {
        int listCounter = 0;
        for (int i = 1; i <= (teamCount - 1) * 2; i++) {
            System.out.println(i + ". WEEK");
            for (int j = 0; j < countOfMatch; j++) {
                System.out.println(arrayOfTeams[matchList[listCounter]] + " vs " + arrayOfTeams[matchList[listCounter + 1]]);
                listCounter = listCounter + 2;
            }
            System.out.println();
        }
    }
}
