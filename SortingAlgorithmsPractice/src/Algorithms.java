import java.util.Arrays;
public class Algorithms
{
	/* Merge Sort: */
	//Divided into merge(arr[], l, m, r) and sort(arr[], l, r);

	public Algorithms() {
		// TODO Auto-generated constructor stub
	}

	/* merge(): Merges two subarrays of arr[]
	 * Merges two subarray of arr[].
	 * First subarray is arr[left to mid]
	 * Second subarray is arr[mid + 1 to r];
	 */
	void merge(int arr[], int l, int m, int r)
	{
		//find sizes of two subarrays
		 int ls = m - l + 1;
		 int rs = r - m;

		//allocate memory for arrays
		 int[] left = new int[ls];
		 int[] right = new int[rs];

		 //populate left and right arrays
		 for(int i = 0; i < ls; i++)
		 {
			 left[i] = arr[l + i];
		 }
		 for (int j = 0; j < rs; j++)
		 {
			 right[j] = arr[m + 1 + j];
		 }
		 
		 	//sort and merge
		 //left index
		 int i = 0;
		 //right index
		 int j = 0;
		 //arr index
		 int k = 0;
		 
		 while(i < ls && j < rs)
		 {
			 if(left[i] <= right[j])
			 {
				 arr[k] = left[i];
				 i++;
			 }
			 else
			 {
				 arr[k] = right[j];
				 j++;
			 }
			 
			 k++;
		 }
		 
		 //copy any leftover elements
		 while(i < ls)
		 {
			 arr[k] = left[i];
			 i++;
			 j++;			 
		 }
		 
		 while(j < rs)
		 {
			 arr[k] = right[j];
			 j++;
			 k++;
		 }
	}
	
	/* sort(arr[], l, r):
	 * If l < r:
	 * 	sort first and second halves then merge 
	 */
	void mSort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int m = (1+r)/2;
			
			//sort halves
			mSort(arr,l,m);
			mSort(arr,m+1,r);
			
			//merge halves
			merge(arr, l, m, r);
		}
	}
}
