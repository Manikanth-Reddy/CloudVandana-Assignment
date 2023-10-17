
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayShuffler {

	public static void main(String[] args) {
		//Array Input
		int[] array = { 1, 2, 3, 4, 5 ,6,7,8,9,0};
		
		// Replace this with your input array
		shuffleArray(array);
		System.out.println("Shuffled array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	private static void shuffleArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for(int ele:array)
			list.add(ele);
		Collections.shuffle(list);
		// shuffle is a method from collections class
		for (int i=0;i<array.length;i++) {
			array[i]=list.get(i);
			// adding elements from list to array
		}

	}

}