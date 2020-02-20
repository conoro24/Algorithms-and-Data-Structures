// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2020
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
	 
	static boolean isEmpty(double a[]){
		boolean isEmpty = false;
		if(a == null){
			isEmpty= true;
		}
		return isEmpty;
	}
	 
    static double [] insertionSort (double a[]){
    	int N = a.length;

        for (int i = 1; i < N; i++) {
           for (int j = i; j > 0; j--) {
              if (a[j] < a[j - 1])
                  exch(a, j - 1, j);
              else
                  break;
           }
        }
        return a;
       
    }//end insertion sort
    
    private static void exch(double[] a, int i, int j) {
        double swap = a[i];
        a[i] = a[j];
        a[j] = swap;
     }
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){
    	int n = a.length;
    	 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = (int) a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        return a;
         

    }//end selection sort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){
	
    	int i = (int) a[0]; 
    	int j = (int) a.length - 1; 
    	int pivot = (int) a[i + (j - i) / 2]; 
    	while (i <= j) { 
    		while (a[i] < pivot) { i++; } 
    		while (a[j] > pivot) { j--; } 
    		if (i <= j) { 
    			exch(a, i, j); 
    			i++; j--; } 
    	} 
    		 
    	if (i < j) { quickSort(a); } 
    	
    	return a;
    } //end quick sort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {
  
        if(a.length > 1) 
        { 
            int mid = a.length / 2; 
  
            // Split left part 
            double[] left = new double[mid]; 
            for(int i = 0; i < mid; i++) 
            { 
                left[i] = a[i]; 
            } 
              
            // Split right part 
            double[] right = new double[a.length - mid]; 
            for(int i = mid; i < a.length; i++) 
            { 
                right[i - mid] = a[i]; 
            } 
            mergeSortIterative(left); 
            mergeSortIterative(right); 
  
            int i = 0; 
            int j = 0; 
            int k = 0; 
  
            // Merge left and right arrays 
            while(i < left.length && j < right.length) 
            { 
                if(left[i] < right[j]) 
                { 
                    a[k] = left[i]; 
                    i++; 
                } 
                else
                { 
                    a[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
            // Collect remaining elements 
            while(i < left.length) 
            { 
                a[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) 
            { 
                a[k] = right[j]; 
                j++; 
                k++; 
            } 
        } 
        return a;
	
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	
    	if (a.length < 2) {
            return a ;
        }
        double mid = a.length / 2;
        double[] l = new double[(int) mid];
        double[] r = new double[(int) (a.length - mid)];
     
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = (int) mid; i < a.length; i++) {
            r[(int) (i - mid)] = a[i];
        }
        mergeSortRecursive(l);
        mergeSortRecursive(r);
     
        merge(a, l, r, mid, a.length - mid);
        return a;
   }//end mergeSortRecursive
    	
   public static void merge(double[] a, double[] l, double[] r, double left, double right) {
    		  
	   int i = 0, j = 0, k = 0;
	   while (i < left && j < right) {
		   if (l[i] <= r[j]) {
			   a[k++] = l[i++];
		   }
		   else {
			   a[k++] = r[j++];
		   }
	   }
	   while (i < left) {
		   a[k++] = l[i++];
	   }
	   while (j < right) {
		   a[k++] = r[j++];
	   }
   }

    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class
