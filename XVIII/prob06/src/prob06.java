import java.util.Scanner;


public class prob06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double d = a*b*c;
		double answer =  Math.round(d/27);
		if (answer == 0){
			answer = 1;
		}
		answer = (int) answer;
		System.out.println(answer);
	}

}
