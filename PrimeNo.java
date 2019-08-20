

	class PrimeNo
	{
		public static void main(String args[])
		{
			int n,p;
			Scanner s = new Scanner(System.in);
			System.out.println("Enterb any Number : ");
			n = sc.nextInt();
			if( (2^(n-1)) % n == 1)
			{
				System.out.println("It's Prime Number");

			}
			else
			{
				System.out.println("It's  not Prime Number");
				
			}
		}

	}