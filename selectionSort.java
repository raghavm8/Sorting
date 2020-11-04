import java.io.*; 

class Main
{ 
   
    static void selectionSort(int[] a,int n)
    {
       int min=0;
       for(int i=0;i<n-1;i++)
       {
           min = i;
           for(int j=i+1;j<n;j++)
           {
               if(a[j]<a[min])
                min = j;
           }
           int t = a[min];
           a[min] = a[i];
           a[i] = t;
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
	    selectionSort(ar, n); 
		System.out.println("Sorted array: "); 
		printArray(ar, n); 
	} 
} 
