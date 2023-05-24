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
	
