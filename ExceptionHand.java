class ExceptionHand 
{
	public static void main(String[] args) 
	{
		try{
			int a = 10/0; // 10 cannot be divided by 0 in java it gives arithmetic error
		}
		catch (Exception a){
		System.out.println("Error occured");
	}
	
	finally{
		System.out.println("Program Ended Successfully");
	}
}
}