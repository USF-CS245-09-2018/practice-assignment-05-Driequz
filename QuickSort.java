
public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		sort1(a,0,a.length-1);
	}

	public void sort1(int [] a, int x, int y) {
		if (x < y) 
        { 
            int pi = partition(a,x,y); 
            
            sort1(a, x, pi - 1); 
            sort1(a, pi + 1, y);
        }
	}

	int partition(int []a, int low, int high) 
    { 
        int pivot = a[high];  
        int i = (low - 1); 
        for (int j = low; j < high; j++) 
        { 
            if (a[j] <= pivot) 
            { 
                i++; 
   
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
  
        int temp = a[i + 1]; 
        a[i + 1] = a[high]; 
        a[high] = temp; 
  
        return i + 1; 
    } 
  
}
