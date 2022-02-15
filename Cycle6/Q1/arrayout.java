class arrayout
{
	public static void main(String args[])
	{
		try{
			int a[]={1,2,3};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
