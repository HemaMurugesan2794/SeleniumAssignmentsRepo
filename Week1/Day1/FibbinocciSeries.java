package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		
		int firstNum= 0, secondNum = 1, sum;
		System.out.print("Fibonocci Series of 11 is : " +firstNum +" " +secondNum);
        for (int i = 2; i<11; i++) 
        {
        	sum = firstNum + secondNum;
        	System.out.print(" "+ sum);
        	firstNum = secondNum;
        	secondNum = sum;
        	
			
		}
	}

}
