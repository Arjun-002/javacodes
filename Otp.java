class Otp 
{
	public static void main(String[] args) 
	{
		int otp = (int) (Math.random() *8999)+1000;
		System.out.println(otp);
	}
}
