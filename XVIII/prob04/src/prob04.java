import java.util.Scanner;
import java.util.ArrayList;

public class prob04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> pairs = new ArrayList<String>();
		boolean stop = true;
		for (int i = 0; stop; i++){
			pairs.add(in.nextLine());
			if (pairs.get(i).equals("0 0")){
				stop = false;
			}
		}
		for (int i = 0; i < pairs.size()-1; i++) {
			String[] split = pairs.get(i).split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			System.out.println(a*b);
		}
		in.close();
	}

}
