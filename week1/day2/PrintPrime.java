package week1.day2;

public class PrintPrime {

 void checkPrime(int n)
 {
	 boolean flag = true;
	 for (int i = 2; i < n; i++)
		{
			if (n % i == 0) 
			{
				flag = false;
				System.out.println("number is not a prime number");
				break;
			}
		}
	 if(flag)
	 {
	 System.out.println("number is prime number");
 }
 }
 void validatePrime(int n)
 {

 for (int i = 2; i <= n; i++)
	{
		if (n == i)
		{
			System.out.println("number " +n+ " is prime number");
			
		}
		else if (n%i==0)
		{
			System.out.println("number " +n+ " is not a prime number");
			break;
		}
		
	}
 }
 void printPrime(int a)
 {
     
	 for(int i = 1 ; i <=a ; i++)
	 {
		 if(i==1)
	     {
			 System.out.println("number " +i+ " is prime number");
			 	     }
	     
		 validatePrime(i);
		 
	 }
 
}
	public static void main(String[] args) {
		PrintPrime print = new PrintPrime();
		print.checkPrime(9);
		print.checkPrime(13);
		print.checkPrime(23);
		print.checkPrime(56);
		print.printPrime(20);
	}

}
