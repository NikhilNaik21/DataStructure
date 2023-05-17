
package Assignment1;

import java.util.Scanner;




public class AssignmentQ1 {

	Scanner in = new Scanner(System.in);
	int array[];
	static int count=0;
	static int count1=0;
	static int count2=0;
	// Taking array from user
	void insertArray(int n) {

		Scanner in = new Scanner(System.in);

		array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value at index " + i);
			array[i] = in.nextInt();
		}
	}

	void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	void Linear_search() {
		int size = array.length;
		int flag = 1;

		int value;
		System.out.println("Enter value to search :");
		value = in.nextInt();
		for (int i = 0; i < size; i++) {
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

	// sorting in ascending order using bubble sort
	void BubbleSort() {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	// logic for binary search
	void BinarySearch(int key, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			count++;
			if (array[mid] == key) {
				System.out.println(key + " key found at " + (mid + 1));
			} else if (array[mid] > key) {
				BinarySearch(key, start, mid - 1);

			}

			else if (array[mid] < key) {
				BinarySearch(key, mid + 1, end);
			}
		} else {
			System.out.println("Key Not Found");
		}

	}

	void SelectionSort(int n) {
		int i, j, pos, min;
		for (i = 0; i < array.length - 1; i++) // 15
		{
			min = array[i]; // 15
			pos = i; // 0
			for (j = i + 1; j < array.length; j++) // j=1
			{
				if (array[j] < min) {
					min = array[j]; // 10
					pos = j; // 1
					count1++;
				}

			}
			array[pos] = array[i];
			array[i] = min;
			count2++;
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	void InsertionSort() {
		int i, j, New_element;

		for (i = 0; i < array.length - 1; i++) {
			// Storing new element --> of index i+1
			New_element = array[i + 1];
			// initially j= 0+1 = 1
			j = i + 1;

			// 10 5 1 8 --> j=1>0 && value at j-1 = 10 > new(5) go in loop
			while (j > 0 && array[j - 1] > New_element) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = New_element;
		}

		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	void QuickSort(int start, int end) // start =0 //end =array.length-1
	 {
	      int i,j,pivot;
	      i=start; j=end;pivot=start;
	      while(i<j)
	      {
	          while(array[i]<array[pivot])
	              i++;
	          while(array[j]>array[pivot])
	              j--;
	          if(i<j)
	          {
	              int t=array[i];
	              array[i]=array[j];
	              array[j]=t;
	          }
	      }
	      if(i<end)
	          QuickSort(i+1,end);
	      if(start<j)
	    	  QuickSort(start,j-1);
	  }

	
	void MergeSort() {
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		do {

			System.out.println(
					"\n1.Linear Search\n2.Binary Search\n3.Bubble Sort\n4.Selection Sort\n5.Insertion Sort\n6.Quick Sort\n0.exit\nEnterchoice :");
			n = in.nextInt();

			switch (n) {
			case 1:
				AssignmentQ1 obj = new AssignmentQ1();
				System.out.println("Enter Size of array : ");
				int size = in.nextInt();
				obj.insertArray(size);
				obj.Linear_search();
				// n=0;
				break;

			case 2:
				AssignmentQ1 obj1 = new AssignmentQ1();
				System.out.println("Enter Size of array: ");
				int size1 = in.nextInt();
				obj1.insertArray(size1);
				System.out.println("Sorted Array ");
				obj1.BubbleSort();

				System.out.println("\nEnter key");
				int key = in.nextInt();

				obj1.BinarySearch(key, 0, size1 - 1);
				System.out.println("Total no of pass: "+count);
				n = 0;
				break;

			case 3:
				AssignmentQ1 obj4 = new AssignmentQ1();
				System.out.println("Enter size of array :");
				int size3 = in.nextInt();
				obj4.insertArray(size3);
				System.out.println("original array :");
				obj4.printArray();
				System.out.println("\nAfter Bubble sort : ");
				obj4.BubbleSort();
			//	n = 0;
				break;

			case 4:
				AssignmentQ1 obj2 = new AssignmentQ1();
				System.out.println("Enter size of array :");
				int size2 = in.nextInt();
				obj2.insertArray(size2);
				System.out.println("original array :");
				obj2.printArray();

				System.out.println("\nAfter selection sort : ");
				obj2.SelectionSort(size2);
				System.out.println("Total no of swaps :"+count1);
				System.out.println("total no of sorting: "+count2);
				n = 0;
				break;

			case 5:
				AssignmentQ1 obj3 = new AssignmentQ1();
				System.out.println("Enter size of array :");
				int size5 = in.nextInt();
				obj3.insertArray(size5);
				obj3.InsertionSort();
				
			case 6:
				AssignmentQ1 obj6 = new AssignmentQ1();
				System.out.println("Enter size of array :");
				int size6 = in.nextInt();
				obj6.insertArray(size6);
				obj6.QuickSort(0, size6-1);
				break;
			case 0:

				System.out.println("Exiting.....");

			}

		} while (n != 0);

	}


}
