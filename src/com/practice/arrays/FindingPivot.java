package com.practice.arrays;

public class FindingPivot {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,6,7,1,2};
		
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		while(start <= end) {
			if(arr[mid] > arr[mid+1]) {
				System.out.println("pivot element: "+arr[mid]);
				break;
			}
			if(arr[mid-1] > arr[mid]) {
				System.out.println("pivot element: "+ arr[mid-1]);
				break;
			}
			if(arr[start] >= arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			mid = (start+end)/2;
		}
	}
}
