import java.io.*; 

class Main
{ 
	
	static int[] bubbleSort(int a[], int n) 
	{ 
	   boolean swap = false;  
	   for(int i=0;i<n-1;i++)
	   {
	       swap = false;
	       for(int j=0;j<n-i-1;j++)
	       {
	           if(a[j]>a[j+1])
	           {
	               int t = a[j];
	               a[j] = a[j+1];
	               a[j+1] = t;
	               swap = true;
	           }
	       }
	       if(swap == false)
	        break;
	   }
	   return a;
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
	    int arr[] =	bubbleSort(ar, n); 
		System.out.println("Sorted array: "); 
		printArray(arr, n); 
	} 
} 
