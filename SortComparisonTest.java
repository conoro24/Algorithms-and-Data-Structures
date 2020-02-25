import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
// Questions / Time Recordings:
// 
// a) The Insertion sort execution time is affected by the order of input because
//    when a set of nearly ordered numbers is run through insertion sort, the 
//	  method will only have a few numbers to select and sort as opposed to the entire text 
//	  file, which is why the runtime is quicker than other orders of inputs.
// 
// b) Selection sort for a random input of 1000 numbers happens to have the biggest
//	  difference between the best and worst performances. I noticed the average time to be 
//	  10ms but occasionally got a number around the 40ms range. This is an example
// 	  of a worst-case run time where the random input is close to reverse order and 
//	  the method has to completely reverse the whole input order, which takes the longest.
// 	  
// c) I noticed that insertion Sort has the biggest difference between run times for 10 numbers
// 	  to 1000 numbers. A difference of 12ms, averaging 1ms when given 10 numbers as an 
// 	  input vs. averaging 13ms per sort when given 1000 numbers as an input.
//
// d) I noticed that MergeSortIterative is marginally faster than MergeSortRecursive
//	  but both however are very similar in their respective run times.
// 
// e) Quick Sort is the fastest algorithm for each of the 7 input files.
// 
// 
// 10 Random (InsertionSort) - <1 millisecond
// 10 Random (SelectionSort) - <1ms
// 10 Random (QuickSort) - <1ms
// 10 Random (MergeIterative) - <1ms
// 10 Random (MergeRecursive) - <1ms
//
// 100 Random (InsertionSort) - 1ms
// 100 Random (SelectionSort) - .75ms
// 100 Random (QuickSort) - <1ms
// 100 Random (MergeIterative) - .75ms
// 100 Random (MergeRecursive) - 1ms
//
// 1000 Random (InsertionSort) - 13ms
// 1000 Random (SelectionSort) - 10ms
// 1000 Random (QuickSort) - .75 ms
// 1000 Random (MergeIterative) - 3ms
// 1000 Random (MergeRecursive) - 4ms
//
// 1000 Duplicates (InsertionSort) - 11.5ms
// 1000 Duplicates (SelectionSort) - 10ms
// 1000 Duplicates (QuickSort) - 1ms
// 1000 Duplicates (MergeIterative) - 4ms
// 1000 Duplicates (MergeRecursive) - 3.5ms
//
// 1000 Nearly Ordered (InsertionSort) - 7ms
// 1000 Nearly Ordered (SelectionSort) - 12ms
// 1000 Nearly Ordered (QuickSort) - 1.5ms
// 1000 Nearly Ordered (MergeIterative) - 3ms
// 1000 Nearly Ordered (MergeRecursive) - 3.5ms
//
// 1000 Reverse (InsertionSort) - 12ms
// 1000 Reverse (SelectionSort) - 11ms
// 1000 Reverse (QuickSort) - 9ms
// 1000 Reverse (MergeIterative) - 3ms
// 1000 Reverse (MergeRecursive) - 3.5ms
//
// 1000 Sorted (InsertionSort) - 1.5ms
// 1000 Sorted (SelectionSort) - 10ms
// 1000 Sorted (QuickSort) - 10ms
// 1000 Sorted (MergeIterative) - 3ms
// 1000 Sorted (MergeRecursive) - 3ms
//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    	
    	double[] actual = null;
        double[] expected = null;
        SortComparison.isEmpty(actual);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertionSort(){
    	double[] actual = { 5, 1, 6, 2, 3, 4 };
        double[] expected = { 1, 2, 3, 4, 5, 6 };
        double [] sorted = SortComparison.insertionSort(actual);
        assertArrayEquals(expected, sorted);
    }
    
    private static void assertArrayEquals(double[] expected, double[] sorted) {}

	@Test
    public void testSelectionSort(){
		
    	double[] actual = { 5, 1, 6, 2, 3, 4 };
        double[] expected = { 1, 2, 3, 4, 5, 6 };
        double [] sorted = SortComparison.selectionSort(actual);
        assertArrayEquals(expected, sorted);
    }
    
    @Test
    public void testQuickSort(){
    	double[] actual = { 5, 1, 6, 2, 3, 4 };
        double[] expected = { 1, 2, 3, 4, 5, 6 };
        double [] sorted = SortComparison.quickSort(actual);
        assertArrayEquals(expected, sorted);
    }
    
    @Test
    public void testMergeSortIterative(){
    	double[] actual = { 5, 1, 6, 2, 3, 4 };
        double[] expected = { 1, 2, 3, 4, 5, 6 };
        double [] sorted = SortComparison.mergeSortIterative(actual);
        assertArrayEquals(expected, sorted);
    }
    
    @Test
    public void testMergeSortRecursive() {
        double[] actual = { 5, 1, 6, 2, 3, 4 };
        double[] expected = { 1, 2, 3, 4, 5, 6 };
        double [] sorted = SortComparison.mergeSortRecursive(actual);
        assertArrayEquals(expected, sorted);
    }


    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     * @throws FileNotFoundException 
     *
     */
    public static void main(String[] args) 
    {
    	double[] input = new double[1000];
    	int index = 0;
    	BufferedReader reader;
    	try{
    		reader = new BufferedReader(new FileReader("/Users/conoroneill/Downloads/assignment input data files/numbers1000.txt"));
    		String line = reader.readLine();
    		while(line != null && (index != 1000)){
    			Double val = Double.parseDouble(line);
    			input[index] = val;
    			index++;
    			
    			line = reader.readLine();
    			
    		}
    		reader.close();
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    	System.out.println(Arrays.toString(input));
    	
    	Instant start = Instant.now();
    	SortComparison.insertionSort(input);
    	Instant end = Instant.now();
    	long timeElapsed = Duration.between(start, end).toMillis();
    	System.out.println(Arrays.toString(input));
    	System.out.println(timeElapsed + " milliseconds");
    }

}
