<<<<<<< HEAD
package com.learning.core.day3;
import java.util.Arrays;
public class D03P03 
{

	public static void main(String[] args) 
	{
		int[] arr= {2,4,5,6,4,5,7,3,2,3,4,7,1,2,3,0,0,0};
		int sum=0;
		for(int i=0; i<15; i++)
		{
			sum+=arr[i];
		}
		arr[15]=sum;
		arr[16]=sum/14;
		int small=arr[0];
		//System.out.println(small);
		for(int i=0; i<15; i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		arr[17]=small;
		System.out.println(Arrays.toString(arr));
	}

}
=======
package com.learning.core.day3;
import java.util.Arrays;
public class D03P03 
{

	public static void main(String[] args) 
	{
		int[] arr= {2,4,5,6,4,5,7,3,2,3,4,7,1,2,3,0,0,0};
		int sum=0;
		for(int i=0; i<15; i++)
		{
			sum+=arr[i];
		}
		arr[15]=sum;
		arr[16]=sum/14;
		int small=arr[0];
		//System.out.println(small);
		for(int i=0; i<15; i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		arr[17]=small;
		System.out.println(Arrays.toString(arr));
	}

}
>>>>>>> 2fe23d38fc0011e70d3e80d5a62599f49f5284b5
