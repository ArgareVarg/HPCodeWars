import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class prob09 {

    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static Integer[] rankings = {0,0,0,0,0};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] split = line.split("");
            Integer team = Integer.parseInt(split[0]);
            Integer score = Integer.parseInt(split[1]);
            if (map.get(team) == null) {
                map.put(team, score);
                list.add(team);
            } else {
                map.put(team, map.get(team) + score);
            }
            if (team == 0) {
                computeRanks();
                printRanks();
                System.exit(0);
            }
        }
    }

    static void computeRanks() {
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) > map.get(rankings[0])) {
                rankings[4] = rankings[3];
                rankings[3] = rankings[2];
                rankings[2] = rankings[1];
                rankings[1] = rankings[0];
                rankings[0] = list.get(i);
            } else if (map.get(list.get(i)) > map.get(rankings[1])) {
                rankings[4] = rankings[3];
                rankings[3] = rankings[2];
                rankings[2] = rankings[1];
                rankings[1] = list.get(i);
            } else if (map.get(list.get(i)) > map.get(rankings[2])) {
                rankings[4] = rankings[3];
                rankings[3] = rankings[2];
                rankings[2] = list.get(i);
            } else if (map.get(list.get(i)) > map.get(rankings[3])) {
                rankings[4] = rankings[3];
                rankings[3] = list.get(i);
            } else if (map.get(list.get(i)) > map.get(rankings[4])) {
                rankings[4] = list.get(i);
            }
        }
    }

    static void printRanks() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d %d %d\n", i+1, rankings[i], map.get(rankings[i]));
        }
    }
}
