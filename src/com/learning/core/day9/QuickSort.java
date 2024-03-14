package com.learning.core.day9;

public class QuickSort 
{
	public int partition(int arr[], int lb,int ub)
	{
		int pivot= arr[lb];
		int start = lb;
		int end = ub;
		
		while(start<end)
		{
			start=start+1;
			while(start<=ub && arr[start]<pivot)
			{
				start++;
			}
			while(end>= lb && arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}
	public void quicksort(int arr[], int lb, int ub)
	{
		int loc;
		if(lb<ub)
		{
			loc=partition(arr,lb,ub);
			quicksort(arr,lb,loc-1);
			quicksort(arr,loc+1,ub);
		}
	}
}
