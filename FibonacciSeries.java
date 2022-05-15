//$Id$
package week1.day1;

public class FibonacciSeries 


{
	
	

	public static void main(String[] args) 
	
	
	{
		int firstNum,secNum,series_sum;
		firstNum = 0;
		secNum= 1;
		
		System.out.println(firstNum);
		
		for (int i = 1; i<8; i++) 
		
		{
			
			series_sum = firstNum + secNum;
			firstNum = secNum;
			secNum = series_sum;
			System.out.println(series_sum);
			
		}
		
		
		
		

	}

}
