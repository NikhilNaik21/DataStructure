
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
