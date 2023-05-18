package Day2;

import java.util.Scanner;

class Node
{
	Node next;
	int data;
	public Node(int e)
	{
		data=e;
		next=null;
	}
}
public class Question5 {
	
	Node front1,rear1;
	Node front2,rear2;
	void createQueue1()
	{
		front1=rear1=null;
	}
	
	void createQueue2()
	{
		front2=rear2=null;
	}
	
	void Enqueue1(int e)
	{
		Node n = new Node(e);
		if(rear1==null)
		{
			front1=rear1=n;
			System.out.println("Enqueued null");
		}
		else {
			rear1.next=n;
			rear1=n;
			System.out.println("Enqueued");
		}
	}
	
	
	void Enqueue2(int e)
	{
		Node n = new Node(e);
		if(rear2==null)
		{
			front2=rear2=n;
			System.out.println("Enqueued");
		}
		else {
			rear2.next=n;
			rear2=n;
			System.out.println("Enqueued");
		}
	}
	
	int Dequeue1()
	{
		if(front1==null)
		{
			System.out.println("Queue Empty");
			return 0;
		}
		else {
			Node t = front1;
			front1=front1.next;
			if(front1==null)
			{
				rear1=null;
			}
			System.out.println(t.data +"Dequeued ");
			return t.data;
		}
	}
	
	int Dequeue2()
	{
		if(rear2==null)
		{
			System.out.println("Queue Empty");
			return 0;
		}
		else {
			Node t1 =front2;
			front2=front2.next;
			System.out.println(t1.data +" Dequeued");
			return t1.data;
		}
	}
	void Q1toQ2()
	{
		if(rear1==null) {
			System.out.println("Queue Empty");
		}
		else
		{
			Node temp=front1;
			while(temp!=null)
			{
				int val=Dequeue1();
				Enqueue2(val);
				temp=temp.next;
			}
		}
	}
	void Q2toQ1()
	{
		
		if(rear2==null)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			Node t2 =front2;
			while(t2!=null)
			{
				int val2=Dequeue2();
				Enqueue1(val2);
				t2=t2.next;
			}
		}
	}
	void print()
	{		
		System.out.println("hello nikhil");
		if(rear1==null)
		{
			System.err.println("Queue Empty");
		}
		else {
			Node t1=front1;
			while(t1!=null)
			{
				System.out.print(t1.data + " ");
				t1=t1.next;
			}
		}
	}
	
	void print1()
	{		
		if(rear2==null)
		{
			System.err.println("Queue Empty");
		}
		else {
			Node t=front2;
			while(t!=null)
			{
				System.out.print(t.data + " ");
				t=t.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Question5 obj= new Question5();
		obj.createQueue1();
		obj.createQueue2();

			System.out.println("Enqueue");
				System.out.println("Enter no of elements you want to enqueue: ");
				int size=in.nextInt();
				for(int i=0 ;i<size;i++)
				{
				System.out.println("Enter value to Enqueue: "+i);
				int element=in.nextInt();
				obj.Enqueue1(element);
				}
				//obj.print();
				obj.Q1toQ2();
				
				System.out.println("Enter no. of elements you wish to enter again: ");
				int size1=in.nextInt();
				for(int k=0;k<size1;k++)
				{
					System.out.println("Enter value to Enqueue at "+k+ ":");
					int elements=in.nextInt();
					obj.Enqueue1(elements);
					//obj.print();
				}
			

				obj.Q2toQ1();
				
				obj.print();
	
	}

	}
