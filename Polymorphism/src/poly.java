class sample
{
	void add(int a,int b)
	{
		System.out.println("sum of two num:"+(a+b));
	}
	void add(long a,long b)
	{
		System.out.println("sum of two num:"+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("sum of two num:"+(a+b+c));
	}
	void add(float a,float b)
	{
		System.out.println("sum:"+(a+b));
	}
}
 class poly {
	 public static void main(String args[])
	 {
		 sample s=new sample();
		 s.add(1000000000,2000000000);
		 s.add(10,20,30 );
		 s.add(1.1f, 2.2f);
	 }

}
