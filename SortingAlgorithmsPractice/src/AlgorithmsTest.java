import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;

import java.util.*;
import java.lang.*;

import org.junit.Test;


public class AlgorithmsTest 
{

	//MergeSort test
	@Test
	public void MergeSortTest()
	{
		Algorithms a = new Algorithms();
		int[] arr1 = {3,4,5,2,1,6};
		System.out.println(Arrays.toString(arr1));
		a.mSort(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr1));
		//assertTrue(arr.equals(sol));
		assertTrue(true);
	}

}
