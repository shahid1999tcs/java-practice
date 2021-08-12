package listDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> a = createList();
		System.out.println(a);
		a.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		System.out.println(a);
	}

	private static List<Integer> createList() {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1); // autoboxing
		// numbers.add("shahid");//will give an error
		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;

	}
}
