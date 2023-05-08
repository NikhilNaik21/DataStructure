package Day1DS;

import java.util.Scanner;

public class StackExample {
	
	private int Maxsize , tos,stack[]  ;
	void createStacksize(int size)
	{
		Maxsize=size;
		tos=-1;
		stack = new int[Maxsize];
	}
	
	void push(int e) 
	{
		
		tos++;
		stack[tos]=e; 
	}

	int pop()
	{
		int temp = stack[tos];
		tos-- ;
		return(temp);
	}
	
	boolean isFull()
	{
		if(tos==Maxsize-1)
		{
			return true ; 
		}
		else 
		{
			return false ; 
		}
	}
	
	boolean isEmpty()
	{
		if(tos==-1)
		{
			return true ; 
		}
		else 
		{
			return false ; 
		}
	}
	
	int peek() 
	{
		return stack[tos];
	}
	
	void print()
	{
		for(int i=tos ;i>=0 ;i--) 
		{
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
	
		int ch,e,size;
		
		StackExample obj = new StackExample();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size : ");
		size=in.nextInt();
		obj.createStacksize(size);
		
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.print\n0.Exit");
			ch = in.nextInt();
			
			switch(ch)
			{
			case 1 :
				if(obj.isFull()!=true)
				{
					System.out.println("Enter value: ");
					e = in.nextInt();
					obj.push(e);
					break;
				}
				else {
					System.out.println("Stack is Full");
				}
				break;
			case 2 :
				if(obj.isEmpty()!=true)
				{
					obj.pop();
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
				
			case 3 :
				if(obj.isEmpty()!=true) {
					System.out.println("Top element = " + obj.peek() );
				}
				else {
					System.out.println("Stack is Empty");
				}
					break;
				
			
		case 4 : 
			if(obj.isEmpty()==true) {
				System.out.println("Stack is Empty");
			}
			else {
				obj.print();
				
			
			}
			break;
			default :
				System.out.println("Wrong input");
			}
			
			
		}while(ch!=0);
	}

}
