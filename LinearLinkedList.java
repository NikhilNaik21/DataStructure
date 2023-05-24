class Node
{
    int data;
    Node next;
    Node(int e)
    {
        data=e;
        next=null;
    }
}

public class LinearLinkedList 
{
  Node root;   
  void createLinkedList()
  {
      root=null;
  }
  void insertLeft(int e)
  {
      Node n=new Node(e);
      if(root==null)
          root=n;//only for 1st
      else
      {
          n.next=root;//1
          root=n;//2
          System.out.println("inserted");
      }
  }
  void deleteLeft()
  {
      if(root==null)
          System.out.println("Empty List");
      else
      {
          Node t=root;
          root=root.next;
          System.out.println(t.data+" deleted");
      }
  }
  void insertRight(int e)
  {   Node n=new Node(e);
      if(root==null)
          root=n;//only for 1st
      else
      {   Node t=root;//1
          while(t.next!=null)//2
             t=t.next;
          t.next=n;//3
          System.out.println("inserted");
      }
  }
  void deleteRight()
  {
      if(root==null)
          System.out.println("Empty List");
      else
      {
          Node t=root;
          Node t2=root;
          while(t.next!=null)
          {
              t2=t;
              t=t.next;
          }
          if(t==root)
            root=null;
          else
            t2.next=null;
          System.out.println(t.data+" deleted");
      }
  }
  
  void printList()
  {   if(root==null)
          System.out.println("Empty list");
      else
      {   Node t=root;//1
          while(t !=null)//2
          {
              System.out.print(t.data+"|->");
              t=t.next;
          }
      }
  }
  void searchList(int key)
  {   if(root==null)
          System.out.println("Empty list");
      else
      {   Node t=root;//1
          while(t!=null && t.data!=key)//2
          {t=t.next;
          }
          if(t==null)
              System.out.println("Not found");
          else
              System.out.println("Found");
      }
  }
  void deleteElement(int element)
  {   if(root==null)
          System.out.println("Empty list");
      else
      {   Node t=root;//1
          Node t2=t;//1
          while(t!=null && t.data!=element)//2
          {
              t2=t;
              t=t.next;
          }
          if(t==null)
              System.out.println("Not found");
          else
          {
              System.out.println("Found");
              if(t==root)//left most
              {
                  root=root.next;
              }
              else if(t.next==null)//right most
              {
               t2.next=null;
              }
              else//in between deleteion
              {
                  t2.next=t.next;
              }
              System.out.println(t.data+"deleted");
          }
        }
  }
  void insertAt(int e,int index)
  {
      if(root==null)
          System.out.println("Empty list");
      else
      {
          Node n=new Node(e);
          if(index==0)//before root
          {
              n.next=root;
              root=n;
          }
          else
          {
              Node t=root;
              while(t!=null && index>1)
              {
                  index--;
                  t=t.next;
              }
              if(t==null)
                  System.out.println("Index out of range");
              else
              {
                  n.next=t.next;
                  t.next=n;
              }
          }
      }
  }
  public static void main(String args[])
    {
        int ch,e;
        LinearLinkedList obj=new LinearLinkedList();
        Scanner in=new Scanner(System.in);
        obj.createLinkedList();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.Search\n7.Delete Element\n8.Insert At\n0.Exit\n:");
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
                    System.out.println("Enter element:");
                    e=in.nextInt();
                    obj.searchList(e);
                    break;
                case 7:
                    System.out.println("Enter element:");
                    e=in.nextInt();
                    obj.deleteElement(e);
                    break;
                case 8:
                    System.out.println("Enter element:");
                    e=in.nextInt();
                    System.out.println("Enter index:");
                    int index=in.nextInt();
                    obj.insertAt(e,index);
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
  
  
  
  
  
  
  
  
