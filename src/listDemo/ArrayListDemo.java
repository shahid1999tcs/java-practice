package listDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		// sortList(a);
		//filterList(numbers);
		//add(numbers);
		otherOps(numbers);
	}

	private static void otherOps(List<Integer> numbers) {
		// TODO Auto-generated method stub
		System.out.println(numbers);
		//numbers.remove(0);
		numbers.add(1,20);
		System.out.println(numbers);
	}

	private static void add(List<Integer> numbers) {
		// TODO Auto-generated method stub
		Optional<Integer> sum = numbers.stream().reduce((Integer num1, Integer num2) -> {
			System.out.println(num1 + ", "+ num2);
			return num1 + num2;
		});
		System.out.println(sum);
	}

	/**
	 * Method to filter
	 * 
	 * @param numbers
	 */
	private static void filterList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.forEach((number) -> {
			System.out.println(number % 2 == 0);
		});
		List<Integer> filtered = numbers.stream().filter((number) -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(filtered);
	}

	private static void sortList(List<Integer> a) {
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
