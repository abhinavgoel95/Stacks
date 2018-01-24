public class Stack
{
	int head = -1;
	String[] arr = new String[100];
	public void push(String k)
	{
		arr[++head] = k;
	}
	public String pop()
	{
		String s = arr[head];
		head--;
		return s;
	}
	public boolean isEmpty()
	{
		return head == -1;
	}
	public void disp()
	{
		for(int i = 0; i <= head;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
