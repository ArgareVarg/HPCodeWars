import java.util.ArrayList;
import java.util.Scanner;


public class prob07 {
	public static void main(String[] args) {
		double p;
		double r;
		boolean stop = false;
		ArrayList <Double> array = new ArrayList <Double> ();
		Scanner in = new Scanner(System.in);
		for(int i = 0; !stop; i++){
			p = in.nextDouble();
			if(p == 0){
				stop = true;
			}
			double rCubed = p*p;
			r = Math.pow(rCubed, (1.0)/3.0);
			array.add(r);
		}
		for(int j = 0; j < array.size() - 1;j++){
			System.out.println(array.get(j));
			
		}
	}
}
