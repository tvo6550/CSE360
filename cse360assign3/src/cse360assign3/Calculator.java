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
	private String history = "0";
	
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
		return total;
	}
	
	/**
	 * add - This will add the value to the total. Also it will add the action performed to the history
	 * 
	 * @param value - The integer that will be added to the total
	 */
	public void add(int value) 
	{
		total += value;
		
		history = history.concat(" + ");
		history = history.concat(Integer.toString(value));
	}
	
	/**
	 * subtract - This will subtract the value from the total. Also it will add the action performed to the history
	 * 
	 * @param value - The integer that will be subtracted from the total
	 */
	public void subtract(int value) 
	{
		total -= value;
		
		history = history.concat(" - ");
		history = history.concat(Integer.toString(value));
	}
	
	/**
	 * multiply - This will multiply the value with the total. Also it will add the action performed to the history
	 * 
	 * @param value - The integer that will be multiplied with the total
	 */
	public void multiply(int value) 
	{
		total *= value;
		
		history = history.concat(" * ");
		history = history.concat(Integer.toString(value));
	}
	
	/**
	 * divide - This will divide the value into the total. Also it will add the action performed to the history
	 * 
	 * @param value - The integer that will divided into the total
	 */
	public void divide(int value) 
	{
		if(value != 0)
			total /= value;
		else
			total = 0;
		
		history = history.concat(" / ");
		history = history.concat(Integer.toString(value));
	}
	
	/**
	 * getHistory - Gets the previous calculations performed
	 * 
	 * @return The string value of the calculations performed. Default is "".
	 */
	public String getHistory() 
	{
		return history;
	}
}