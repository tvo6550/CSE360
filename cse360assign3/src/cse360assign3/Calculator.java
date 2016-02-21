/**
 * This class is meant to resemble a calculator so it has basic arithmetic functions such as
 * add, subtract, multiply, divide. The constructor creates an integer total that
 * defaults to total. There is also a method to return the total as well as get
 * the history.
 * 
 * @author Thong Vo (ASUID: 1207269878) for CSE360 Spring 2016
 * @version 2/20/16
 */

package cse360assign3;

public class Calculator 
{
	private int total;
	
	/**
	 * Calculator - The default constructor for the class. Initializes total to zero
	 */
	public Calculator() 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - This wil return the total value after some operation
	 * 
	 * @return - The integer value of the total. Default is 0
	 */
	public int getTotal() 
	{
		return 0;
	}
	
	/**
	 * add - This will add the value to the total
	 * 
	 * @param value - The integer that will be added to the total
	 */
	public void add(int value) 
	{
		
	}
	
	/**
	 * subtract - This will subtract the value from the total
	 * 
	 * @param value - The integer that will be subtracted from the total
	 */
	public void subtract(int value) 
	{
		
	}
	
	/**
	 * multiply - This will multiply the value with the total
	 * 
	 * @param value - The integer that will be multiplied with the total
	 */
	public void multiply(int value) 
	{
		
	}
	
	/**
	 * divide - This will divide the value into the total
	 * 
	 * @param value - The integer that will divided into the total
	 */
	public void divide(int value) 
	{
		
	}
	
	/**
	 * getHistory - Gets the previous calculations performed
	 * 
	 * @return The string value of the calculations performed. Default is "".
	 */
	public String getHistory() 
	{
		return "";
	}
}