package Methods;

public class readyTest {

	public static void main(String[] args) 
	{

		String abc="121";
		String resverse="";
		for(int i=abc.length()-1;i>=0;i--)
		{
			resverse=resverse+ abc.charAt(i);
		}
		if(abc.equalsIgnoreCase(resverse))
		{
		System.out.println(resverse+" is a Palidrom !!!");
		}
		else
		{
			System.out.println("Not a Palidrome !!!");
		}

	}

}
