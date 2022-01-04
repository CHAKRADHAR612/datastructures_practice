package com.dsa_algos.bubblesort;

public class BubbleSort_own {

	public static void main(String[] args) {
		//declaring the array
		int[] arr= {20,35,-11,21,9,9,23};
		//unsortedIndex is the index where the array is till unsorted
		int unsortedIndex=arr.length-1;
		//till the unsorted index becomes 0 the while loop runs
		while(unsortedIndex>0) {			
			//for every traversal the last index that is the unsorted index element will be sorted
			for(int i=0;i<unsortedIndex;i++) {
				//ith element will be compared to i+1th element if i>i+1 then swap happens
				if(arr[i]>arr[i+1]) {
					/*int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;*/
					swap(arr,i,i+1);
				}
			}
			unsortedIndex--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		if(i==j) {
			return;
		}
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
