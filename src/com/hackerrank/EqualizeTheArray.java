package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
 * Equalize the Array
Karl has an array of integers. He wants to reduce the array until all remaining elements are equal. Determine the
minimum number of elements to delete to reach his goal.
For example, if his array is , we see that he can delete the elements and leaving .
He could also delete both twos and either the or the , but that would take deletions. The minimum number of
deletions is .
Function Description
Complete the equalizeArray function in the editor below. It must return an integer that denotes the minimum number of
deletions required.
equalizeArray has the following parameter(s):
arr: an array of integers
Input Format
The first line contains an integer , the number of elements in .
The next line contains space-separated integers .
Constraints
Output Format
Print a single integer that denotes the minimum number of elements Karl must delete for all elements in the array to be
equal.
Sample Input
5
3 3 2 1 3
Sample Output
2
Explanation
Array . If we delete and , all of the elements in the resulting array,
, will be equal. Deleting these elements is minimal. Our only other options would be to delete elements
to get an array of either or .
 */
public class EqualizeTheArray {

	public static void main(String[] args) {
		int[] arr = {3 ,3 ,2 ,1 ,3 };
		int numberOfDeletion = deleteNoOfElementsToEqualTheArray(arr);
	}

	private static int deleteNoOfElementsToEqualTheArray(int[] arr) {
		//1 will convert array to list
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//2 remove count of each and store in map
		Map<Integer, Integer> map = new HashMap<>();
		list.stream().forEach(e -> {
			if(map.containsKey(e)) {
				Integer count = map.get(e);
				map.put(e, count+1);
			}else {
				map.put(e, 1);
			}
		});
		System.out.println(map);
		
		int max_value = 0;
		int value = 0;
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue() > max_value) {
				max_value = m.getValue();
				value = m.getKey();
			}
		}
		System.out.println("Highest freq value in array "+ value);
		int total_del = 0;
//		for (Entry<Integer, Integer> m : map.entrySet()) {
//			if(m.getKey() != value) {
//				total_del = total_del+m.getValue();
//			}
//		}
		total_del = list.size()-max_value;
		System.out.println("Total deletion needed to equal the array is "+ total_del);
		return total_del;
	}
}
