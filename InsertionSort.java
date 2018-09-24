
public class InsertionSort implements SortingAlgorithm{

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		
		for (int i = 1; i < n; i++) {
			
			int temp = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--; // j = j-1;
			}
			a[j + 1] = temp;
		}

	}
}
