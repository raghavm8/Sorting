import java.io.*; 

class Main
{ 
   

    static void insertionSort(int[] a,int n)
    {
       for(int i=1;i<n;i++)
       {
          int key = a[i];
          int j=i-1;
          while(j>=0 && a[j]>key)
          {
            a[j+1]=a[j];
            j--;
          }
          a[j+1]=key;
       }
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
	    insertionSort(ar, n); 
		System.out.println("Sorted array: "); 
		printArray(ar, n); 
	} 
} 
