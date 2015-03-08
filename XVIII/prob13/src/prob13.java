import java.util.ArrayList;
import java.util.Scanner;


public class prob13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.next();
		int size = in.nextInt();
		
		int place = 0;
		int[] placeIndex = new int[size];
		int[] add = new int[size];
		
		ArrayList<Integer> numbers= new ArrayList(size);
		int tempIndex = 0;
		String tempString = "";
		int tempNum = 0;
		String tempBin = "";
		
		for(int i = 0; i < size; i++){
			for(int j = tempIndex; j < num.length(); j++) {
				tempString = num.substring(tempIndex, j + 1 + add[i]);
				tempNum = Integer.parseInt(tempString);
				tempBin = Integer.toBinaryString(tempNum);
				if(isAlternating(tempBin)) {
					numbers.add(tempNum);
					tempIndex = j + 1;
					placeIndex[i] = tempIndex;
					j = num.length();
					place++;
				}
				
			}
			if(place != i){
				i--;
				add[i]++;
				j = placeIndex[i];
				i--;
			}
		}
		for(int i = 0; i < size; i++){
			System.out.println(numbers.get(i));
		}

	}
	private static boolean isAlternating(String tempString){
		boolean isAlternating = false;
		for(int i = 0; i < tempString.length() - 1; i++){
			if(tempString.equals("1") || tempString.equals("0")){
				return true;
			}
			if(tempString.charAt(i) == tempString.charAt(i + 1)){
				isAlternating = false;
				i = tempString.length();
			} else {
				isAlternating = true;
			}
		}
		return isAlternating;
	}

}
