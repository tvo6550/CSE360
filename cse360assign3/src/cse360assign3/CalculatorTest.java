/**
 * This class contains all of the junit tests for the class Calculator
 * 
 * @author Thong Vo (ASUID: 1207269878) for CSE360 Spring 2016
 * @version 2/20/16
 */

package cse360assign3;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest 
{

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	/**
	 * setUpStreams - Just make streams
	 */
	@Before
	public void setUpStreams() 
	{
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	/**
	 * cleanUpStreams - Set streams to null.
	 */
	@After
	public void cleanUpStreams() 
	{
	    System.setOut(null);
	    System.setErr(null);
	}
	
	/**
	 * Calculator - Created Calculator
	 * 
	 * @result - The object should only be initialized so it should be able to call a method
	 */
	@Test
	public void testCalculator()
	{
		Calculator testCalc = new Calculator();
		
		//Check if initialized
		assertNotNull(testCalc);
	}
	
	/**
	 * getTotal - Not yet implemented
	 * 
	 * @result - This will fail as it has not yet been implemented
	 */
	@Test
	public void testGetTotal()
	{
		fail("This method has not yet been implemented.");
	}
	
	/**
	 * add - Not yet implemented
	 * 
	 * @result - This will fail as it has not yet been implemented
	 */
	@Test
	public void testAdd()
	{
		fail("This method has not yet been implemented.");
	}
	
	/**
	 * subtract - Not yet implemented
	 * 
	 * @result - This will fail as it has not yet been implemented
	 */
	@Test
	public void testSubtract()
	{
		fail("This method has not yet been implemented.");
	}
	
	/**
	 * multiply - Not yet implemented
	 * 
	 * @result - This will fail as it has not yet been implemented
	 */
	@Test
	public void testMultiply()
	{
		fail("This method has not yet been implemented.");
	}
	
	/**
	 * divide - Not yet implemented
	 * 
	 * @result - This will fail as it has not yet been implemented
	 */
	@Test
	public void testDivide()
	{
		fail("This method has not yet been implemented.");
	}
	
	/**
	 * getHistory - Not yet implemented
	 * 
	 * @result - This will fail as it has not yet been implemented
	 */
	@Test
	public void testGetHistory()
	{
		fail("This method has not yet been implemented.");
	}
}
