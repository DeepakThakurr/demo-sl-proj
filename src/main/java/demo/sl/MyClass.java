package demo.sl;

public class MyClass {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob =new MyClass();
		System.out.println("sum is : "+ob.sum(20,10)); 
		System.out.println("difference is : "+ob.sub(20,10));
		

	}

}
