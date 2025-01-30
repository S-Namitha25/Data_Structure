class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DLL{
    Node head,tail;
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
        if(temp.next!=null){
            System.out.print("<->");
        }
        temp=temp.next;
        }
        System.out.println();
    }
    
}
class Main{
    public static void main(String[] args){
        DLL doubly=new DLL();
        doubly.insertAtEnd(100);
        doubly.insertAtEnd(200);
        doubly.insertAtEnd(300);
        doubly.display();
    }
}
