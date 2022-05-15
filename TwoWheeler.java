//$Id$
package week1.day1;

public class TwoWheeler 



{
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1310410923238432L;
	boolean isPunctured = false;
	String bikeName = "R15V2";
	double runningKM = 36000.54;



	public static void main(String[] args)
	
	{
		TwoWheeler tw = new TwoWheeler();
		System.out.println("No.of. wheels in the bike is "+tw.noOfWheels);
		System.out.println("No.of. mirrors in the bike is "+tw.noOfMirrors);
		System.out.println("Chasis No.of. the bike is "+tw.chassisNumber);
		System.out.println("Is the bike punctured "+tw.isPunctured);
		System.out.println("Name of the bike is "+tw.bikeName);
		System.out.println("Running Km in the bike is "+tw.runningKM);

	}

}
