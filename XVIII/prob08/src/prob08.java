import java.util.ArrayList;
import java.util.Scanner;


public class prob08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> cubes = new ArrayList<Integer>();
		ArrayList<Integer> duplicateNums = new ArrayList<Integer>();
		int inputsNum = Integer.parseInt(in.nextLine());
		int empty = 0;
		int noroom = 0;
		int duplicates = 0;
		for (int i = 0; i < inputsNum; i++) {
			String input = in.nextLine();
			String[] split = input.split(" ");
			String name = split[0];
			int room = Integer.parseInt(split[1]);
			if (name.equals("NA")) empty++;
			if (room == 0) noroom++;
			for (int a = 0; a < i; a++) {
				if (duplicateNums.contains(room)) {
				} else if (cubes.get(a) == room) {
					duplicates++;
					a = i;
					duplicateNums.add(room);
				}
			}
			cubes.add(room);
		}
		System.out.println("Empty Cubes: " + empty);
		System.out.println("Duplicate Cube Assignements: " + duplicates);
		System.out.println("Employees without Cube: " + noroom);
	}
}