import java.util.*;
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next  = null;
        this.prev = null;
    }
}
class linkedlist
{
    Node head, temp;
    void insertAtBeginning(int data)
    {
        Node n1 = new Node(data);
        if(head == null)
        {
            head = n1;
            return;
        }
        n1.next = head;
        head.prev = n1;
        head = n1;
    }

    void insertAtEnd(int data)
    {
        Node n1 = new Node(data);
        if(head == null)
        {
            head = n1;
            return;
        }
        temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        temp.next = n1;
        n1.prev = temp;
    }

    void insertAtPosition(int data, int pos)
    {
        if(pos < 1)
        {
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1)
        {
            insertAtBeginning(data);
            return;
        }
        Node n1 = new Node(data);
        temp = head;
        while (temp != null) 
        {
            temp = temp.next;
        }
        if(temp == null)
        {
            System.out.println("Invalid position");
        }

        n1.next = temp.next;
        n1.prev = temp;
        if(temp.next != null)
        {
            temp.next.prev = n1;
        }
        temp.next = n1;
    }

    void deleteAtBeginning()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head != null)
        {
            head.prev = null;
        }

    }

    void deleteAtEnd()
    {
        if(head == null)
        {
            return;
        }
            if(head.next != null)
            {
                head = null;
                return;
            }
            temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.prev.next = null;
    }
    void deleteAtPosition(int pos)
    {
        if(pos < 1 || head == null)
        {
            System.out.println("Invalid position!");
            return;
        }
        if(pos == 1)
        {
            deleteAtBeginning();
            return;
        }
        temp = head;
        int count = 1;
        while (temp != null && count < pos) 
        {
            temp = temp.next;
            count ++; 
        }
        if (temp == null) 
        {
            System.out.println("Out of Range");
            return;
        }
        if(temp.prev != null)
        {
            temp.prev.next = temp.next;
        }
        if (temp.next!= null) 
        {
            temp.next.prev = temp.prev;
            
        }
    }

    void display()
    {
        
    }
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        linkedlist li = new linkedlist();
        int choice;
        do
        {
            System.out.println("Menu\n");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Delete at the beginning");
            System.out.println("5. Delete at the end");
            System.out.println("6. Delete at a specific position");
            System.out.println("7. Display the list");
            System.out.println("8. Exit");
            System.out.println("Enter your Choice :");
            choice = sc.nextInt();


            switch(choice)
            {
                int data, pos;

                case 1:
                System.out.println("Enter the data to be inserted");
                data = sc.nextInt();
                li.insertAtBeginning(data);
                break;

                case 2 :
                System.out.println("Enter the data to be inserted");
                data = sc.nextInt();
                li.insertAtEnd(data);
                break;

                case 3:
                System.out.println("Enter the data to be inserted");
                System.out.println("Enter the position");
                data = sc.nextInt();
                pos = sc.nextInt();
                li.insertAtPosition(data, pos);
                break;

                case 4:
                li.deleteAtBeginning();
                break;

                case 5:
                li.deleteAtEnd();
                break;

                case 6:
                System.out.println("Enter the position");
                pos = sc.nextInt();
                li.deleteAtPosition(pos);
                break;

                case 7:
                li.display();
                break;

                case 8 :
                exit(0);
                break;


            }
        }while(choice != 8);
    }
}