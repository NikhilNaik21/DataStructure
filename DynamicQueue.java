package Day2LinkedList;

import java.util.Scanner;

public class Dynamic_Queue_Example 
{
 Node front,rear;   
  void createQueue()
  {
      front=rear=null;
  }
 
  void Dequeue()
  {
      if(front==null)
          System.out.println("Empty Queue");
      else
      {
          Node t=front;
          front=front.next;
          System.out.println(t.data+" Dequeued");
      }
  }
  void Enqueue(int e)
  {   Node n=new Node(e);
      if(rear==null)
      {
          front=rear=n;
      }
      else
      {   
    	  rear.next = n;
    	  rear=n;
          System.out.println("Enqueued");
      }
  }

  
  void printQueue()
  {   if(front==null)
          System.out.println("Empty list");
      else
      {   Node t=front;//1
          while(t !=null)//2
          {
              System.out.print(t.data+"|->");
              t=t.next;
          }
      }
  }   
  
  
  
  
  
  public static void main(String args[])
  {
      int ch,e;
      Dynamic_Queue_Example obj=new Dynamic_Queue_Example();
      Scanner in=new Scanner(System.in);
      do
      {
         System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print All\n0.Exit\n:");
         ch=in.nextInt();
         switch(ch)
         {
             case 1:
                     System.out.println("Enter element:");
                     e=in.nextInt();
                     obj.Enqueue(e);
                     break;
              case 2:
                     System.out.println("Enter element:");
                     e=in.nextInt();
                     obj.Dequeue();
                     break;
              case 3:
                     obj.printQueue();
                     break;
              default:
                  System.out.println("Wrong option");
                  break;
              case 0:
                  System.out.println("Exiting ");
                  break;
                  
         }//switch         
         }while(ch!=0);
      
      }      
  }
