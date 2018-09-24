
public class MergeSort implements SortingAlgorithm {

public void sort(int[] a) {
		sort2(a,0,a.length-1);
	}

	public void sort2(int [] a, int x, int y) 
    { 
        if (x < y) 
        {  
            int m = (x + y)/2; 
  
            sort2(a, x, m); 
            sort2(a , m + 1, y); 
  
            merge(a, x, m, y); 
        } 
    } 
	void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
}
