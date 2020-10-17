import java.io.*; 

class Main
{ 
    static int partition(int[] a,int l, int h)
    {
        int pivot = a[h];
        int i = l-1;
        for(int j=l;j<h;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[h];
        a[h] = t;
        
        return i+1;
    }
	static void sort(int[] a,int l,int h)
	{
	    if(l<h)
	    {
	        int p = partition(a,l,h);
	        
	        sort(a,l,p-1);
	        sort(a,p+1,h);
	    }
	}
	static void quickSort(int a[], int n) 
	{ 
	  int l = 0;
	  int h = n-1;
	  sort(a,l,h);
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
	    quickSort(ar, n); 
		System.out.println("Sorted array: "); 
		printArray(ar, n); 
	} 
} 
