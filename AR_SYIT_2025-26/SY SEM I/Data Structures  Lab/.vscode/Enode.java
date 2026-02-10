import java.util.*;

public class Enode {
		int data;
		Node prev,next;
		Node(int data){
			this.data = data;
			this.prev=null;
			this.next=null;
		}
	
}
 class DoubllyLinkedList {
	Node temp,head;
	public void insertBeg(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev=newNode;
		head = newNode;
	}
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	public void insertPos(int data,int pos) {
		if(pos<1) {
			System.out.println("Invalid");
			return;
		}
		if(pos == 1) {
			insertBeg(data);
		}
		Node newNode = new Node(data);
		temp = head;
		for(int i =1;i<pos && temp!=null;i++) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Out Of Range");
		}
		newNode.next = temp.next;
		newNode.prev = temp;
		if(temp.next != null) {
			temp.next.prev = newNode;
		}
		temp.next = newNode;
	}
	public void deleteBeg() {
		if(head == null) {
			return;
		}
		head = head.next;
		if(head != null) {
			head.prev = null;
		}
	}
	public void deleteEnd() {
		if(head == null) return;
		if(head.next == null) {
			head = null;
			return;
		}
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}
	public void deletePos(int pos) {
		if(head == null || pos <1) {
			System.out.println("Invalid or Empty");
			return;
		}
		if(pos == 1) {
			deleteBeg();
		}
		temp = head;
		for(int j = 1;j<pos && temp !=null;j++) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Out of range");
		}
		if(temp.prev != null) {
			temp.prev.next = null;
		}
		if(temp.next != null) {
			temp.next.prev = null;
		}
	}
	public void display() {
		temp = head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int search(int target) {
		Node current = head;
        int pos = 1;
        while (current != null) {
            if (current.data == target)
                return pos;
            current = current.next;
            pos++;
        }
        return -1;
	}

	public static void main(String[] args) {
		
		DoubllyLinkedList list = new DoubllyLinkedList();
		Scanner sc = new Scanner(System.in);
		int data,pos,ch,target;
		do {
			System.out.println("1.Insert at beginning");
			System.out.println("2.Insert at end");
			System.out.println("3.Insert at position");
			System.out.println("4.Delete at beginning");
			System.out.println("5.Delete at end");
			System.out.println("6.Delete at position");
			System.out.println("7.Display");
			System.out.println("8.Search");
			System.out.println("9.Exit");
			System.out.println("Enter choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Data:");
				data = sc.nextInt();
				list.insertBeg(data);
				break;
			case 2:
				System.out.println("Data:");
				data = sc.nextInt();
				list.insertEnd(data);
				break;
			case 3:
				System.out.println("Data and Position:");
				data = sc.nextInt();
				pos = sc.nextInt();
				list.insertPos(data,pos);
				break;
			case 4:
				list.deleteBeg();
				break;
			case 5:
				list.deleteEnd();
				break;
			case 6:
				System.out.println("Position:");
				pos = sc.nextInt();
				list.deletePos(pos);
				break;
			case 7:
				list.display();
				break;
			case 8:
				System.out.println("Target:");
				target = sc.nextInt();
				System.out.println("Target is found at index"+list.search(target));
			}
		}while(ch != 9);
		
	}

}