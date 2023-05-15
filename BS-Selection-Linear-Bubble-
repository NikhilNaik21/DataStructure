package Searching;

import java.util.Scanner;

public class LinearSearch {
	
	Scanner in = new Scanner(System.in);
	int array[];

	//Taking array from user
	void insertArray(int n)	{
		
		Scanner in = new Scanner(System.in);
		
		
		 array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value at index " + i);
			array[i] = in.nextInt();
		}
	}
	void printArray()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	

	void Linear_search() {
		int size = array.length;
		int flag = 1;

		int value;
		System.out.println("Enter value to search :");
		value = in.nextInt();
		for (int i = 0; i<size; i++){
			if (array[i] == value) {
				System.out.println("Element " + array[i] + " found on position " + (i + 1) + " and at index " + i);
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Not found");
		}
	}
	
	
	//sorting in ascending order using bubble sort
	void BubbleSort()
	{
		int size=array.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1;j++) {
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}
	//logic for binary search
	void BinarySearch(int key, int start , int end)
	{
		if(start<=end)
		{
			int mid = (start +end)/2;
			if(array[mid]==key)
			{
				System.out.println(key +" key found at " + mid);
			}
			else if (array[mid]>key)
			{
				BinarySearch(key,start,mid-1);
				
			}
			
			else if (array[mid]<key)
			{
				BinarySearch(key,mid+1,end);
			}
		}
		else {
			System.out.println("Key Not Found");
		}
		
	}
	
	void SelectionSort(int n)
	{
		int i,j, pos,min;
		for(i=0;i<array.length-1;i++)  //15
		{
			min =array[i]; //15
			pos=i;        //0
			for(j=i+1;j<array.length;j++)   //j=1
			{
				if(array[j]<min)
				{
					min = array[j]; //10
					pos=j;      //1
				}
				
			}
			array[pos]=array[i];
			array[i]=min;
		}
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
	}
	
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int n;
	
		
		do {
		
			System.out.println("\n1.LinearSearch\n2.BinarySearch\n3.BubbleSort\n4.SelectionSort\n0.exit\nEnterchoice :");
			n=in.nextInt();
			switch(n)
			{
			case 1 :
				LinearSearch obj = new LinearSearch();
				System.out.println("Enter Size of array : ");
				int size = in.nextInt();
				obj.insertArray(size);
				obj.Linear_search();
				n=0;
				break;
				
			case 2:
				LinearSearch obj1= new LinearSearch();
				System.out.println("Enter Size of array: ");
				int size1 = in.nextInt();
				obj1.insertArray(size1);
			    obj1.BubbleSort();
			
			System.out.println("Enter key");
			int key =in.nextInt();
			
			obj1.BinarySearch(key,0, size1-1);
				n=0;
			break;
			
			case 3:
				LinearSearch obj4 = new LinearSearch();
				System.out.println("Enter size of array :");
				int size3 =in.nextInt();
				obj4.insertArray(size3);
				System.out.println("original array :");
				obj4.printArray();
				System.out.println("\nAfter Bubble sort : ");
				obj4.BubbleSort();
				n=0;
				break;
			
			case 4:
				LinearSearch obj2= new LinearSearch();
				System.out.println("Enter size of array :");
				int size2=in.nextInt();
				obj2.insertArray(size2);
				System.out.println("original array :");
				obj2.printArray();
				
				System.out.println("\nAfter selection sort : ");
				obj2.SelectionSort(size2);
				 n=0;
				break;
				
			case 0:
				
				System.out.println("Exiting.....");
				
			}
			
		}while(n!=0);
		
		

	}

}
