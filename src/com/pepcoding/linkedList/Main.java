package com.pepcoding.linkedList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] v = new int[] {19,11};
		  Arrays.sort(v);
		  System.out.println(Arrays.toString(v));
	        int n =v.length;
	        if(n%2 == 0){
	          int first =   v[n/2];
	          int second = v[n/2-1];
	          System.out.println((first+second)/2); 
	        }else{
	            //for odd
	            System.out.println(v[n/2]); 
	        }
	}
	// Node class object
	public static class Node {
		int data;
		Node next;
	}

	// pointers to do operation in LL
	public static class LinkedList {
		Node head;
		Node tail;
		int size;
	}
}
