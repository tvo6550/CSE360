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
		//Initialize new Calculator
		Calculator testCalc = new Calculator();
		
		//Check if initialized
		assertNotNull(testCalc);
	}
	
	/**
	 * getTotal - Try to add something to the total and see if it returns.
	 * 
	 * @result - The method should return the integer that was added.
	 */
	@Test
	public void testGetTotal()
	{
		//Initialize new calculator
		Calculator testCalc = new Calculator();
		
		//Add
		testCalc.add(3);
		
		//Check if total is integer added
		assertEquals(3, testCalc.getTotal());
				
	}
	
	/**
	 * add - Try to add something to the total
	 * 
	 * @result - The method should make it so the total is what was added
	 */
	@Test
	public void testAdd()
	{
		//Initialize new calculator
		Calculator testCalc = new Calculator();
				
		//Add
		testCalc.add(3);
				
		//Check if total is integer added
		assertEquals(3, testCalc.getTotal());
	}
	
	/**
	 * subtract - Try to subtract something from the total
	 * 
	 * @result - The method should make it so the total is less by the value inputted
	 */
	@Test
	public void testSubtract()
	{
		//Initialize new calculator
		Calculator testCalc = new Calculator();
						
		//Add
		testCalc.subtract(3);
						
		//Check if total is integer added
		assertEquals(-3, testCalc.getTotal());
	}
	
	/**
	 * multiply - Try to multiply the total after adding 1
	 * 
	 * @result - The total returned should be the total multiplied by the input
	 */
	@Test
	public void testMultiply()
	{
		//Initialize new calculator
		Calculator testCalc = new Calculator();
								
		//Add
		testCalc.add(1);
		
		//Multiply
		testCalc.multiply(3);
								
		//Check if total is integer added
		assertEquals(3, testCalc.getTotal());
	}
	
	/**
	 * divide - The method should divide the total by the number input after adding a number
	 * 
	 * @result - This should return the value of the total divided by the input
	 */
	@Test
	public void testDivide()
	{
		//Initialize new calculator
		Calculator testCalc = new Calculator();
				
		//Add
		testCalc.add(15);
		
		//Multiply
		testCalc.divide(5);
										
		//Check if total is integer added
		assertEquals(3, testCalc.getTotal());
	}
	
	/**
	 * divideZero - The method should divide the total by 0 after adding a number
	 * 
	 * @result - This should return 0
	 */
	@Test
	public void testDivideZero()
	{
		//Initialize new calculator
		Calculator testCalc = new Calculator();
				
		//Add
		testCalc.add(15);
		
		//Multiply
		testCalc.divide(0);
										
		//Check if total is integer added
		assertEquals(0, testCalc.getTotal());
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
