package week1.assignments;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		//to find whether 13 is a prime no or not
		
		int input=12;
		boolean count = false;

		// if the number is divisible by 1 and also by its own number only except 1.
		
		for(int i=2;i<=input/2;++i)
		{
			
			if(input%i==0)
			{
				count= true;
				break;
			}
		}
		if (!count)
		
			System.out.println("The given number"+input+" is a prime number ");
		else	
		
			System.out.println("The given number"+input+" is not a prime number ");
				
		
			
	}

}