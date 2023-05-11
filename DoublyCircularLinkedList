package Day4;
import java.util.Scanner;

class node1
{
	int data;
	node1 left, right;
	node1(int e)
	{
		data = e;
		left = null;
		right = null;
	}
}
	public class DoublcircularLinkedlist 
	{
		node1 root, last;
		
		void createLink()
		{
			root= last = null;

		}
		
		void insertLeft(int e)
		{
			node1 n = new node1(e);
			if (root == null)
			{
				root = last = n;
				root.left = last;
				last.right = root;
			}
			else 
			{
				 n.right = root;
				 n.left = last;
				 root.left = n;
				 root = root.left;
				 last.right = root;

				 System.out.println("inserted");
			}
		}
		        
		  void deleteLeft()
		  {
		      if(root==null)
		          System.out.println("Empty List");
		      else
		      {
		    	  node1 t = root;
		    	  root = root.right;
		    	  root.left = last;
		          last.right = root;
		          System.out.println(t.data+" deleted");
		      }
		  }
		  
		  
		  void insertRight(int e)
		  {   node1 n=new node1(e);
		      if(root==null)
		      {
		    	    root = last = n;
		    		root.left = last;
		    		last.right = root;
		      }
		      else
		      {    
		    	  n.right = root;
		    	  n.left = last;
		    	  last.right = n;	 
		    	  last = n;
		    	  root.left = last;
		          System.out.println("inserted");
		      }
		  }
		  void deleteRight()
		  {
		      if(root==null)
		          System.out.println("Empty List");
		      else
		      {
		          node1 t = last;
		          last = last.left;
		          last.right = root;
		          root.left = last;
		          System.out.println(t.data+" deleted");
		      }
		  }
		  
		  void printList()
		  {   if(root==null)
		          System.out.println("Empty list");
		      else
		      {   node1 t=root;
		      	do 
		      	{
		      		System.out.print(t.data+" -> ");
		      		t=t.right;
		      	}while(t!=root);     
		      }
		  }
		  void printRevList()//last to 1st
		  {   if(root==null)
		          System.out.println("Empty list");
		      else
		      {    node1 t=last;
		      	do 
		      	{
		      		System.out.print(t.data+"|->");
		      		t=t.left;
		      	}while(t!=last);     
		      }
		   }
		  
		  public static void main(String args[])
		    {
		        int ch,e;
		        DoublcircularLinkedlist obj = new DoublcircularLinkedlist();
		        Scanner in=new Scanner(System.in);
		        obj.createLink();
		        
		        do
		        {
		           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.Print Reverse\n0.Exit\n:");
		           ch=in.nextInt();
		           switch(ch)
		           {
		               case 1:
		                       System.out.println("Enter element:");
		                       e=in.nextInt();
		                       obj.insertLeft(e);
		                       break;
		                case 2:
		                       System.out.println("Enter element:");
		                       e=in.nextInt();
		                       obj.insertRight(e);
		                       break;
		                case 3:
		                       obj.deleteLeft();
		                       break;
		                case 4:
		                      obj.deleteRight();
		                       break;  
		                case 5:
		                    obj.printList();
		                    break;
		                case 6:
		                    obj.printRevList();
		                    break;
		                default:
		                    System.out.println("Wrong option");
		                    break;
		                case 0:
		                    System.out.println("Exiting ");
		                    break;
		                    
		           }        
		           }while(ch!=0);
		        
		        }    
		    }

