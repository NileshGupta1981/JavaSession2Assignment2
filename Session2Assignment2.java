public class Session2Assignment2{
	public static void main (String[] args){
		
		int i = 3;
		int j = 2;
		//int k = 2;
		// int[] prime = new int[200];
		//prime[0] = 1;
		//prime[1]=2;
		System.out.println("1");
		System.out.println("2");
		for (i=3 ; i <100 ; i++)
		{
		 for ( j =2 ; j <= i ; j++ )
		 {
			 if (i%j==0){
				 break;
				 }
		 }
			 if (j==i)
			 {
				 System.out.println (i);
				 
			 }
		 
			
			
		}
	}
	
}