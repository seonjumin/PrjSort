package sort;

import java.util.Arrays;

public class TestArraySort {

	public static void main(String[] args) {
		int [] arr1 = new int[] {1,5,3,2,4};
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//람다식은 class 대상으로만 가능
		// Arrays.sort(arr1, (a,b) -> b-a); //에러
		Integer [] arr2 = {1,5,3,2,4};
		Arrays.sort(arr2, (a,b) -> b-a);
		System.out.println(Arrays.toString(arr2));
		
		String [] names = {"라나","사나","가나","하나"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, (a,b) -> a.compareTo(b));
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, (a,b) -> b.compareTo(a));
		System.out.println(Arrays.toString(names));
	}

}
