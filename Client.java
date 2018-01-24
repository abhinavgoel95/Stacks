public class Client
{
	public static void main(String args[])
	{
		Stack s = new Stack();
		Stack s2 = new Stack();
		Stack s3 = new Stack();
		String s1 = "{ [ ( a + b ) + c ] + d } + e";
		String arr[] = new String[100];
		arr = s1.split(" ");
		boolean b1 = true;
		try
		{
			for(int i = 0; i<arr.length; i++)
			{
				if(arr[i].equals("{"))
					s.push(arr[i]);
				else if(arr[i].equals("}"))
					s.pop();
				else if(arr[i].equals("("))
					s2.push(arr[i]);
				else if(arr[i].equals(")"))
					s2.pop();
				else if(arr[i].equals("["))
					s3.push(arr[i]);
				else if(arr[i].equals("]"))
					s3.pop();
			}
		}
		catch(Exception e)
		{
			b1 = false;
		}
		finally
		{
			System.out.println(b1 && s.isEmpty() && s2.isEmpty() && s3.isEmpty());
		}
	}
}
