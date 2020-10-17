import java.io.*; 

class Main
{ 
    static void merge(int[] a,int l,int m,int r)
    {
        int n1,n2;
        n1 = m-l+1;
        n2 = r-m;
        int i,j,k=l;
        int[] x = new int[n1];
        int[] y = new int[n2];
        
        for( i=0;i<n1;i++)
            x[i] = a[l+i];
        
        for( j=0;j<n2;j++)
            y[j] = a[m+j+1];
        
        i=0;
        j=0;
        
        while(i<n1 && j<n2)
        {
            if(x[i]<=y[j])
            {
                a[k] = x[i];
                i++;
                k++;
            }
            else
            {
                a[k] = y[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            a[k] = x[i];
            i++;
            k++;
        }
        
        while(j<n2)
        {
            a[k] = y[j];
            j++;
            k++;
        }
    }
    static void sort(int[] a,int l,int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            
            merge(a,l,m,r);
        }
    }
    static void mergeSort(int[] a,int n)
    {
        int l = 0;
        int r = n-1;
        sort(a,l,r);
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
	    mergeSort(ar, n); 
		System.out.println("Sorted array: "); 
		printArray(ar, n); 
	} 
} 
