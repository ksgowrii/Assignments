package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) 
	{
		int n = 13;
		 boolean isPrime = isPrime(n);
		 
		 if(isPrime)
		 {
			 System.out.println("given number" +n + "is Prime");
		 }
		 else
		 {
			 System.out.println("given number" +n + "is not a Prime");
		 }
			}	

	public static boolean isPrime(int n) 
	{
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

}
