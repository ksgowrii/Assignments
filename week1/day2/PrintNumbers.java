package week1.day2;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("printing numbers in correct order");    
		for(int i=0;i<=10;++i)
         {
        	 System.out.println(i);
         }
		System.out.println("printing numbers in reverse order");
		    for(int i=10;i>=0;--i)
	         {
		    	 System.out.println(i);
	         }
		    System.out.println("to skip an iteration");
		    for(int i=0;i<=10;++i)
	         {
		    	if(i>=7)
		    	{
		    		continue;
		    	}
        	 System.out.println(i);
	         }
		    System.out.println("to skip an iteration based on a continue");
		    for(int i=0;i<=100;++i)
	         {
		    	if(i%2==0)
		    	{
		    		continue;
		    	}
       	 System.out.println(i);
	         }
		    System.out.println("print even numbers from 1 to 50");
		    for(int i=0;i<=50;++i)
	         {
		    	if(i%2==0)
		    	{
		    		System.out.println(i);
		    	}
	         }
		    }

}
