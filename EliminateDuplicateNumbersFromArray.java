package gitJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminateDuplicateNumbersFromArray {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 1, 4, 3, 5 };
		ArrayList<Integer> al1 = new ArrayList<>();

		for (Integer e : arr) {
			if (!al1.contains(e)) {
				al1.add(e);
			}
		}
		int[] outputArray = new int[al1.size()];
		int i = 0;
		for(int e : al1)
		{
			outputArray[i] = e;
			i++;
		}
		System.out.println(Arrays.toString(outputArray));
	}

}
