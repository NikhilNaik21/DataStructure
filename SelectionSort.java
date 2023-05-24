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
