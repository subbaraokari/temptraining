class Test
{
	public void methodOne()
	{
		final int a=10;
		Thread t=new Thread(){
			public void run()
			{
				for(int i=0;i<10;i++)
					System.out.println(++a);
			}
		};
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("main thread");
	}
}
class Test1
{
	public static void main(String s[]){
		Test t=new Test();
		t.methodOne();
	}
}		
	