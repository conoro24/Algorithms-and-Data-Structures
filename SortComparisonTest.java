import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
    public void testInstertionSort(){
    	double[] actual = { 5, 1, 6, 2, 3, 4 };
        double[] expected = { 1, 2, 3, 4, 5, 6 };
        double [] sorted = SortComparison.insertionSort(actual);
        assertArrayEquals(expected, sorted);
    }
    
    private void assertArrayEquals(double[] expected, double[] sorted) {
		// TODO Auto-generated method stub
		
	}

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


    // TODO: add more tests here. Each line of code and each decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        
    }

}
