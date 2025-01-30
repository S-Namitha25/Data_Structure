class Node {                            // classNode
	int data;
	Node next;
	 Node(int data) {                   // constructor - 1
		this.data=data;
		this.next=null;
	}
}
class LinkedList {
	Node head,tail;
	public void insert(int data) {         // insert node
		Node newNode=new Node(data);
		//newNode.next=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void insertAtEnd () {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class Main {                                 // 3rd
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.insert(100);          
		link.insert(200);
		link.insert(300);
		link.insert(500);
		link.insertAtEnd();
	}
}

