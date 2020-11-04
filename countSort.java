import java.io.*; 

class Main
{ 
	
	static void countSort(int a[], int n) 
	{ 
	   int[] o = new int[n];
	   int[] count = new int[512];
	   
	   for(int i=0;i<n;i++)
	    count[i] = 0;
	    
	   for(int i=0;i<n;i++)
	       count[a[i]]++;
	   
	   for(int i=1;i<512;i++)
	      count[i] += count[i-1];
	      
	   for(int i=n-1;i>=0;i--)
	    {
	        o[count[a[i]]-1] = a[i];
	        count[a[i]]--;
	    }
	    for(int i=0;i<n;i++)
	        a[i] = o[i];
	   
	} 
	static void printArray(int arr[], int size) 
	{ 
		int i; 
		for (i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	
	public static void main(String args[]) 
	{ 
		int ar[] = { 64, 34, 25, 12, 22, 11, 90 }; 
		int n = ar.length; 
	    	countSort(ar, n); 
		System.out.println("Sorted array: "); 
		printArray(ar, n); 
	} 
} 
