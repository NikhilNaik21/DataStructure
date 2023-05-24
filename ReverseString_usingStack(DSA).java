package Day1DS;

import java.util.Scanner;

public class ReverseString {

	private int Maxsize, tos;
	char stack[];

	void createstack(int size) 
	{
		Maxsize = size;
		tos = -1;
		stack = new char[Maxsize];
	}

	void push(char e) 
	{
		tos++;
		stack[tos] = e;
	}

	int pop() 
	{
		int temp = stack[tos];
		tos--;
		return temp;
	}

	boolean isEmpty()
	{
		if (tos == -1) 
		{
			return true;
		} else 
		{
			return false;
		}
	}

	boolean isFull() 
	{
		if (tos == Maxsize - 1) 
		{
			return true;
		} else 
		{
			return false;
		}
	}

	int peek() 
	{
		return stack[tos];
	}

	void print() 
	{
		for (int i = tos; i >= 0; i--)
		{
			System.out.print(stack[i]);
		}
	}


	public static void main(String[] args) {
		int  size;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		
	
		
		size = str.length();

		ReverseString obj = new ReverseString();
		obj.createstack(size);

		
		char x[] = new char[size];
		
		for (int i = 0; i < str.length(); i++) 
		{
			x[i] = str.charAt(i);
		}
		for (int j = 0; j < x.length; j++) 
		{
			obj.push(x[j]);
		}

		obj.print();
		
in.close();
	}
}
