//$Id$
package week1.day1;

public class FibonacciSeries 


{
	
	

	public static void main(String[] args) 
	
	
	{
		int range =8;
		int firstNum = 0;
		int secNum = 1;
		int series_sum;
		firstNum = 0;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i = 1; i<range; i++) 
		
		{
			
			series_sum = firstNum + secNum;
			firstNum = secNum;
			secNum = series_sum;
			System.out.println(series_sum);
			
		}
		
		
		
		

	}

}
